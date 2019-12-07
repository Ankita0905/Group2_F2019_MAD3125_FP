package com.example.group2_f2019_mad3125_fp.model.employee;


import com.example.group2_f2019_mad3125_fp.model.vehicle.Vehicle;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employee implements Serializable {

    private String name;
    private int age;
    private Vehicle vehicle;
    private String employee;
    private int employeeId;
    private String vehicleType;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Employee()
    {

    }
    public Employee(String eName,String eType)
    {
      this.name=eName;
      this.employee=eType;
    }


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCalBirthYear(int age)
    {
        this.age = age;
    }

    public int getCalBirthYear()
    {
        Calendar now = new GregorianCalendar();
        return now.getWeekYear() - age;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public  double calEarnings()
    {
      return 1000;
    }

    public void printMyData()
    {

    }

}

