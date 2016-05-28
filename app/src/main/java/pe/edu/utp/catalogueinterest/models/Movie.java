package pe.edu.utp.catalogueinterest.models;

/**
 * Created by rojasleón on 24/05/2016.
 */

public class Movie {
    String movieName;
    String imageUrl;
    String synopsis;

    public Movie(String movieName, String imageUrl, String synopsis) {
        this.movieName = movieName;
        this.imageUrl = imageUrl;
        this.synopsis = synopsis;
    }
}
