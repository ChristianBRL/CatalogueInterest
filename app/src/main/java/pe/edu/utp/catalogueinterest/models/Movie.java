package pe.edu.utp.catalogueinterest.models;

/**
 * Created by rojasleón on 24/05/2016.
 */

public class Movie {
    String movieName;
    String imageUrl;
    String Synopsis;

    public Movie(String movieName, String imageUrl, String Synopsis) {
        this.movieName = movieName;
        this.imageUrl = imageUrl;
        this.Synopsis = Synopsis;
    }
}
