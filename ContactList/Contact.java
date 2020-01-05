/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactList;

import java.util.Scanner;

/**
 *
 * @author asuspc
 */
public class Contact {
     public static Scanner sc = new Scanner(System.in);
    int phone;
    String name;

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void NhapDl(){
        System.out.println("Nhập tên người dùng: ");
        name = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        phone =sc.nextInt();
        sc.nextLine();
    }
    public void hienthi(){
        System.out.println("tên người dung: "+name);
        System.out.println("phone: "+phone);
//        return "kết quả:"+name+" "+phone;
    }

    @Override
    public String toString() {
        return "Contact{" + "phone= " + phone + ", name= " + name + '}';
    }
    
}
