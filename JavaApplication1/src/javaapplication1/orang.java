/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author User
 */
public abstract class orang {
    private String Nama;
    private String alamat;

    public orang(String Nama) {
        this.Nama = Nama;
    }
    
    public String getNama(){
        this.Nama = Nama;
        return Nama;
    }
    
    public String getAlamat(){
        this.alamat = alamat;
        return alamat;
    }
    
    public void setNama(String Nama){
        Nama = Nama;
    }
    
    public void setAlamat(String alamat){
        alamat = alamat;
    }
}
