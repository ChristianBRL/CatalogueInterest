package pe.edu.utp.catalogueinterest.models;

import android.content.Intent;
import android.nfc.cardemulation.CardEmulation;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import pe.edu.utp.catalogueinterest.R;
import pe.edu.utp.catalogueinterest.activities.MoviesCatalogActivity;
import pe.edu.utp.catalogueinterest.activities.MovieDetailActivity;

import java.util.ArrayList;

/**
 * Created by rojasleón on 24/05/2016.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {
    private ArrayList<Movie> movies;

    public MoviesAdapter(ArrayList<Movie> movies){
        this.movies = movies;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView nameTextView;
        ImageView pictureImageView;
        CardView movieCard;

        public ViewHolder(View itemView){
            super(itemView);
            movieCard = (CardView) itemView.findViewById(R.id.movie_card);
            nameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            pictureImageView = (ImageView) itemView.findViewById(R.id.pictureImageView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_card, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.nameTextView.setText(movies.get(position).movieName);
        holder.pictureImageView.setImageResource(
                Integer.parseInt(movies.get(position).imageUrl));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.printf("Selected position: %d%n", position);
                Intent itemIntent = new Intent(view.getContext(), MovieDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("movieName", movies.get(position).movieName);
                bundle.putString("imageUrl", movies.get(position).imageUrl);
                bundle.putString("Synopsis", movies.get(position).Synopsis);
                itemIntent.putExtras(bundle);
                view.getContext().startActivity(itemIntent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return movies.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
