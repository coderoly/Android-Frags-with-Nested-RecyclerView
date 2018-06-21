package io.github.coderoly.fragswithnestedlists.objects;


import java.util.ArrayList;

public class Date {
    private String date;
    ArrayList<Movie> movies;


    public Date(String date, ArrayList<Movie> movies) {
        this.date = date;
        this.movies = movies;
    }

    public String getDate() {
        return date;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }


}