package com.example.foodapp;

import java.io.Serializable;

public class FoodModel implements Serializable {
    private String name;
    private String time;
    private String preparation;
    private int foodImage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public FoodModel(String name, String time, String preparation, int foodImage) {
        this.name = name;
        this.time = time;
        this.foodImage = foodImage;
        this.preparation = preparation;


    }
}
