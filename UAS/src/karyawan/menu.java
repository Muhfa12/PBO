/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;
import java.util.ArrayList;

/**
 *
 * @author Lzer0
 */
public class menu implements interfaces{
    ArrayList<karyawan> datakaryawan = new ArrayList<>();
    
    @java.lang.Override
    public void tambah(karyawan data){
        datakaryawan.add(data);
    }
    
    boolean hapuss = false;

    @java.lang.Override
    public void hapus(String kode){
        for(int i = 0; i < datakaryawan.size(); i++){
            if(datakaryawan.get(i).kodeKar.equals(kode)){
                datakaryawan.remove(i);
                hapuss = true;
                System.out.println("Karyawan berhasil dihapus");
            }else{
                System.out.println("Kode karyawan tidak ditemukan");
            }
        }
    }
    
    boolean dapat = false;
    int index = 0;

    @java.lang.Override
    public void cari(String kode){
        for(int i = 0; i < datakaryawan.size(); i++){            
            if(datakaryawan.get(i).kodeKar.equals(kode)){        
                index = i;
                dapat = true;
            }
        }        
        if(dapat){
            datakaryawan.get(index).lihat();
        }   
    }
    
    @java.lang.Override
    public void lihat(){
        System.out.println("=============================================================================");
        System.out.println("                                DATA KARYAWAN                                ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("KODE" + "\t" + "NAMA" + "\t"+ "GOL"+ "\t"+  "USIA"+ "\t" + "STATUS NIKAH" + "\t" + "JUMLAH ANAK");
        System.out.println("-----------------------------------------------------------------------------");     
        for(int i=0; i <datakaryawan.size(); i++){
            String kode = datakaryawan.get(i).kodeKar;
            String nama = datakaryawan.get(i).namaKar;
            String gol = datakaryawan.get(i).golKar;
            int usia = datakaryawan.get(i).usia;
            String status = "Belum Menikah";
            int jumlahAnak = 0;
            if(datakaryawan.get(i).statusKar == 1){
                status = "Sudah Menikah";
                jumlahAnak = datakaryawan.get(i).jumlahAnak;
            }else if(datakaryawan.get(i).statusKar == 0){
                status = "Belum Menikah";
                jumlahAnak = 0;
            }            
            System.out.println(kode + "\t" + nama + "\t"+ gol+ "\t"+ usia+"\t"+ status +"\t"+ jumlahAnak );
        }        
        System.out.println("-----------------------------------------------------------------------------");        
        System.out.println("Jumlah Data : " + datakaryawan.size());
    }
}
