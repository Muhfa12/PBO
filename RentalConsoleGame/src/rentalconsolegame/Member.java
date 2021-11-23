/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

import java.util.ArrayList;
import static java.util.Collections.binarySearch;
/**
 *
 * @author Lzer0
 */
public class Member {
    String Member;
    ArrayList<String> id = new ArrayList<String>();
    String[][] data = {
        {"Mr.X","Silver"},{"Mr.Y","Gold"},{"Mr.Z","Platinum"}
    };
    
    int AddMember(){
        id.add("M001");
        id.add("M002");
        id.add("M003");
        int Add = binarySearch(id, Member);
        return Add;
    }

    int TypeMember(){
        int n = AddMember();
        String a = data[n][1];
        int b = 0;
        if (a == "Silver") {
            b = 1;
        } else if (a == "Gold"){
            b = 2;
        } else if (a == "Platinum"){
            b = 3;
        }
        System.out.println("ID Member       : " + id.get(n));
        System.out.println("Nama Member     : " + data[n][0]);
        System.out.println("Jenis Member    : " + data[n][1]);
        return b;
    }
}
