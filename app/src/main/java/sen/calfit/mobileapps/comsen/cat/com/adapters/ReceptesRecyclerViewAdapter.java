package sen.calfit.mobileapps.comsen.cat.com.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import sen.calfit.mobileapps.comsen.cat.com.R;
import sen.calfit.mobileapps.comsen.cat.com.activities.ReceptaBBDD;
import sen.calfit.mobileapps.comsen.cat.com.activities.Rfit;


public class ReceptesRecyclerViewAdapter extends RecyclerView.Adapter<ReceptesRecyclerViewAdapter.ViewHolder> {
    private Rfit rfit;

    public ReceptesRecyclerViewAdapter (ReceptaBBDD receptaBBDD, Rfit rfit) {
        this.rfit = rfit;

    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView thumbnail;
        public TextView titol;
        public TextView duracio;
        public TextView descripcio;
        public TextView valoracio;
        private ItemClickListener clickListener;


        public ViewHolder (View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.image_thumbnail);
            titol = itemView.findViewById(R.id.textView_titol);
            duracio = itemView.findViewById(R.id.textView_duracio);
            descripcio = itemView.findViewById(R.id.textView_descripcio);
            valoracio = itemView.findViewById(R.id.textView_valoracio);

            itemView.setOnClickListener(this);
        }

        public void setClickListener (ItemClickListener itemClickListener) {
            this.clickListener = itemClickListener;
        }

        @Override
        public void onClick (View view) {
            clickListener.onClick(view, getPosition());
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder (ViewHolder holder, int position) {
        Glide.with(rfit.getBaseContext()).load(ReceptaBBDD.getRecepta(position).getThumbnail()).into(holder.thumbnail);
        holder.titol.setText(ReceptaBBDD.getRecepta(position).getTitle());
        holder.duracio.setText("Duración: " + ReceptaBBDD.getRecepta(position).getDuracioTotal() + " min.");
        holder.descripcio.setText(ReceptaBBDD.getRecepta(position).getDescripcio());
        holder.valoracio.setText("" + ReceptaBBDD.getRecepta(position).getValoracio() + "/5");

        holder.setClickListener(new ItemClickListener() {
            @Override
            public void onClick (View view, int position) {
                rfit.viewRecepta(position);
            }
        });
    }

    @Override
    public int getItemCount () {
        return ReceptaBBDD.getDataSize();
    }


}


