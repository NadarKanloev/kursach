package com.spring.spring_project.models;

import javax.persistence.*;

@Entity
public class Trenera {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Name;
    private String Program;
    private String imgsrc;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getProgram() {
        return Program;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setProgram(String program) {
        Program = program;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public Trenera() {
    }

    public Trenera(String name, String program, String imgsrc) {
        Name = name;
        Program = program;
        this.imgsrc = imgsrc;
    }

    public Trenera(String name, String program, String imgsrc, String description) {
        Name = name;
        Program = program;
        this.imgsrc = imgsrc;
        this.description = description;
    }
}
