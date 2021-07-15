package com.dynamicdevs.pokedexapp.view.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dynamicdevs.pokedexapp.databinding.PokeListItemBinding;
import com.dynamicdevs.pokedexapp.model.data.Datum;

import java.util.ArrayList;
import java.util.List;

public class PokeAdapter extends RecyclerView.Adapter<PokeAdapter.PokeViewHolder> {

    private PokeAdapter.PokeDelegate delgate;

 public interface PokeDelegate {
     void selectImage(String url);
 }

    public PokeAdapter(PokeAdapter.PokeDelegate delegate) {
        this.delgate = delegate;
    }

    @NonNull
    @Override
    public PokeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PokeListItemBinding binding = PokeListItemBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );
        return new PokeViewHolder(binding);
    }

    private List<Datum> results = new ArrayList<>();

    public void setResults(List<Datum> results) throws NullPointerException {
        this.results = results;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull PokeAdapter.PokeViewHolder holder, int position) {
        Datum result = results.get(position);

        Glide.with(holder.itemView)
                .applyDefaultRequestOptions(RequestOptions.centerCropTransform())
                .load(result.getImages().getLarge())
                .into(holder.binding.posterImageview);

        if (result.getEvolvesFrom() != null) {
            holder.binding.synopsisTextview.setText(result.getName() + " evolves from "
                    + result.getEvolvesFrom() + ".\n");
        } else {
            holder.binding.synopsisTextview.setText(result.getName() + " is a first stage pokemon.\n");
        }
        if (result.getFlavorText() != null) {
            holder.binding.synopsisTextview.setText(holder.binding.synopsisTextview.getText()
                    + "Description: " + result.getFlavorText() + "\n"
                    + "Types: ");
        } else {
            holder.binding.synopsisTextview.setText(holder.binding.synopsisTextview.getText()
                    + "Types: ");
        }
        for (int i = 0; i < result.getTypes().size(); i++) {
            holder.binding.synopsisTextview.setText(holder.binding.synopsisTextview.getText() + "" + result.getTypes().get(i) + " ");
        }
        holder.binding.titleTextview.setText(result.getName());

        holder.binding.posterImageview.setOnClickListener(view ->{
            delgate.selectImage(result.getImages().getLarge());
        });

    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    class PokeViewHolder extends RecyclerView.ViewHolder {
        //        ImageView poster;
        PokeListItemBinding binding;

        public PokeViewHolder(PokeListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
//            poster = itemView.findViewById(R.id.poster_imageview);
        }
    }

}
