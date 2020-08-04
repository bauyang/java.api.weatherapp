package com.tts.weatherapp.model;


import javax.persistence.*;

@Entity
public class ZipCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique=true)
    private String zip;


    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ZipCode{" +
                "id=" + id +
                ", zip='" + zip + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public ZipCode() {
    }

    public ZipCode(String zip) {
        this.zip = zip;
    }
}