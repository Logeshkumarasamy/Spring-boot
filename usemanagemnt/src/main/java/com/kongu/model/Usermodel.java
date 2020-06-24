package com.kongu.model;

import javax.persistence.*;

@Entity
public class Usermodel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToOne
    private Userprofile Userprofile;
    private String username;
    private String password;
    private boolean Isadmin;
    private boolean Enabled;
    private boolean IsConfirmed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsadmin() {
        return Isadmin;
    }

    public void setIsadmin(boolean isadmin) {
        Isadmin = isadmin;
    }

    public boolean isEnabled() {
        return Enabled;
    }

    public void setEnabled(boolean enabled) {
        Enabled = enabled;
    }

    public boolean isConfirmed() {
        return IsConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        IsConfirmed = confirmed;
    }

    protected Usermodel(){

    }

}



