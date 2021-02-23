package view;

import entities.Contact;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static Contact getContactInfo() {
        Contact contact = new Contact();
        System.out.println("Enter phone number: ");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        contact.setPhoneNumber(phoneNumber);
        System.out.println("Enter group: ");
        String groupContact = sc.nextLine();
        contact.setGroupContact(groupContact);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        contact.setName(name);
        System.out.println("Enter gender: ");
        String address = sc.nextLine();
        contact.setAddress(address);
        System.out.println("Enter birthday: ");
        String birthday = sc.nextLine();
        contact.setBirthday(birthday);
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        contact.setEmail(email);
        return contact;
    }
}
