package com.Student.Student;


public class AddressRequestDTO {
    private int rollNo;
    private String address;

    public AddressRequestDTO() {
    }

    public AddressRequestDTO(int rollNo, String address) {
        this.rollNo = rollNo;
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
