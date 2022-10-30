/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import static model.Patient.patientDirectory;

/**
 *
 * @author user
 */
public class VitalSigns {
    String doctorName;
    String PatientName;
    Double temperature;
    Double bloodPressure;
    String description;
    static public List<VitalSigns> vitalSigns= new ArrayList<VitalSigns>();
    
    public VitalSigns(){
        
    }

    public VitalSigns(String doctorName, String PatientName, Double temperature, Double bloodPressure, String description) {
        this.doctorName = doctorName;
        this.PatientName = PatientName;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.description = description;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

 

    @Override
    public String toString() {
        return "VitalSigns{" + "temperature=" + temperature + ", bloodPressure=" + bloodPressure + '}';
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static List<VitalSigns> getVitalSigns() {
        return vitalSigns;
    }

    public static void setVitalSigns(List<VitalSigns> vitalSigns) {
        VitalSigns.vitalSigns = vitalSigns;
    }
    

    public void  addNewVitalSigns(String doctorName,String PatientName,Double temperature, Double bloodPressure, String description) 
    {
        vitalSigns.add(new VitalSigns(doctorName,PatientName,temperature,bloodPressure,description));
        System.out.println("Vital Signs for Patient Added Successfully !!");
           }
    
    public List<VitalSigns> getList() {
       return vitalSigns;
   }
}
