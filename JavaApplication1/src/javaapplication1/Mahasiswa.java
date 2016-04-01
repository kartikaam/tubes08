/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Asus A450LC
 */
public class Mahasiswa extends orang {
    private String nim;
    private String kelas;
    
    public Mahasiswa(String nama, String nim, String kelas){
        super(nama);
        this.nim=nim;
        this.kelas=kelas;
    }
    
    public Mahasiswa(String nama, String nim){
        super(nama);
        this.nim=nim;
    }
    
    public Mahasiswa(String nama){
        super(nama);
    }
    
    public void setNim(String nim){
        this.nim=nim;
    }
    public String getNim(){
        return nim;
    }
    public void setKelas(String kelas){
        this.kelas=kelas;
    }
    public String getKelas(){
        return kelas;
    }

}
