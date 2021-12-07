/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mobil;

/**
 *
 * @author Lzer0
 */
public abstract class Mixs {
    public abstract double hitungBBMinimum();
    public abstract double hitungWaktuPerjalanan();
    public void Hasil() {
        
        System.out.println("Perkiraan Jumlah Bahan Bakar yang Diperlukan yaitu : " + this.hitungBBMinimum());
        System.out.println("Perkiraan Waktu Perjalanan yang Ditempuh yaitu : " + this.hitungWaktuPerjalanan());
    }
}
