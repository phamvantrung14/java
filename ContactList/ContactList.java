/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactList;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author asuspc
 */
public class ContactList {

    public static Scanner sc = new Scanner(System.in);
    ArrayList<Contact> ct = new ArrayList<>();

    public void addCt() {
        
        System.out.println("Số contact muốn nhập: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("TT người dùng thứ " + (i + 1));
            Contact arr = new Contact();
            arr.NhapDl();
            ct.add(arr);
        }

    }

    public void removeCt() {
        System.out.println("chọn thứ tự contact cần xóa: ");
        int index = sc.nextInt();

        if (index < ct.size()) {
            ct.remove(index);
        }
        System.out.println("Xoa thanh công");

    }

    public void deleteCt() {

        System.out.println("Bạn có muốn xóa Contact ? hãy chọn:");
        System.out.println("1. Xóa");
        System.out.println("2. Bỏ qua");
        int choose = sc.nextInt();
        if (choose == 1) {
            System.out.println("Chọn thứ tự contact cần xóa");
            int index = sc.nextInt();
            if (index < ct.size() && index >= 0) {
                ct.remove(index);
            }
            System.out.println("Bạn đã xóa thành công");
        } else if (choose == 2) {
            System.out.println("Ban không xóa");
        } else {
            System.out.println("Lựa chọn không hợp lệ. Vui lòng thao tác lại");
        }

    }

    public void display() {

        System.out.println("Tổng số contact là: " + ct.size());
//        for (int i = 0; i < ct.size(); i++) {
//            Contact get = ct.get(i);
//            get.hienthi();
//            System.out.println("TT." + (i + 1));
//            System.out.println(get.toString());
//        }
        if (ct.isEmpty()) {
            System.out.println("Chưa có sản phẩm nào");
        } else {
            ct.forEach((ct) -> {
                ct.hienthi();
            });
        }

    }
    public void Edit(){
        if (ct.isEmpty()) {
            System.out.println("Contact trống.. Vui lòng nhập contact trước khi thực hiện.");
        }else{
            System.out.println("Nhập thứ tự contact cần sửa");
            int n = sc.nextInt();
//           Contact get;
            Contact getCt = ct.get(n-1);
            System.out.println(getCt.toString());
            System.out.println("============");
            System.out.println("Sửa contact: "+getCt.name);
            System.out.println("Nhập tên mới: ");
            String EditName = sc.nextLine();
            
            if (EditName.isEmpty()) {
                EditName = sc.nextLine();
            }
            getCt.setName(EditName);
            
            System.out.println("Nhập số điện thoại mới: ");
            int EditPhone = sc.nextInt();
            getCt.setPhone(EditPhone);
            System.out.println("Cập nhật thành công xin chúc mừng");
            
        }
    }

    public int menu() {
        System.out.println("Menu contact");
        System.out.println("1.Thêm Contact");
        System.out.println("2.Hiển thị danh sách contact");
        System.out.println("3.Xóa contact");
        System.out.println("4.Sửa Contact");
        System.out.println("5.Dừng chương trình");
        System.out.println("Mời bạn chọn: ");
        return sc.nextInt();
    }

}
