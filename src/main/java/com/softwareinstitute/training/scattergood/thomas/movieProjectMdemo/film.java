package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "film")
public class film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int film_id;

    private String title;
    private int runtime;
    private String genre;
    private double rental_rate;

    public film(String title, int runtime, String genre, double rental_rate) {
        this.title = title;
        this.runtime = runtime;
        this.genre = genre;
        this.rental_rate = rental_rate;
    }

    public film() {

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

    public double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public int getfilm_id() {
        return film_id;
    }

    public void setfilm_id(int film_id) {
        this.film_id = film_id;
    }
}


    /*  public String getJsonObjectOffilm(){
        return "{"+
                "\"title\" : \" " + title + "\"," +
                "\"runtime\" : \" " + runtime + "\", " +
                "\"genre\" : \" " + genre + "\"" +
                "\"rental rate\" : \" " + rental_rate + "\"" +
                "}";
    }   */

