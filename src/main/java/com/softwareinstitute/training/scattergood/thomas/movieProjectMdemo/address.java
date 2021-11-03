package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.*;

@Entity
@Table (name = "address")
public class address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int address_id;
    private String address;
    private String district;
    private int city_id;
   // private String postal_code;
   // private String phone;

    public address(int address_id, String address, String district, int city_id){
        this.address_id=address_id;
        this.address=address;
        this.district=district;
        this.city_id=city_id;
       // this.postal_code=postal_code;
       // this.phone=phone;
    }

    public address(){

    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrct() {
        return district;
    }

    public void setDistrct(String distrct) {
        this.district = district;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

/*    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }   */
}
