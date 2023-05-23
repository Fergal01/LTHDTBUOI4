/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi41;

import java.util.Date;
import java.util.Scanner;


public class GiaoDich {
    private int maGiaoDich;
    int ngay;
    int thang;
   int nam;
    float donGia;
    int dienTich;
    public GiaoDich(){
    }

    public GiaoDich(int maGiaoDich, int ngay, int thang, int nam, float donGia, int dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }
  
public void Nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap Ma Giao Dich: ");
    maGiaoDich = sc.nextInt();
    System.out.println("Nhap Ngay iao Dich: ");
   
    
    System.out.println("Nhap Don Gia: ");
    donGia = sc.nextFloat();
    System.out.println("Nhap Dien Tich: ");
    dienTich = sc.nextInt();
}
public void Xuat(){
    
}
    
}
