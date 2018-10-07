/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan36.trgtsaldotabungan;

/**
 *
 * @author Aditya
 * Nama : Aditya Nur Iskandar 
 * Kelas : PBO2/IF 2 
 * Nim : 10117070
 * Deskripsi Program : Program ini berisi program Menghitung Target Saldo 
 * Tabungan
 */
public class Saldo {
    public void hitungSaldoTabungan(int saldoTabungan, double saldoPerbulan, double bunga) {
        int i;
        for(i = 1; saldoTabungan<=6000000; i++) {
            saldoPerbulan = bunga * saldoTabungan;
            saldoTabungan = (int) (saldoTabungan + saldoPerbulan);
            System.out.println("Saldo di Bulan ke-" + i + " Rp."
                    + saldoTabungan);
        }
    }
    
}
