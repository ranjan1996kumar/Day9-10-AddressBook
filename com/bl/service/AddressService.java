package com.bl.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.bl.model.Address;

public class AddressService {
    static ArrayList<Address> address = new ArrayList<>();

    public static Scanner scanner = new Scanner(System.in);

    public static void createPerson() {
        Address addressBookModel = new Address();

        System.out.println("Enter Your First Name");

        String firstName = scanner.next();
        System.out.println("Enter Your Last Name");
        String lastName = scanner.next();
        System.out.println("Enter Your city Name");
        String city = scanner.next();
        System.out.println("Enter Your state Name");
        String state = scanner.next();
        System.out.println("Enter Your phone Number");
        double phNo = scanner.nextDouble();
        System.out.println("Enter Your zip");
        double zip = scanner.nextDouble();
        System.out.println("Enter Your email");
        String email = scanner.next();

        addressBookModel.setFirstName(firstName);
        addressBookModel.setLastName(lastName);
        addressBookModel.setCity(city);
        addressBookModel.setEmail(email);
        addressBookModel.setPhoneNo(phNo);
        addressBookModel.setState(state);
        addressBookModel.setZip(zip);

        address.add(addressBookModel);

    }

    public void updatePerson(String name) {
        int flag = 0;
        for (Address model : address) {
            if (model.getFirstName().equals(name)) {
                flag = 1;
                System.out.println("Enter what to update(city/state/phone/zip):");
                String update = scanner.next();
                switch (update) {
                    case "city":
                        System.out.println("Enter city name to update:");
                        String city = scanner.next();
                        model.setCity(city);

                        break;
                    case "state":
                        System.out.println("Enter state name to update:");
                        String state = scanner.next();
                        model.setState(state);
                        break;
                    case "phone":
                        System.out.println("Enter phone number to update:");
                        int phNo = scanner.nextInt();
                        model.setPhoneNo(phNo);
                        break;
                    case "zip":
                        System.out.println("Enter Your zip");
                        int zip = scanner.nextInt();
                        model.setZip(zip);
                        break;
                    default:
                        System.out.println("Enter vali field");
                        break;
                }
            }
        }
        if (flag == 0)
            System.out.println("Person Not Found");
        else
            System.out.println("Updated Successfully");

    }

    static public Address getContact(String name) {
        for (Address cont : address) {
            if (cont.getFirstName().equals(name)) {
                return cont;
            } else {
                System.out.println("Invalid name");
            }

        }
        return null;
    }

    public void deletePerson(String name) // Delete Person
    {
        address.remove(getContact(name));
    }

    // Unique Person
    static public String uniquePerson(String name) {
        for (Address address : address) {
            if (address.getFirstName().equals(name)) {
                System.out.println("Person already exist");
                createPerson();
            }
        }
        return null;
    }

    // Print addressbook
    public void print() {
        for (Address items : address) {
            System.out.println(items);
        }
    }
}
