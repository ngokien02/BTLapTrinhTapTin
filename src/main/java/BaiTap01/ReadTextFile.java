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
public class ReadTextFile {
    public static void main(String[] args) {
        ArrayList<SanPham> listSP = new ArrayList<>();
        try {
            FileReader fr = new FileReader("sanpham.txt");
            BufferedReader br = new BufferedReader(fr);
            String data = null;
            while((data = br.readLine()) != null){
                String[] arr = data.split("; ");
                listSP.add(new SanPham(arr[0], arr[1], Float.parseFloat(arr[2])));
            }
            br.close();
            System.out.println("Doc tap tin thanh cong"
                    + "\nKet qua doc duoc: ");
            for(SanPham sp : listSP){
                System.out.println(sp.toString());
            }
        } catch (Exception ex) {
            System.out.println("Loi: " + ex.toString());
            System.out.println("Doc tap tin that bai");
        }
    }
}
