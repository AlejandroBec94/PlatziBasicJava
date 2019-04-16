package com.anncode.amazonviewer.model;

import java.util.ArrayList;

public class Movie extends Film {

    private int id;
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, int year) {
        super(title, genre, creator, duration);
        setYear((short) year);
    }

    public int getId() {
        return id;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitle() +
                "\nGenero: " + getGenre() +
                "\nAño: " + getYear();
    }

    public static ArrayList<Movie> makeMovieList() {

        ArrayList<Movie> movies = new ArrayList();

        for (int i = 1; i <= 5; i++) {
            movies.add(new Movie("Movie " + i, "Genero " + i, "Bec", 120+i, 2018));
        }
        return movies;

    }


}
