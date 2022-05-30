package com.spring.spring_project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Edin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String imgsrc;
    private String WorkingDay;
    private String TrainingTime;


    public String getWorkingDay() {
        return WorkingDay;
    }

    public void setWorkingDay(String workingDay) {
        WorkingDay = workingDay;
    }

    public String getTrainingTime() {
        return TrainingTime;
    }

    public void setTrainingTime(String trainingTime) {
        TrainingTime = trainingTime;
    }

    private String description;

    public Edin() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Edin(long id, String title, String imgsrc, String workingDay, String trainingTime, String description) {
        this.id = id;
        this.title = title;
        this.imgsrc = imgsrc;
        WorkingDay = workingDay;
        TrainingTime = trainingTime;
        this.description = description;
    }

}
