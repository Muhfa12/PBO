/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingproject;
import java.util.Scanner;
/**
 *
 * @author Lzer0
 */
public class Sorting {
    int [] dataBil = new int [100];
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Banyak Input data(n) : ");
        this.n = input.nextInt();
            for(int i=0; i<n; i++){
                System.out.println("Masukan bilangan ke - " + (i+1)+ " : ");
                this.dataBil[i] = input.nextInt();
            }
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    int cariMin(int[] data){
        int min = data[0];
        for(int i=0; i<this.n; i++){
            if (min>data[i]){
                min = data[i];
            }
        }
        return min;
    }
    
    int cariMax(int[] data){
        int max = data[0];
        for(int i=0; i<this.n; i++){
            if (max<data[i]){
                max = data[i];
            }
        }
        return max;
    }
    
    void sort(int[]data){
        for (int i=0; i<n; i++){
            for (int j=1; j<(n-i); j++){
                if (data[j-1]>data[j]){
                    int swap = data[j-1];
                    data[j-1] = data[j];
                    data[j] = swap;
                }
            }
        }      
        for (int i=0; i<n; i++){
            System.out.print(data[i] +" ");
        }  
    }
    
    void output(){
    System.out.println("========================");
    System.out.println("Nilai Rata-Rata  : " + hitungRerata(dataBil));
    System.out.println("Nilai minimum    : " + cariMin(dataBil));
    System.out.println("Milai maximum    : " + cariMax(dataBil));
    System.out.print("Sorting Nilai    : ");
    sort(dataBil);
    }   
}
