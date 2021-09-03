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
import sen.calfit.mobileapps.comsen.cat.com.activities.ReceptaBBDD3;
import sen.calfit.mobileapps.comsen.cat.com.activities.Rpostres;


public class ReceptesRecyclerViewAdapter3 extends RecyclerView.Adapter<ReceptesRecyclerViewAdapter3.ViewHolder> {
    private Rpostres rpostres;

    public ReceptesRecyclerViewAdapter3 (ReceptaBBDD3 receptaBBDD3, Rpostres rpostres) {
        this.rpostres = rpostres;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView thumbnail2;
        public TextView titol2;
        public TextView duracio2;
        public TextView descripcio2;
        public TextView valoracio2;
        private ItemClickListener3 clickListener3;


        public ViewHolder (View itemView) {
            super(itemView);
            thumbnail2 = itemView.findViewById(R.id.image_thumbnail);
            titol2 = itemView.findViewById(R.id.textView_titol);
            duracio2 = itemView.findViewById(R.id.textView_duracio);
            descripcio2 = itemView.findViewById(R.id.textView_descripcio);
            valoracio2 = itemView.findViewById(R.id.textView_valoracio);

            itemView.setOnClickListener(this);
        }

        public void setClickListener (ItemClickListener3 itemClickListener3) {
            this.clickListener3 = itemClickListener3;
        }

        @Override
        public void onClick (View view) {
            clickListener3.onClick(view, getPosition());
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list3_item_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder (ViewHolder holder, int position) {
        Glide.with(rpostres.getBaseContext()).load(ReceptaBBDD3.getRecepta(position).getThumbnail()).into(holder.thumbnail2);
        holder.titol2.setText(ReceptaBBDD3.getRecepta(position).getTitle());
        holder.duracio2.setText("Duración: " + ReceptaBBDD3.getRecepta(position).getDuracioTotal() + " min.");
        holder.descripcio2.setText(ReceptaBBDD3.getRecepta(position).getDescripcio());
        holder.valoracio2.setText("" + ReceptaBBDD3.getRecepta(position).getValoracio() + "/5");

        holder.setClickListener(new ItemClickListener3() {
            @Override
            public void onClick (View view, int position) {
                rpostres.viewRecepta(position);
            }
        });
    }

    @Override
    public int getItemCount () {
        return ReceptaBBDD3.getDataSize();
    }
}



