/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shubhimiradwal
 */
public class PatientAppointment {
    String name;
    String doctorName;
    String city;
    int age;

   public static List<PatientAppointment> appointment= new ArrayList<PatientAppointment>();

    public static List<PatientAppointment> getAppointment() {
        return appointment;
    }

    public static void setAppointment(List<PatientAppointment> appointment) {
        PatientAppointment.appointment = appointment;
    }
     public PatientAppointment() {
    }
    public PatientAppointment(String name, String doctorName, String city, int age) {
        this.name = name;
        this.doctorName = doctorName;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name;         
      }
    
    
    
}
