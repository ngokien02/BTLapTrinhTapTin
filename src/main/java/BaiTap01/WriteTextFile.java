/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap01;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class WriteTextFile {
    public static void main(String[] args) {
        ArrayList<SanPham> listSP = new ArrayList<>();
        listSP.add(new SanPham("sp01", "Gạo", 30000));
        listSP.add(new SanPham("sp02", "Đường", 20000));
        listSP.add(new SanPham("sp03", "Muối", 15000));
        try {
            FileWriter fw = new FileWriter("sanpham.txt");
            for(SanPham sp : listSP){
                fw.write(sp.getMaSo() + "; " + sp.getTen() + "; " + sp.getGia() + "\n");
            }
            fw.close();
            System.out.println("Ghi tap tin thanh cong");
        } catch (Exception ex) {
            System.out.println("Loi gap phai: " + ex.toString());
            System.out.println("Ghi that bai");
        }
        
    }
}
