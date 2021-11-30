/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package improvedproject;

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
    
    public void setdisc(int disc){
        if (disc > 0){
            this.disc = disc;
        } else {
            this.disc = 0;
        }
    }
    
    public void setpoint(int point){
        if (point > 0){
            this.point = point;
        } else {
            this.point = 0;
        }
    }
    
    public void setrent(int rent){
        if (rent > 0){
            this.rent = rent;
        } else {
            this.rent = 0;
        }
    }
}