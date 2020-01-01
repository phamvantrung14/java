/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MovieList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author asuspc
 */
public class MovieList {

    List<Movie> arr2 = new ArrayList<>();
    ArrayList<Movie> arr = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public void ThemPhimYeuThich() {
        System.out.println("Số Lượng Phim Muốn Thêm: ");

        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            System.out.println("Bộ Phim Thứ: " + (i + 1));
            Movie movie = new Movie();
            movie.NhapDuLieu();
            arr.add(movie);
        }
        System.out.println("Xin Cảm Ơn. ");
    }

    public void DanhSachPhim() {
        System.out.println("Danh Sách Các Bộ Phim: ");
        if (arr.isEmpty()) {
            System.out.println("Bạn chưa nhập phim..");
        } else {
            for (int i = 0; i < arr.size(); i++) {
                Movie get = arr.get(i);
                System.out.println((i + 1) + "." + get.toString());
            }
            System.out.println("=================================");

        }

    }

    public void SuaPhim() {
        if (arr.isEmpty()) {
            System.out.println("Danh Sách Phim Yêu Thích Trống...");
        } else {
            System.out.println("Mời Bạn Nhập thứ tự Phim Cần Sửa: ");
            int TT2 = sc.nextInt();
            Movie get2;
            get2 = arr.get(TT2 - 1);
            System.out.println(get2.toString());

            System.out.println("=================");
            System.out.println("Mời Bạn Sửa Phim: " + get2.name);
            System.out.println("Mời Bạn Nhập Tên Mới: ");
            String EditName = sc.nextLine();
            if (EditName.isEmpty()) {
                EditName = sc.nextLine();
            }
            get2.setName(EditName);
            System.out.println("Đạo Diễn: ");
            get2.setDaoDien(sc.nextLine());
            System.out.println("Năm Sản Xuất: ");
            get2.setNsx(sc.nextInt());
            System.out.println("Thời Lượng Của Bộ Phim: ");
            get2.setThoiLuong(sc.nextInt());
            System.out.println("Năm Phát Hành: ");
            get2.setNamPhatHanh(sc.nextInt());
            System.out.println("Mức Độ Yêu Thích: ");
            get2.setMucDoYT(sc.nextInt());
            System.out.println("Chỉnh Sửa Thành Công...");
        }
    }

    public void TimTenPhim() {
        if (arr.isEmpty()) {
            System.out.println("Danh Sách Phim Yêu Thích Trống...");
        } else {
            System.out.println("Mời Nhập Từ Khóa");
            String Tukhoa = sc.nextLine();
            if (Tukhoa.isEmpty()) {
                Tukhoa = sc.nextLine();
            }
            boolean tk = false;
            for (Movie pyt : arr) {
                if (pyt.name.equals(Tukhoa)) {
                    pyt.XuatDuLieu();
                    tk = true;
                }
            }
            if (tk == false) {
                System.out.println("Không tìm thấy phim: " + Tukhoa);
            }
        }
    }

    public void XoaPhim() {
        System.out.println("Nhập Số Thứ Tự Muốn Xóa: ");

        int id = sc.nextInt();
        if (id < arr.size() && id >= 0) {
            arr.remove(id);
        }
        System.out.println("Xóa Thành Công....");
    }

    public int menu() {
        System.out.println("Menu");
        System.out.println("1.Thêm Phim Vào Danh Sách Yêu Thich.");
        System.out.println("2.Hiển Thị Danh Sách Các Bộ Phim Yêu Thích.");
        System.out.println("3.Sửa phim.");
        System.out.println("4.Xóa Phim");
        System.out.println("5.Tìm kiếm phim theo tên.");
        System.out.println("6.Thoát");
        System.out.println("Vui Lòng Chọn Từ 1 Đến 6:");
        Scanner sc1 = new Scanner(System.in);
        return sc1.nextInt();
    }

    public static void main(String[] args) {
        int choose;
        MovieList main = new MovieList();
        do {
            choose = main.menu();
            switch (choose) {
                case 1:
                    main.ThemPhimYeuThich();
                    break;
                case 2:
                    main.DanhSachPhim();
                    break;
                case 3:
                    main.SuaPhim();
                    break;
                case 4:
                    main.XoaPhim();
                    break;
                case 5:
                    main.TimTenPhim();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (true);

    }
}
