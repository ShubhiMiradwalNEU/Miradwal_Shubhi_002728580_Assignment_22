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
public class Doctor {
    String name;
    String city;
    String hospitalName;
    int contactInfo;

   
    public Doctor(String name, String city, String hospitalName, int contactInfo) {
        this.name = name;
        this.city = city;
        this.hospitalName = hospitalName;
        this.contactInfo = contactInfo;
    }

    public Doctor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     static List<Doctor> doctordirectory= new ArrayList<Doctor>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(int contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Doctor{" + "name=" + name + ", city=" + city + ", hospitalName=" + hospitalName + ", contactInfo=" + contactInfo + '}';
    }    
    
    public void  addnewdoctor(String userName, String password, String userType, String name, int age, String gender, String address, String city) 
    {
      //  doctordirectory.add(new Doctor(userName, password, userType,name,age,gender,address,city));
        //return persondirectory;
           }
}
