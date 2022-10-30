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
    String community;
    
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
    public PatientAppointment(String name, String doctorName, String community, int age) {
        this.name = name;
        this.doctorName = doctorName;
        this.community = community;
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

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
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
