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
    private int length;
    private double replacement_cost;
    private double rental_rate;

    public film(String title, int length, double replacement_cost, double rental_rate) {
        this.title = title;
        this.length = length;
        this.replacement_cost = replacement_cost;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public double getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public double getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }
/*
    public int getfilm_id() {
        return film_id;
    }

    public void setfilm_id(int film_id) {
        this.film_id = film_id;
    } */
}


    /*  public String getJsonObjectOffilm(){
        return "{"+
                "\"title\" : \" " + title + "\"," +
                "\"runtime\" : \" " + runtime + "\", " +
                "\"genre\" : \" " + genre + "\"" +
                "\"rental rate\" : \" " + rental_rate + "\"" +
                "}";
    }   */

