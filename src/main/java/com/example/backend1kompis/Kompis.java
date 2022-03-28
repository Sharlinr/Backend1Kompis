package com.example.backend1kompis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Entities are objects that map to database tables
@Entity
public class Kompis {

    @Id    //berättar att detta är nyckel-värdet för entiteten
    @GeneratedValue //default, persistence provider bestämmer hur nycklar genereras
    private Long id;
    private String name;
    private String address;

    public Kompis() {
    }

    public Kompis(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format(
                "Kompis[id=%d, name='%s', address='%s']",
                id, name, address);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setId() {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}