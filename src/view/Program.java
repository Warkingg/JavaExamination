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
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        }
                    }
                }catch (Exception e) {
                System.err.println("Inpput Error");
            }
        }while(true);
            }
        }
