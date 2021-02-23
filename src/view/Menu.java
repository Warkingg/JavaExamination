package view;

import entities.Contact;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static Contact getContactInfo() {
        Contact contact = new Contact();
        System.out.println("Nhập số điện thoại: ");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        contact.setPhoneNumber(phoneNumber);
        System.out.println("Nhập nhóm: ");
        String groupContact = sc.nextLine();
        contact.setGroupContact(groupContact);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        contact.setName(name);
        System.out.println("Nhập giới tính: ");
        String address = sc.nextLine();
        contact.setAddress(address);
        System.out.println("Nhập địa chỉ: ");
        String birthday = sc.nextLine();
        contact.setBirthday(birthday);
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        contact.setEmail(email);
        return contact;
    }
}
