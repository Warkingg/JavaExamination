package view;

import behaviors.PhoneBookManagement;
import entities.Contact;

import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);
    static PhoneBookManagement pm = new PhoneBookManagement();
    public static void main(String[] args) {
        Menu:
        do{
            System.out.println("----------CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----------" +
                    "\nChọn chức năng theo số để tiếp tục" +
                    "\n1.Xem danh sách" +
                    "\n2.Thêm mới" +
                    "\n3.Cập nhật" +
                    "\n4.Xóa" +
                    "\n5.Tìm kiếm" +
                    "\n6.Đọc từ file" +
                    "\n7.Ghi vào file" +
                    "\n8.Thoát" +
                    "\nChọn chức năng: ");
            try{
                int choice = Integer.parseInt(sc.nextLine());{
                    switch (choice){
                        case 1:
                            pm.showAllContact();
                            break;
                        case 2:
                            Contact contact = Menu.getContactInfo();
                            pm.addContact(contact);
                            break;
                        case 3:
                            Contact contact1 = Menu.getContactInfo();
                            pm.updateContact(contact1);
                            break;
                        case 4:
                            System.out.println("Nhập số điện thoại bạn muốn xóa: ");
                            int phoneNumber = Integer.parseInt(sc.nextLine());
                            pm.deleteContact(phoneNumber);
                            break;
                        case 5:
                            System.out.println("Nhập số điện thoại muốn tìm kiếm: ");
                            int phoneNumber1= Integer.parseInt(sc.nextLine());
                            pm.getContactByPhoneNumber(phoneNumber1);
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            System.exit(8);
                            break;
                        default:
                            System.out.println("Input Error. Try Again");
                        }
                    }
                }catch (Exception e) {
                System.err.println("Inpput Error");
            }
        }while(true);
            }
        }
