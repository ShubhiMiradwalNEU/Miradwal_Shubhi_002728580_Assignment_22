/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import static model.Person.persondirectory;

/**
 *
 * @author shubhimiradwal
 */
public class VitalSigns {
    double temperature;
    double bloodPressure;
    double weight;
    double height;
    
    List<VitalSigns> vitalsign= new ArrayList<VitalSigns>();

    public VitalSigns(double temperature, double bloodPressure, double weight, double height) {
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.weight = weight;
        this.height = height;
    }

    public VitalSigns() {
        
                }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
     public void  addvitalsign(double temperature, double bloodPressure, double weight, double height) 
    {
        vitalsign.add(new VitalSigns(temperature, bloodPressure, weight, height));
    }  
}
