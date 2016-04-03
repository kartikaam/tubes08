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
    public Mahasiswa getMahasiswa(String nim){
        int i = 0;
            boolean found = false;
            while ((i<daftarMahasiswa.size()) && (!found) ){
                if(nim.equals(daftarMahasiswa.get(i).getNim())){
                    found = true;
                }
                i++;
            }

            if (found){
                return daftarMahasiswa.get(i);
            } else {
                return null;
            }
    }
    public void deleteMahasiswa(String nim){
        this.daftarMahasiswa.remove(nim);
    }
    
    void clear() {
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            }
    }
    
    void tanya() {
        System.out.print("Kembali ke Menu Utama?(Y/N) ");
        String tanya = in.next();
        if (tanya.equals("Y")) {
            clear();
            mainMenu();
        } else {
            System.exit(0);
        }
    }
    public void menuAsisten(){
        String pil;
        System.out.println("1. Tambah Asisten");
        System.out.println("2. Edit Asisten");
        System.out.println("3. Search Asisten");
        System.out.println("4. Kembali ke menu Awal");
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
                }else{
                    System.out.println("Asisten dengan "+getAsisten(nama).getNama()+"tersedia");
                }
                break;
            case "4":
                clear();
                mainMenu();
            }
    }
    
    public void menuMahasiswa(){
        String pil;
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Edit Mahasiswa");
        System.out.println("3. Search Mahasiswa");
        System.out.println("4. Kembali ke menu utama");
        System.out.println("Pilih : ");
        pil = in.nextLine();
        switch (pil){
            case "1":
                System.out.println("Nama Mahasiswa : ");
                String nama = in.nextLine();
                Mahasiswa mhs = new Mahasiswa(nama);
                this.addMahasiswa(mhs);
                break;
            case "2":
                System.out.println("Masukkan NIM Mahasiswa : ");
                String nim = in.nextLine();
                Mahasiswa m = this.getMahasiswa(nim);
                if (this.getMahasiswa(nim) == null){
                    System.out.println("Tidak ada Mahasiswa dengan nim tersebut");
                }else{
                    m.toString();
                    System.out.println("Nama baru : ");
                    nama =in.nextLine();
                    System.out.println("NIM baru : ");
                    nim =in.nextLine();
                    System.out.println("Kelas baru : ");
                    String kelas = in.nextLine();
                    
                    m.setNama(nama);
                    m.setNim(nim);
                    m.setKelas(kelas);
                }
                break;
            case "3":
                System.out.println("Search Mahasiswa berdasarkan NIM : ");
                nim = in.nextLine();
                this.getMahasiswa(nim);
                if (this.getMahasiswa(nim) == null){
                    System.out.println("tidak ada mahasiswa dengan nim tersebut");
                }else{
                    System.out.println("Mahasiswa dengan "+getMahasiswa(nim).getNim()+"tersedia");
                }
                break;
            case "4":
                clear();
                mainMenu();
            }
    }
    
    public void menuTugasBesar(){
        String pil;
        System.out.println("1. Create Tugas Besar");
        System.out.println("2. Delete Tugas Besar");
        System.out.println("3. Kembali ke menu utama");
        System.out.println("pilih : ");
        pil = in.nextLine();
        switch(pil){
            case "1":
                int i=0;
                System.out.println("Masukkan nama Asisten : ");
                String nama = in.nextLine();
                if(nama.equals(daftarAsisten.get(i).getNama())){
                    System.out.println("Judul Tugas Besar : ");
                    String judul = in.nextLine();
                    getAsisten(nama).createTugasBesar(judul);
                }
                tanya();
                break;
            case "2":
                i=0;
                System.out.println("Masukkan nama Asisten : ");
                nama = in.nextLine();
                if(nama.equals(daftarAsisten.get(i).getNama())){
                    System.out.print("Hapus data Tugas Besar ke- ");
                    int b = in.nextInt();
                    getAsisten(nama).removeTugasBesar(b);
                }
                tanya();
                break;
            case "3":
                clear();
                mainMenu();
        }
    }
    
    public void menuDokumentasi(){
        
    }
    
     public void mainMenu(){
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
