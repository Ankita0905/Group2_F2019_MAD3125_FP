package com.example.group2_f2019_mad3125_fp.model.vehicle;

import java.io.Serializable;

public abstract class Vehicle implements Serializable {

    private String company;
    private String plate;
    private String colour;
    private int year;
    String VType;

    public Vehicle()
    {

    }

    public Vehicle(String company, String plate, String colour, int year,String vType) {
        this.company = company;
        this.plate = plate;
        this.colour = colour;
        this.year = year;
        this.VType=vType;
    }

    public String getVType()
    {
        return VType;
    }

    public void setVType(String VType)
    {
        this.VType = VType;
    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public abstract void Vehicle();

    public void printMyData()
    {

    }

}
