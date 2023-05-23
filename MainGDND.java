/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Buoi41;


public class MainGDND {

   public static void main(String[] args) {
    QuanLyGiaoDich quanLyGiaoDich = new QuanLyGiaoDich();

    // Thêm các giao dịch vào danh sách
    GiaoDichDat gd1;
       gd1 = new GiaoDichDat("GD001", 10, 9, 2013, 1000, 500, "A") {};
    quanLyGiaoDich.themGiaoDich(gd1);

    GiaoDichDat gd2 = new GiaoDichDat("GD002", 15, 9, 2013, 1500, 800, "B");
    quanLyGiaoDich.themGiaoDich(gd2);

    GiaoDichNha gn1 = new GiaoDichNha("GD003", 20, 9, 2013, 2000, 200, "cao cấp");
    quanLyGiaoDich.themGiaoDich(gn1);

    GiaoDichNha gn2 = new GiaoDichNha("GD004", 25, 9, 2013, 2500, 300, "thường");
    quanLyGiaoDich.themGiaoDich(gn2);

    // In thông tin các giao dịch
    System.out.println("Thông tin các giao dịch:");
    for (GiaoDich giaoDich : quanLyGiaoDich.danhSachGiaoDich) {
        System.out.println("Mã giao dịch: " + giaoDich.getMaGiaoDich());
        System.out.println("Ngày giao dịch: " + giaoDich.ngay + "/" + giaoDich.thang + "/" + giaoDich.nam);
        System.out.println("Đơn giá: " + giaoDich.donGia);
        System.out.println("Diện tích: " + giaoDich.dienTich);
        System.out.println("Thành tiền: " + giaoDich.tinhThanhTien());
        System.out.println("--------------------------");
    }

    // Số lượng giao dịch theo loại
    System.out.println("Số lượng giao dịch đất: " + quanLyGiaoDich.demSoLuongLoaiDat());
    System.out.println("Số lượng giao dịch nhà: " + quanLyGiaoDich.demSoLuongLoaiNha());

    // Trung bình thành tiền giao dịch đất
    double trungBinhThanhTien = quanLyGiaoDich.tinhTrungBinhThanhTienDat();
    System.out.println("Trung bình thành tiền giao dịch đất: " + trungBinhThanhTien);

    // Xuất giao dịch tháng 9 năm 2013
    quanLyGiaoDich.xuatGiaoDichThang9Nam2013();
}

}



