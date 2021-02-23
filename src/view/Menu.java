package view;

import entities.Contact;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static Contact getInfoContact(){
        System.out.println("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter group: ");
        String groupContact = sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter gender: ");
        String address = sc.nextLine();
        System.out.println("Enter birthday: ");
        String birthday = sc.nextLine();
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        return new Contact(phoneNumber,groupContact,name,address,birthday,email);
    }
}
