package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.*;

@Entity
@Table (name = "customer")
public class customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customer_id;
    private int store_id;
    private String first_name;
    private String last_name;
   // private String email;
    private int address_id;

    public customer(int customer_id, int store_id, String first_name, String last_name, int adress_id) {
        this.customer_id = customer_id;
        this.store_id = store_id;
        this.first_name = first_name;
        this.last_name = last_name;
       // this.email = email;
        this.address_id = adress_id;
    }

    public customer() {

    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
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
/*
    public String getEmail() {
        return email;
    }
    */
/*
    public void setEmail(String email) {
        this.email = email;
    }
*/
    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }
}