/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MovieList;

import java.util.Scanner;

/**
 *
 * @author asuspc
 */
public class Movie {
    String name;
    private int Nsx;
    private String DaoDien;
    private int ThoiLuong;
    private int NamPhatHanh;
    private int MucDoYT;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNsx() {
        return Nsx;
    }

    public void setNsx(int Nsx) {
        this.Nsx = Nsx;
    }

    public String getDaoDien() {
        return DaoDien;
    }

    public void setDaoDien(String DaoDien) {
        this.DaoDien = DaoDien;
    }

    public int getNamPhatHanh() {
        return NamPhatHanh;
    }

    public void setNamPhatHanh(int NamPhatHanh) {
        this.NamPhatHanh = NamPhatHanh;
    }

    public int getMucDoYT() {
        return MucDoYT;
    }

    public void setMucDoYT(int MucDoYT) {
        this.MucDoYT = MucDoYT;
    }

    public int getThoiLuong() {
        return ThoiLuong;
    }

    public void setThoiLuong(int ThoiLuong) {
        this.ThoiLuong = ThoiLuong;
    }
    

    public void NhapDuLieu(){
        System.out.println("Nhập dữ liệu phim yêu thích:  ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên Phim: ");
        name = sc.nextLine();
        System.out.println("Năm Sản Xuất: ");
        Nsx = sc.nextInt();
        sc.nextLine();
        System.out.println("Đạo Diễn Bộ Phim: ");
        DaoDien = sc.nextLine();
        System.out.println("Năm Phát Hành Bộ Phim: ");
        NamPhatHanh = sc.nextInt();
        sc.nextLine();
        System.out.println("Thời Lượng Bộ Phim: ");
        ThoiLuong = sc.nextInt();
        sc.nextLine();
        System.out.println("Mức Độ Yêu Thích: ");
        MucDoYT = sc.nextInt();
        sc.nextLine();
    }

    /**
     *
     */
    public String XuatDuLieu(){
        System.out.println("Tên Phim: "+name);
        System.out.println("Năm Sảm Xuất: "+Nsx);
        System.out.println("Đạo Diễn: "+DaoDien);
        System.out.println("Thời Lượng Phim: "+ThoiLuong);
        System.out.println("Năm Phát Hành: "+NamPhatHanh);
        System.out.println("Mức Độ Yêu Thích: "+MucDoYT);
        return name+Nsx+DaoDien+ThoiLuong+NamPhatHanh+MucDoYT;
    }

    @Override
    public String toString() {
        return "Movie{" + "Tên phim: " + name + "\n Năm sản xuất: " + Nsx + "\n Đạo diễn: " + DaoDien + "\n Thời lượng: " + ThoiLuong + "\n Năm phát hành: " + NamPhatHanh + "\n Mức độ yêu thích: " + MucDoYT + '}';
    }
    
}
