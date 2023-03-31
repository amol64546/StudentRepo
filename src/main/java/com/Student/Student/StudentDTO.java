package com.Student.Student;


public class StudentDTO {
    private String name;

    private String dob;

    private String major;

    private String address;

    public StudentDTO(String name, String dob, String major, String address) {
        this.name = name;
        this.dob = dob;
        this.major = major;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
