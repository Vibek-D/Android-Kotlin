package com.sunusi2sim.mobileattendance;

/**
 * Created by HP USER on 30/04/2016.
 */
public class Courses {
    private String name;
    private String description;
    private int id;

    //Constructor

    public Courses(int id, String name,  String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    //Setter, getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
