package pe.edu.utp.catalogueinterest.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import pe.edu.utp.catalogueinterest.R;

/**
 * Created by rojasleón on 24/05/2016.
 */

public class MovieDetailActivity extends AppCompatActivity {
    TextView nameTextView;
    ImageView pictureImageView;
    Button backButton;
    TextView synopsisBioTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        Bundle bundle = getIntent().getExtras();
        nameTextView = (TextView) findViewById(R.id.nameTextView);
        pictureImageView = (ImageView) findViewById(R.id.pictureImageView);
        nameTextView.setText(bundle.getString("movieName"));
        synopsisBioTextView = (TextView) findViewById(R.id.synopsisBioTextView);
        synopsisBioTextView.setText(bundle.getString("Synopsis"));
        pictureImageView.setImageResource(Integer.parseInt(bundle.getString("imageUrl")));
        backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
//        findViewById(R.id.backButton).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(ItemActivity.this, CatalogActivity.class));
//            }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_movie_detail, menu);
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
}
