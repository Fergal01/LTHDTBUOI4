/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi41;

import java.util.Date;


public  class GiaoDichDat extends GiaoDich {
    private String loaiDat;
    public GiaoDichDat(String gD001, int par, int par1, int par2, int par3, int par4, String a){
        
    }
   public double ThanhTien(){
       if(loaiDat.equals("A")){
         return dienTich*donGia*15;  
       }else{
          return dienTich*donGia; 
       
       } 

   }
     
}
