package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.*;

@Entity
@Table (name = "staff")
public class staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String first_name;
    private String last_name;
    private int address_id;
    private int store_id;
    private String username;

    public staff(String first_name, String last_name, int address_id, int store_id, String username) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address_id = address_id;
        this.store_id=store_id;
        this.username=username;
    }

    public staff() {

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }
    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}