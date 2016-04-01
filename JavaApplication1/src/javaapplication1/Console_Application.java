/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Asus A450LC
 */

public class Console_Application {
    Scanner in = new Scanner(System.in);
    private ArrayList<Asisten> daftarAsisten = new ArrayList<>();
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private String getAsisten;
    private int size;
    private int found;
    
    public void addAsisten(Asisten daftarAsisten) {
        this.daftarAsisten.add(daftarAsisten);
    }
    public Asisten getAsisten(String nama){
            int i = 0;
            boolean found = false;
            while ((i<daftarAsisten.size()) && (!found) ){
                if(nama.equals(daftarAsisten.get(i).getNama())){
                    found = true;
                }
                i++;
            }

            if (found){
                return daftarAsisten.get(i);
            } else {
                return null;
            }
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
    
    public void menuAsisten(){
        String pil;
        System.out.println("1. Tambah Asisten");
        System.out.println("2. Edit Asisten");
        System.out.println("3. Search Asisten");
        System.out.println("pilih : ");
        pil = in.nextLine();
        switch (pil){
            case "1":
                System.out.println("Nama Asisten : ");
                String nama = in.nextLine();
                Asisten as = new Asisten(nama);
                this.addAsisten(as);
                break;
            case "2":
                System.out.println("Edit Asisten : ");
                nama = in.nextLine();
                Asisten a = this.getAsisten(nama);
                if (this.getAsisten == null){
                    System.out.println("tidak ada asisten dengan nama tersebut");
                }else{
                    a.toString();
                    System.out.println("Nama baru : ");
                    nama =in.nextLine();
                    System.out.println("Alamat baru : ");
                    String alamat =in.nextLine();
                    a.setNama(nama);
                    a.setAlamat(alamat);
                }
                break;
            case "3":
                System.out.println("Search Asisten : ");
                nama = in.nextLine();
                this.getAsisten(nama);
                if (this.getAsisten == null){
                    System.out.println("tidak ada asisten dengan nama tersebut");
                }
                break;
    }}
    
    public void menuMahasiswa(){
        String pil;
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Edit Mahasiswa");
        System.out.println("3. Search Mahasiswa");
        System.out.println("pilih : ");
        pil = in.nextLine();
        switch (pil){
            case "1":
                System.out.println("Nama Mahasiswa : ");
                String nama = in.nextLine();
                Mahasiswa mhs = new Mahasiswa(nama);
                this.addMahasiswa(mhs);
                break;
            case "2":
                break;
            case "3":
                break;
    }}
    
    public void menuTugasBesar(String String){
        String pil;
        System.out.println("1. Create Tugas Besar");
        System.out.println("2. Edit Tugas Besar");
        System.out.println("3. Delete Tugas Besar");
        System.out.println("4. Search Tugas Besar");
        System.out.println("pilih : ");
        pil = in.nextLine();
        switch(pil){
            case "1":
                daftarAsisten.createTugasBesar(String judul);
                break;
            case "2":
                break;
            case "3":
                break;
        }
    }
    
    public void menuDokumentasi(){
        
    }
    
     public void main_menu(){
        String pilih;
        System.out.println("1. Asisten");
        System.out.println("2. Mahasiswa");
        System.out.println("3. Tugas Besar");
        System.out.println("4. Dokumentasi");
        System.out.println("pilih menu :");
        pilih = in.nextLine();
        switch (pilih){
            case "1":
                this.menuAsisten();
                break;
            case "2":
                this.menuMahasiswa();
                break;
            case "3":
                this.menuTugasBesar();
                break;
            case "4":
                this.menuDokumentasi();
                break;
        }
     }
}
