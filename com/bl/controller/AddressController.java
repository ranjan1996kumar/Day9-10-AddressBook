package com.bl.controller;

import java.util.Scanner;

import com.bl.service.AddressService;

public class AddressController {

    public static void main(String[] args) {

        AddressService addressService = new AddressService();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT_VALUE = 4;
        while(choice != EXIT_VALUE) {
            System.out.println("1.Add Person\n2.Update Person\n3.Delete Person\n"+EXIT_VALUE+".Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressService.createPerson();
                    addressService.print();
                    break;
                case 2:
                    System.out.println("Enter name of person to Update");
                    String name = scanner.next();
                    addressService.updatePerson(name);
                    addressService.print();
                    break;
                case 3:
                    System.out.println("Enter name of person to Delete");
                    String n = scanner.next();
                    addressService.deletePerson(n);
                    addressService.print();
                    break;
                case EXIT_VALUE :
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Enter valid value");
                    break;
            }
        }

    }
}