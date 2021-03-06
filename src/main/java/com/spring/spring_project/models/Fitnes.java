package com.spring.spring_project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fitnes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String title;
    private String imgsrc;
    private String WorkingDay;
    private String TrainingTime;
    private String Solo;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Fitnes() {
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

    public String getSolo() {
        return Solo;
    }

    public void setSolo(String solo) {
        Solo = solo;
    }
}
