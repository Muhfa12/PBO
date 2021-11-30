/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package improvedproject;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.time.Duration;
import java.time.LocalDateTime;
/**
 *
 * @author Lzer0
 */
public class Time {
    private int day1,month1,year1,day2,month2,year2,day,month,year,Total;
    int rentTime;
    
    public int Total(){
        if(year2 >= year1) {
            if(month2 >= month1) {
                LocalDateTime from = LocalDateTime.of(year1, month1, day1, 23, 59, 59);
                LocalDateTime to = LocalDateTime.of(year2, month2, day2, 23, 59, 59);
                Duration duration = Duration.between(from, to);
                rentTime = (int) duration.toDays(); 
            }
            else {
                System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
            }
        }
            else {
                System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
        }
        return rentTime;
    }
    
    void InputTgl(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Tanggal Pinjam (1-31) 	: ");
        day1 = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam (1-12)	: ");
        month1 = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam           : ");
        year1 = input.nextInt();
        System.out.print("Masukkan Tanggal Kembali (1-31) : ");
        day2 = input.nextInt();
        System.out.print("Masukkan Bulan Kembali (1-12)	: ");
        month2 = input.nextInt();
        System.out.print("Masukkan Tahun Kembali          : ");
        year2 = input.nextInt();
    }
    
    void OutputTgl(){
        LocalDate from = LocalDate.of(year1, month1, day1);
        LocalDate to = LocalDate.of(year2, month2, day2);
        Period period = Period.between(from, to);
        System.out.println("Tanggal Pinjam	: " + day1 + " - " + month1 + " - " + year1);
        System.out.println("Tanggal Kembali	: " + day2 + " - " + month2 + " - " + year2);
        System.out.print("Lama Sewa	: ");
        System.out.println( Total() +" hari");
    }
}
