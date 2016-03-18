/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author User
 */
public class orang {
    private String Nama;
    private String alamat;

    public orang(String Nama) {
        this.Nama = Nama;
    }
    
    public String getNama(String Nama){
        this.Nama = Nama;
        return Nama;
    }
    
    public String getAlamat(String alamat){
        this.alamat = alamat;
        return alamat;
    }
    
    public String setNama(String Nama){
        return Nama;
    }
    
    public String setAlamat(String alamat){
        return alamat;
    }
}
