package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.*;

@Entity
@Table (name = "staff")
public class staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int staff_id;
    private String first_name;
    private String last_name;
    private int address_id;
    private String email;
    private int store_id;
    private String username;

    public staff(int staff_id, String first_name, String last_name, int address_id, String email, int store_id, String username) {
        this.staff_id = staff_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address_id = address_id;
        this.email=email;
        this.store_id=store_id;
        this.username=username;
    }

    public staff() {

    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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