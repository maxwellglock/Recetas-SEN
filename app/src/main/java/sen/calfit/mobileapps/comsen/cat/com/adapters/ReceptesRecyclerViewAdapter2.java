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
import sen.calfit.mobileapps.comsen.cat.com.activities.ReceptaBBDD2;
import sen.calfit.mobileapps.comsen.cat.com.activities.Rvegan;


public class ReceptesRecyclerViewAdapter2 extends RecyclerView.Adapter<ReceptesRecyclerViewAdapter2.ViewHolder> {
    private Rvegan rvegan;

    public ReceptesRecyclerViewAdapter2 (ReceptaBBDD2 receptaBBDD2, Rvegan rvegan) {
        this.rvegan = rvegan;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView thumbnail2;
        public TextView titol2;
        public TextView duracio2;
        public TextView descripcio2;
        public TextView valoracio2;
        private ItemClickListener2 clickListener2;


        public ViewHolder (View itemView) {
            super(itemView);
            thumbnail2 = itemView.findViewById(R.id.image_thumbnail);
            titol2 = itemView.findViewById(R.id.textView_titol);
            duracio2 = itemView.findViewById(R.id.textView_duracio);
            descripcio2 = itemView.findViewById(R.id.textView_descripcio);
            valoracio2 = itemView.findViewById(R.id.textView_valoracio);

            itemView.setOnClickListener(this);
        }

        public void setClickListener (ItemClickListener2 itemClickListener2) {
            this.clickListener2 = itemClickListener2;
        }

        @Override
        public void onClick (View view) {
            clickListener2.onClick(view, getPosition());
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list2_item_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder (ViewHolder holder, int position) {
        Glide.with(rvegan.getBaseContext()).load(ReceptaBBDD2.getRecepta(position).getThumbnail()).into(holder.thumbnail2);
        holder.titol2.setText(ReceptaBBDD2.getRecepta(position).getTitle());
        holder.duracio2.setText("Duración: " + ReceptaBBDD2.getRecepta(position).getDuracioTotal() + " min.");
        holder.descripcio2.setText(ReceptaBBDD2.getRecepta(position).getDescripcio());
        holder.valoracio2.setText("" + ReceptaBBDD2.getRecepta(position).getValoracio() + "/5");

        holder.setClickListener(new ItemClickListener2() {
            @Override
            public void onClick (View view, int position) {
                rvegan.viewRecepta(position);
            }
        });
    }

    @Override
    public int getItemCount () {
        return ReceptaBBDD2.getDataSize();
    }
}



