package com.by.bharadwaj.pojo;

public class Contact {

    private String firstName;
    private String lastName;
    private String address;
    private String phonoNo;


    public Contact(String firstName, String lastName, String address, String phonoNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phonoNo = phonoNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonoNo() {
        return phonoNo;
    }

    public void setPhonoNo(String phonoNo) {
        this.phonoNo = phonoNo;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phonoNo='" + phonoNo + '\'' +
                '}';
    }
}
