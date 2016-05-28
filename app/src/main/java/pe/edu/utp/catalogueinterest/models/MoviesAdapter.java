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
 * Created by Usuario on 27/05/2016.
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
        }
    }
}