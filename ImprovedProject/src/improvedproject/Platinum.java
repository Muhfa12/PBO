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
public class Platinum extends Gold {
    int credit(){
        int Totalcredit = credit*Total;
        return Totalcredit;
    }
    
    public void setcredit(int credit){
        if (credit > -1){
            this.credit = credit;
        } else {
            this.credit = 0;
        }
    }
}
