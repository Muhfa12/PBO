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
public class Gold extends Silver {
    int cashback(){
        int Totalcashback = cashback*Total;
        return Totalcashback;
    }
    
    public void setcashback(int cashback){
        if (cashback > 0){
            this.cashback = cashback;
        } else {
            this.cashback = 0;
        }
    }
}
