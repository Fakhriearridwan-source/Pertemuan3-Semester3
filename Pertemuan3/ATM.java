/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author hi
 */
public class ATM {
   Nasabah[] databaseNasabah;
   
   ATM(Nasabah[] nasabahnya){
       databaseNasabah = nasabahnya;
   }
   
   void cekData(){
       for(int i = 0; i < databaseNasabah.length; i++){
           Nasabah n = databaseNasabah[i];
           System.out.println("Nama Nasabah : " + n.nama);
           
           for(int j = 0; j < n.jumlahRekening; j++){
               Rekening r = n.daftarRek[j];
               System.out.println(" - No Rekening : "+ r.norek + " | Saldo : " + r.Saldo);
              
           }
       }
   
   }
}
