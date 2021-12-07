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
public class SUV extends Mixs {
    public double kecepatan, jarak;
    
    @Override
    public double hitungBBMinimum() {
        
        double bbminimum = jarak / 12;
        return bbminimum;
    }

    @Override
    public double hitungWaktuPerjalanan() {
        
        double waktu = jarak / kecepatan;
        return waktu;
    }
}
