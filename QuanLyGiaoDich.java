/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi41;

import java.util.ArrayList;
import java.util.List;

public class QuanLyGiaoDich {
     final List<GiaoDich> danhSachGiaoDich;

    public QuanLyGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
    }

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
    }import java.util.ArrayList;
import java.util.List;

    String demSoLuongLoaiDat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String demSoLuongLoaiNha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void xuatGiaoDichThang9Nam2013() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double tinhTrungBinhThanhTienDat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

public class QuanLyGiaoDich {
    private List<GiaoDich> danhSachGiaoDich;

    public QuanLyGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
    }

    public List<GiaoDich> getDanhSachGiaoDich() {
        return danhSachGiaoDich;
    }

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
    }

    public int demSoLuongLoaiDat() {
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                count++;
            }
        }
        return count;
    }

    public int demSoLuongLoaiNha() {
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichNha) {
                count++;
            }
        }
        return count;
    }

    public double tinhTrungBinhThanhTienDat() {
        double tongThanhTien = 0;
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                tongThanhTien += giaoDich.tinhThanhTien();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return tongThanhTien / count;
    }

    public void xuatGiaoDichThang9Nam2013() {
        System.out.println("Các giao dịch tháng 9 năm 2013:");
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich.getThang() == 9 && giaoDich.getNam() == 2013) {
                System.out.println("Mã giao dịch: " + giaoDich.getMaGiaoDich());
                System.out.println("Ngày giao dịch: " + giaoDich.getNgay() + "/" + giaoDich.getThang() + "/" + giaoDich.getNam());
                System.out.println("Đơn giá: " + giaoDich.getDonGia());
                System.out.println("Diện tích: " + giaoDich.getDienTich());
                System.out.println("Thành tiền: " + giaoDich.tinhThanhTien());
                System.out.println("--------------------------");
            }
        }
    }
}

    
}
