package com.spring.spring_project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String FullName;
    private String NUmber;
    private String email;
    public String Section;

    public Customer(String fullName, String NUmber, String email, String section) {
        FullName = fullName;
        this.NUmber = NUmber;
        this.email = email;
        Section = section;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }

    public Customer() {
    }

    public Customer(String fullName, String NUmber, String email) {
        FullName = fullName;
        this.NUmber = NUmber;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getNUmber() {
        return NUmber;
    }

    public void setNUmber(String NUmber) {
        this.NUmber = NUmber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
