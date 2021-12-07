/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatistikPerjalanan;

import Mobil.*;
/**
 *
 * @author Lzer0
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sedan s = new Sedan();
        SUV suv = new SUV();
        MPV mpv = new MPV();
        
        String[][] dataMobil = {
            {"A", "Sedan", "107", "60"},
            {"B", "Sedan", "538", "65"},
            {"C", "SUV", "662", "57"},
            {"D", "SUV", "471", "62"},
            {"E", "MPV", "541", "64"},
            {"F", "MPV", "433", "53"}
        };
        
        for(int i = 0; i <= dataMobil.length - 1; i++ ) {
            
            if(null != dataMobil[i][1]) switch (dataMobil[i][1]) {
                case "MPV":
                    mpv.jarak = Double.parseDouble(dataMobil[i][2]);
                    mpv.kecepatan = Double.parseDouble(dataMobil[i][3]);
                    System.out.println("Mobil " + dataMobil[i][0]);
                    mpv.hitungBBMinimum();
                    mpv.hitungWaktuPerjalanan();
                    mpv.Hasil();
                    break;
                case "SUV":
                    suv.jarak = Double.parseDouble(dataMobil[i][2]);
                    suv.kecepatan = Double.parseDouble(dataMobil[i][3]);
                    System.out.println("Mobil " + dataMobil[i][0]);
                    suv.hitungBBMinimum();
                    suv.hitungWaktuPerjalanan();
                    suv.Hasil();
                    break;
                case "Sedan":
                    s.jarak = Double.parseDouble(dataMobil[i][2]);
                    s.kecepatan = Double.parseDouble(dataMobil[i][3]);
                    System.out.println("Mobil " + dataMobil[i][0]);
                    s.hitungBBMinimum();
                    s.hitungWaktuPerjalanan();
                    s.Hasil();
                    break;
                default:
                    break;
            }
        }
    }
}