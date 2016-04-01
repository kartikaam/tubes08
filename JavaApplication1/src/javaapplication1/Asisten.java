/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author KARTIKAAM
 */
public class Asisten extends orang {
     private ArrayList<TugasBesar> tb = new ArrayList<>();

    public Asisten(String Nama) {
        super(Nama);
    }
    
    public void createTugasBesar(String judul){
        TugasBesar tb = new TugasBesar();
        tb.setJudul(judul);
        this.tb.add(tb);
    }
    
    public void removeTugasBesar(int indeks){
        tb.remove(indeks);
    }
    @Override
    public void setNama(String Nama){
        super.setNama(Nama);
    }
    
     @Override
    public void setAlamat(String alamat){
        super.setAlamat(alamat);
    }
}
