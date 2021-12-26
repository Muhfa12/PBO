/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Lzer0
 */
public class karyawan {
    public String kodeKar,namaKar,alamatKar,tglKar,golKar;
    private int d,m,y;
    boolean statusTunjMen = false,statusTunjAnak = false,statusTunjTua = false;
    public int usia,statusKar,jumlahAnak,gp,tunjMen,tunjTua,tunjAnak,gajiKtr,potongan,gajiBersih;
    
    public karyawan(String kode, String nama, String alamat, String tgl, String gol, int status, int jmlanak){
        this.kodeKar = kode;
        this.namaKar = nama;
        this.alamatKar = alamat;
        this.tglKar = tgl;
        this.golKar = gol;
        this.statusKar = status;
        this.jumlahAnak = jmlanak;
        
        String tglLahir =  this.tglKar;
        String[] Lahir = tglLahir.split("-");
        y = Integer.parseInt(Lahir[0] );
        m = Integer.parseInt(Lahir[1] );
        d = Integer.parseInt(Lahir[2] );
        
        LocalDate from = LocalDate.of(y, m, d);
        LocalDate today = LocalDate.now();
        
        int usiaa = Period.between(from, today).getYears();
        this.usia = usiaa;
        
        switch (golKar) {
            case "A":
                gp = 5000000;
                break;
            case "B":
                gp = 6000000;
                break;
            case "C":
                gp = 7000000;
                break;
        }        
        switch(statusKar ){
            case 1 : 
                this.tunjMen = gp*10/100;
                this.statusTunjMen = true;
                break;
        }        
        switch(statusKar){
            case 1 :
                if(jumlahAnak>0){
                    tunjAnak = jumlahAnak*gp*5/100;
                    statusTunjAnak = true;
                }
                break;
        }        
        if(usia>30){
            tunjTua = gp*15/100;
            statusTunjTua = true;
        }        
        gajiKtr = gp + tunjMen + tunjAnak + tunjTua;
        potongan = gajiKtr*25/1000;
        gajiBersih = gajiKtr - potongan;
    }
    
    public void lihat(){
        System.out.println("=========================================================");
        System.out.println("                  DATA PROFILE KARYAWAN                  ");
        System.out.println("---------------------------------------------------------");
        System.out.println("Kode Karyawan           : " + kodeKar);
        System.out.println("Nama Karyawan           : " + namaKar);
        System.out.println("Golongan                : " + golKar);
        System.out.println("Usia                    : " + usia);
        switch(statusKar){
            case 0 :
                System.out.println("Status Menikah          : Belum Menikah");
                System.out.println("---------------------------------------------------------");
                break;
            
            case 1 :
                System.out.println("Status Menikah          : Sudah Menikah");
                System.out.println("Jumlah Anak             : " + jumlahAnak);
                System.out.println("---------------------------------------------------------");
        }
        System.out.println("Gaji Pokok              : Rp" + gp);      
        if(statusTunjMen){
            System.out.println("Tunjangan Istri/Suami   : Rp" + tunjMen );
        }if(statusTunjTua){
            System.out.println("Tunjangan Pegawai       : Rp" + tunjTua);
        }if(statusTunjAnak){ 
            System.out.println("Tunjangan Anak          : Rp" + tunjAnak);
        } else {
        }
        System.out.println("--------------------------------------------------------- +");
        System.out.println("Gaji Kotor              : Rp" + gajiKtr);
        System.out.println("Potongan                : Rp" + potongan);
        System.out.println("--------------------------------------------------------- -");
        System.out.println("Gaji Bersih             : Rp" + gajiBersih);
    }
}
