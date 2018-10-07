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
public class PBO210117070Latihan36TrgtSaldoTabungan {

    public static void main(String[] args) {
        int saldoTabungan = 3500000;
        double bunga = 0.08;
        double saldoPerbulan = 0;

        Saldo tst = new Saldo();
        tst.hitungSaldoTabungan(saldoTabungan, saldoPerbulan, bunga);
        
    }
    
}
