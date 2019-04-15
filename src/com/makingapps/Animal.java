package com.makingapps;

public class Animal {

    private String name;
    private double height;
    private int weight;
    private String sound;
    private int speed;
    private boolean canFly;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != ""){
            this.name = name;
        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0 ) {
            this.speed = speed;
        }
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        if (sound != "") {
            this.sound = sound;
        }
    }
}
