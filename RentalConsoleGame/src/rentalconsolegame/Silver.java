/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

/**
 *
 * @author Lzer0
 */
public class Silver {
    protected int rent, point, disc, credit, cashback, Total;
    
    int point(){
        int Totalpoint = point*Total;
        return Totalpoint;
    }
    
    int Totalrent(){
        int Totalrent = (rent*(100-disc)/100)*Total;
        return Totalrent; 
    }
}
