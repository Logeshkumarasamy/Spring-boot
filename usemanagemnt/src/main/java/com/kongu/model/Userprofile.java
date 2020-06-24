package com.kongu.model;


import javax.persistence.*;

@Entity
public class Userprofile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String FirstName;
    private  String Lastname;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
