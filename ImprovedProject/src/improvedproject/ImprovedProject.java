/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package improvedproject;

import java.util.Scanner;
/**
 *
 * @author Lzer0
 */
public class ImprovedProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("****************WELCOME*****************");
        
        Member m = new Member();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member              : ");
        m.Member = input.nextLine();
        
        int n = m.AddMember();
        if(n < 0){
            System.out.println("");
            System.out.println("id member tidak ada dalam data");
            System.exit(0);
        }
        
        Time t = new Time();
        t.InputTgl();

        System.out.println("\n\n**************THANKS********************");
        System.out.println("");

        int x = m.TypeMember();
        switch (x){
            case 1:
                Silver s = new Silver();
                s.disc = 1;
                s.rent = 25000;
                s.point = 1;
                s.Total = t.Total();
                
                System.out.println("");
                t.OutputTgl();
                System.out.println("");
                
                System.out.println("Total Sewa	: " + s.Totalrent());
                System.out.println("Jumlah Poin	: " + s.point());
                break;
                
            case 2:
                Gold g = new Gold();
                g.disc = 2;
                g.rent = 30000;
                g.point = 5;
                g.cashback = 5000;
                g.Total = t.Total();
                
                System.out.println("");
                t.OutputTgl();
                System.out.println("");
                
                System.out.println("Total Sewa	: " + g.Totalrent());
                System.out.println("Jumlah Poin	: " + g.point());
                System.out.println("Jumlah Cashback : " + g.cashback());
                break;
                
            case 3:
                Platinum p = new Platinum();
                p.disc = 3;
                p.rent = 45000;
                p.point = 10;
                p.cashback = 10000;
                p.credit = 5000;
                p.Total = t.Total();
                
                System.out.println("");
                t.OutputTgl();
                System.out.println("");
                
                System.out.println("Total Sewa	: " + p.Totalrent());
                System.out.println("Jumlah Poin	: " + p.point());
                System.out.println("Jumlah Cashback : " + p.cashback());
                System.out.println("Bonus Pulsa     : " + p.credit());
                break; 
        }
    }
}
