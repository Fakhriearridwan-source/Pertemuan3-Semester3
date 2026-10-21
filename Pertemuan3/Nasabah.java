/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author hi
 */
public class Nasabah {
       String nama;
       String pin;
       Rekening[] daftarRek;
       int jumlahRekening = 0;
       
       Nasabah(String namaNasabah, String pinNasabah){
           nama = namaNasabah;
           pin = pinNasabah;
           daftarRek =  new Rekening[5];
       }
       
       void tambahrek(Rekening rek){
           if (jumlahRekening < 5){
               daftarRek[jumlahRekening] = rek;
               jumlahRekening++;
           }
       }
}
