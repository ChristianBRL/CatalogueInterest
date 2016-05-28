package pe.edu.utp.catalogueinterest.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import pe.edu.utp.catalogueinterest.models.Movie;
import pe.edu.utp.catalogueinterest.R;
import pe.edu.utp.catalogueinterest.models.MoviesAdapter;
import java.util.ArrayList;

/**
 * Created by rojasleón on 24/05/2016.
 */

public class MoviesCatalogActivity extends AppCompatActivity {
    private ArrayList<Movie> movies;
    private RecyclerView mMoviesRecyclerView;
    private RecyclerView.Adapter mMoviesAdapter;
    private RecyclerView.LayoutManager mMoviesLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_catalog);
        movies = new ArrayList<>();
        initializeData();
        mMoviesRecyclerView = (RecyclerView) findViewById(R.id.moviesRecyclerView);
        mMoviesRecyclerView.setHasFixedSize(true);
        mMoviesLayoutManager = new LinearLayoutManager(this);
        mMoviesRecyclerView.setLayoutManager(mMoviesLayoutManager);
        mMoviesAdapter = new MoviesAdapter(movies);
        mMoviesRecyclerView.setAdapter(mMoviesAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_movies_catalog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void initializeData() {
        movies = new ArrayList<>();
        movies.add(new Movie("X-Men: Apocalypse", Integer.toString(R.mipmap.ic_xmen_launcher), "Since."));
        movies.add(new Movie("Captain America: Civil War", Integer.toString(R.mipmap.ic_civil_war_launcher), "After."));
        movies.add(new Movie("Big Game", Integer.toString(R.mipmap.ic_big_game_launcher), "Air."));
        movies.add(new Movie("Money Monster", Integer.toString(R.mipmap.ic_maestro_dinero_launcher), "Lee."));


    }


}
