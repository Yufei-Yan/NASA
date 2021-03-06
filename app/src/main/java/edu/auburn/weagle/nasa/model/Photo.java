package edu.auburn.weagle.nasa.model;

import java.io.Serializable;

/**
 * photo model
 * Author: Gary
 * Time: 17/2/4
 */

public class Photo implements Serializable{
    private int id;
    private int sol;
    private String earth_date;
    private String img_src;
    private Camera camera;
    private Rover rover;

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public String getEarth_date() {
        return earth_date;
    }

    public void setEarth_date(String earth_date) {
        this.earth_date = earth_date;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", sol=" + sol +
                ", earth_date='" + earth_date + '\'' +
                ", img_src='" + img_src + '\'' +
                ", camera=" + camera +
                '}';
    }
}
