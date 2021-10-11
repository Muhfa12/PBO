/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author Lzer0
 */
public class Project_2 {
    public static void main (String args []) {
        
        double LingkaranBesar = Lingkaran.hitungLuas(14) / 2;
        double LingkaranKecil = Lingkaran.hitungLuas(7);
        
        double LuasArsiran = LingkaranBesar - LingkaranKecil;
        
        System.out.println("Luas Arsiran adalah : " + LuasArsiran + "cm");
    }
}
