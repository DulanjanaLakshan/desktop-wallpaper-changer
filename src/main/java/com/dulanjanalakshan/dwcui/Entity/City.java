package com.dulanjanalakshan.dwcui.Entity;

public class City {
    private String name;
    private String imgSrc;
    private int nbDays;
    private int price;

    public City() {
    }

    public City(String name, String imgSrc, int nbDays, int price) {
        this.name = name;
        this.imgSrc = imgSrc;
        this.nbDays = nbDays;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public int getNbDays() {
        return nbDays;
    }

    public void setNbDays(int nbDays) {
        this.nbDays = nbDays;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
