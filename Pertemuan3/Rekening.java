/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author hi
 */
public class Rekening {
        String norek;
        double Saldo;
        
        Rekening(String noRek, double saldoAwal){
            norek = noRek;
            Saldo = saldoAwal;
        } 
        void setor(double jumlah){
            if (jumlah > 0){
            Saldo = Saldo + jumlah;
                System.out.println("Berhasil setor! Rp " + jumlah + " ke rekening " + norek);
            
            }
        }
        void tarik(double jumlah){
            if (jumlah > 0 && Saldo >= jumlah){
                Saldo = Saldo - jumlah;
                System.out.println("Berhasil tarik tunai Rp " + jumlah + " dari rekening " + norek);
             }
            else {
                System.out.println("Gagal Tarik tunai Saldo tidak cukup atau nominal salah");
            }
        
        }
        
}
