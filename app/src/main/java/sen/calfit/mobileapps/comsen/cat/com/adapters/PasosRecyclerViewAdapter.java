package sen.calfit.mobileapps.comsen.cat.com.adapters;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.CountDownTimer;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import sen.calfit.mobileapps.comsen.cat.com.R;
import sen.calfit.mobileapps.comsen.cat.com.activities.ReceptaActivity;
import sen.calfit.mobileapps.comsen.cat.com.activities.VideoPlayerActivity;
import sen.calfit.mobileapps.comsen.cat.com.domain.Pas;

public class PasosRecyclerViewAdapter extends RecyclerView.Adapter<PasosRecyclerViewAdapter.PasViewHolder> {
    private ArrayList<Pas> passos;
    private ReceptaActivity receptaActivity;

    public PasosRecyclerViewAdapter(ArrayList<Pas> passos, ReceptaActivity receptaActivity) {
        this.passos = passos;
        this.receptaActivity = receptaActivity;
    }

    public static class PasViewHolder extends RecyclerView.ViewHolder{
        public TextView numero;
        public TextView descripcio;
        private ItemClickListener clickListener;
        public Button playVideo;
        public Button buttonCountdown;
        public TextView countdown;
        public TextView duracio;

        public PasViewHolder(View itemView) {
            super(itemView);
            numero = itemView.findViewById(R.id.textView_numero);
            descripcio = itemView.findViewById(R.id.textView_descripcio_pas);
            playVideo = itemView.findViewById(R.id.button_playvideo);
            buttonCountdown = itemView.findViewById(R.id.button_playtimer);
            countdown = itemView.findViewById(R.id.textView_countdown);
            duracio = itemView.findViewById(R.id.textView_duracio_pas);
        }
    }

    @NonNull
    @Override
    public PasosRecyclerViewAdapter.PasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pasos_item_layout, parent, false);
        PasosRecyclerViewAdapter.PasViewHolder vh = new PasosRecyclerViewAdapter.PasViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final PasosRecyclerViewAdapter.PasViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.numero.setText(""+passos.get(position).getNumero());
        holder.descripcio.setText(passos.get(position).getDescripcio());
        holder.duracio.setText((int)passos.get(position).getDuracio()+" min.");
        final CountDownTimer[] mCountDownTimer = new CountDownTimer[passos.size()];
        final boolean[] mTimerRunning = new boolean[passos.size()];
        final long[] mTimeLeft = new long[passos.size()];

        if(passos.get(position).getVideo()!=null){
            holder.playVideo.setVisibility(View.VISIBLE);
            holder.playVideo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), VideoPlayerActivity.class);
                    intent.putExtra("video", passos.get(position).getVideo());
                    receptaActivity.startActivity(intent);
                }
            });
        }

        if(passos.get(position).getCounter()!=0){
            mTimeLeft[position] = TimeUnit.MINUTES.toMillis(passos.get(position).getCounter());
            holder.buttonCountdown.setVisibility(View.VISIBLE);
            holder.buttonCountdown.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    receptaActivity.sendNotification("Tiempo empezado del paso n??"+passos.get(position).getNumero());
                    if(mTimerRunning[position]==true){
                        pauseTimer();
                        holder.buttonCountdown.setText("COMENZAR TIMER");
                    } else {
                        startTimer();
                        holder.buttonCountdown.setText("PARAR TIMER");
                    }
                    holder.countdown.setVisibility(View.VISIBLE);
                }

                private void pauseTimer() {
                    mCountDownTimer[position].cancel();
                    mTimerRunning[position] = false;
                }

                private void startTimer() {
                    mCountDownTimer[position] = new CountDownTimer(mTimeLeft[position], 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            mTimeLeft[position] = millisUntilFinished;
                            updateCountDownText();
                        }

                        @Override
                        public void onFinish() {
                            receptaActivity.sendNotification("Tiempo terminado del paso n??"+passos.get(position).getNumero());
                        }
                    }.start();

                    mTimerRunning[position] = true;
                }

                private void updateCountDownText() {
                    int minutes = (int) (mTimeLeft[position] / 1000) / 60;
                    int seconds = (int) (mTimeLeft[position] / 1000) % 60;

                    String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
                    holder.countdown.setText(timeLeftFormatted);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return passos.size();
    }
}
