/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus A450LC
 */
public class Console_Application {
    private ArrayList<Asisten> daftarAsisten = new ArrayList<>();
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    
    public void addAsisten(Asisten daftarAsisten) {
        this.daftarAsisten.add(daftarAsisten);
    }
    public void addMahasiswa(Mahasiswa daftarMahasiswa){
        this.daftarMahasiswa.add(daftarMahasiswa);
    }
    public String getMahasiswa(String nim){
        return nim;
    }
    public void deleteMahasiswa(String nim){
        this.daftarMahasiswa.remove(nim);
    }
    
     public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String pilih;
        
        System.out.println("1. Asisten");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Tugas Besar");
        System.out.println("4. Dokumentasi");
        System.out.println("pilih menu :");
        pilih = in.nextLine();
        switch (pilih){
            case "1":
                System.out.println("contoh");
                break;
            case "2":
                
                break;
            case "3":
                
                break;
            case "4":
                
                break;
        }
     }
}
