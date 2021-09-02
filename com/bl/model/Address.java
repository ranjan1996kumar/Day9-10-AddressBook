package com.bl.model;

public class Address {

    private String firstName;
    private String lastName;
    private double phoneNo;
    private String email;
    private String state;
    private String city;
    private double zip;

    public Address(String firstName, String lastName, double phoneNo, String email, String state, String city,
                            double zip) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.email = email;
        this.state = state;
        this.city = city;
        this.zip = zip;
    }

    public Address() {
        super();
    }

    public String toString() {
        return "AddressBookModel [firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo
                + ", email=" + email + ", state=" + state + ", city=" + city + ", zip=" + zip + "]";
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
    public double getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(double phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public double getZip() {
        return zip;
    }
    public void setZip(double zip) {
        this.zip = zip;
    }
}
