/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi41;

public class GiaoDichNha extends GiaoDich{
    private String loaiNha;
    private String diaChi;
public GiaoDichNha(String gD004, int par, int par1, int par2, int par3, int par4, String thường){
    
}

    public GiaoDichNha(String loaiNha, String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha(String loaiNha, String diaChi, int maGiaoDich, int ngay, int thang, int nam, float donGia, int dienTich) {
        super(maGiaoDich, ngay, thang, nam, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

 
  
    public double ThanhTien(){
        if(loaiNha.equals("Cao Cấp")){
            return dienTich*donGia;
        }else{
            return dienTich*donGia*0.9;
        }
        
    }
}
