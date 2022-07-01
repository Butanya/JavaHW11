package ru.netology.movie;

public class MovieChoice {
    private int id;
    private String name;
    private String genre;
    private int year;
    private int dateOfRelease;

    public MovieChoice() {
    }

    public MovieChoice(int id, String name, String genre, int year, int dateOfRelease) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.dateOfRelease = dateOfRelease;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(int dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }
}
