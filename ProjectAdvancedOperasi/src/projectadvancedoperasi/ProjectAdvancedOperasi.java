/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author Lzer0
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi operasi = new Operasi ();
        
        System.out.println("Hasil dari operasi 3 + 4 adalah " + operasi.jumlahkan(3, 4));
        System.out.println("Hasil dari operasi 4 + 7 + (-9) adalah " + operasi.jumlahkan(4, 7, -9));
        System.out.println("Hasil dari operasi 3.4 + (-0.002) + 0.12313 adalah " + operasi.jumlahkan(3.4, -0.002, 0.12313));
    }
    
}
