package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;


public class movie {
    private String title;
    private int runtime;
    private String genre;

    public movie(String title, int runtime, String genre){
        this.title=title;
        this.runtime=runtime;
        this.genre=genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getJsonObjectOfMovie(){
        return "{"+
                "\"title\" : \" " + title + "\"," +
                //    "\"runtime\" : \" " + runtime + "\", " +
                "\"genre\" : \" " + genre + "\"" +
                "}";
    }
}

