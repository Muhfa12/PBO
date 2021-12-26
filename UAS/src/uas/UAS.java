/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
import java.util.Scanner;
import karyawan.karyawan;
import karyawan.menu;
/**
 *
 * @author Lzer0
 */
public class UAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu data = new menu() {};       
        
        while(true){    
            System.out.println("===== Menu UTAMA =====");
            System.out.println("1.Tambah data");
            System.out.println("2.Hapus Data");
            System.out.println("3.Cari Data");
            System.out.println("4.Lihat Data");
            System.out.println("5.Exit");
            Scanner input = new Scanner( System.in );
            System.out.print("Menu pilihan: ");
            int i = input.nextInt();
            switch(i){
                case 1 : 
                    boolean tambahdata = true;
                    while(tambahdata){
                        System.out.println("");
                        System.out.println("===========================================");
                        System.out.println("                 Tambah Data               ");
                        System.out.println("-------------------------------------------");
                        String x = input.nextLine();
                        
                        System.out.print("Masukan Kode Karyawan             : ");
                        String kodeKar = input.nextLine();
                        
                        System.out.print("Masukan Nama Karyawan             : ");
                        String namaKar = input.nextLine();
                        
                        System.out.print("Masukan Alamat                    : ");
                        String alamat = input.nextLine();
                        
                        System.out.print("Masukan Tanggal Lahir (YYYY-MM-DD): ");
                        String tgl = input.nextLine();

                        System.out.print("Masukan Golongan (A / B / C)      : ");
                        String gol = input.nextLine();
                        System.out.println("");
                        
                        System.out.println("Masukan Status Menikah");
                        System.out.println("0.Belum Menikah");
                        System.out.println("1.Sudah Menikah");
                        System.out.print("Status Karyawan                   : ");
                        int statusKar = input.nextInt();
                        
                        int jumlahAnak;
                        if( statusKar == 1 ){
                            System.out.print("Jumlah Anak                       : ");
                            jumlahAnak = input.nextInt();
                        } else {
                            statusKar = 0;
                            jumlahAnak = 0;
                        }
                        
                        karyawan karyawan = new karyawan(
                            kodeKar,
                            namaKar,
                            alamat,
                            tgl,
                            gol,
                            statusKar,
                            jumlahAnak
                        );
                        
                        data.tambah(karyawan);
                        
                        System.out.println("\n");
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1 Kembali ke menu utama");
                        System.out.println("2 Tambah Data Kembali");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int submenu = input.nextInt();
                        if(submenu == 1){
                            tambahdata = false;
                        }else if(submenu != 2) {
                            System.out.println("Error");
                        }  
                    }
                    break;
                
                    
                case 2 : 
                    boolean hapus = true;
                    while(hapus) {
                        System.out.println("");
                        System.out.println("===========================================");
                        System.out.println("                 Hapus Data                ");
                        System.out.println("-------------------------------------------");
                        String x = input.nextLine();
                        
                        System.out.print("Masukkan Kode Karyawan : ");
                        String kodeKar = input.nextLine();
                        
                        data.hapus(kodeKar);
                        
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1 Kembali ke menu utama");
                        System.out.println("2 Hapus Data Kembali");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int submenu = input.nextInt();
                        if(submenu == 1){
                            hapus = false;
                        } else if(submenu != 2) {
                            System.out.println("Error");
                        }        
                    }
                    break;
                
                case 3 :                     
                    boolean caridata = true;
                    while(caridata){
                        System.out.println("");
                        System.out.println("===========================================");
                        System.out.println("                 Cari Data                 ");
                        System.out.println("-------------------------------------------");
                        String x = input.nextLine();
                        
                        System.out.print("Masukkan Kode Karyawan : ");
                        String cari = input.nextLine();

                        data.cari(cari);

                        System.out.println("");
                        System.out.println("Pilih SubMenu : ");
                        System.out.println("1.Kembali ke menu utama");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int submenu = input.nextInt();
                        if(submenu == 1){
                            caridata = false;
                        } else{
                            System.out.println("Error");
                        }
                    }
                    break;
                
                case 4 : 
                    boolean lihat = true;
                    while(lihat){
                        data.lihat();

                        System.out.println("");
                        System.out.println("Pilih SubMenu : ");
                        System.out.println("1.Kembali ke menu utama");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");

                        int submenu = input.nextInt();
                        if(submenu == 1){
                            lihat = false;
                        } else {
                            System.out.println("Error");
                        }
                    }
                    break;
                    
                case 5 : 
                    System.exit(0);
                
                default: 
                    System.out.println("");
            }          
        }
    }
}
