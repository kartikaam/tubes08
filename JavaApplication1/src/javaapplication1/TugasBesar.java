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
public class TugasBesar {
    private ArrayList<dokumentasi> dk = new ArrayList<>();
    private ArrayList<Mahasiswa> m = new ArrayList<>();
    private String judul;
    
    public void addMember(Mahasiswa m) {
        this.m.add(m);
    }
    
    public Mahasiswa getMember(int indeks){
        if (indeks<m.size()){
            return m.get(indeks);
        }
        return null;
    }
    
    public Mahasiswa getMember(String nim){
        for (int i=0; i<m.size(); i++){
            if(m.get(i).getNim()==nim){
                return m.get(i);
            }
        }
        return null;
    }
    
    public void removeMember(int indeks){
        this.m.remove(indeks);
    }
    
    public void createDokumentasi(String judul, int jmlhal, tanggal tgl){
        dokumentasi d = new dokumentasi();
        d.setJmlhal(jmlhal);
        d.setJudul(judul);
        d.setTgl(tgl);
        dk.add(d);
    }
    
    public dokumentasi getDokumentasi(int indeks){
        if (indeks<dk.size()){
            return dk.get(indeks);
        }
        return null;
    }
    
    public void removeDokumentasi(int indeks){
        this.dk.remove(indeks);
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}


