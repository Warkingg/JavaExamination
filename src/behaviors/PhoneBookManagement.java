package behaviors;
import entities.Contact;

import java.util.ArrayList;

public class PhoneBookManagement {
    static ArrayList<Contact> contacts = new ArrayList<>();

    public PhoneBookManagement() {
    }

    public void addContact(Contact contact){

        contacts.add(contact);

    }
    public void updateContact(Contact contact){
        for (Contact contact1 : contacts){
            if(contact1.getPhoneNumber() == contact.getPhoneNumber()){
                contact1.setGroupContact(contact.getGroupContact());
                contact1.setName(contact.getName());
                contact1.setGender(contact.getGender());
                contact1.setAddress(contact.getAddress());
                contact1.setBirthday(contact.getBirthday());
                contact1.setEmail(contact.getEmail());
            }
        }
    }
    public void deleteContact(int phoneNumber){
        contacts.removeIf(ct->ct.getPhoneNumber()==phoneNumber);{
        }
    }
    public Contact getContactByPhoneNumber(int phoneNumber){
        Contact contact = new Contact ();
        for (Contact ct : contacts){
            if (ct.getPhoneNumber() == phoneNumber){
                contact = ct;
            }
        }
        return contact;
    }
    public void showAllContact(){
        for (Contact ct :contacts){
            System.out.println(ct.toString());
        }
    }
}

