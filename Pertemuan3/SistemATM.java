/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author hi
 */
public class SistemATM {
    public static void main(String[] args) {
       Rekening r1 = new Rekening("001", 5000000);
       Rekening r2 = new Rekening("002", 4000000);
       
       
       Nasabah n1 = new Nasabah("Budi", "1234");
       
       n1.tambahrek(r1);
       n1.tambahrek(r2);
       
       
       Rekening r3 = new Rekening("003", 2000000);
        
       Nasabah n2 = new Nasabah("Santi", "2289");
       
       n2.tambahrek(r3);

       Nasabah[] kumpulanNasabah = new Nasabah[2];
       kumpulanNasabah[0] = n1;
       kumpulanNasabah[1] = n2;
       
       ATM mesin = new ATM(kumpulanNasabah);
       mesin.cekData();
       
       System.out.println("-----TRANSAKSI-----");
       r1.setor(20000);
       r1.tarik(300000);
       
       mesin.cekData();
    }
}
 