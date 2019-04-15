package com.anncode.amazonviewer.model;

public class Movie extends Film {

    private int id;
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, int year) {
        super(title, genre, creator, duration);
        setYear((short)year);
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


}
