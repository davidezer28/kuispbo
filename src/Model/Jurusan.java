package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Davjd
 */
public class Jurusan {
    private String kode;
    private String nama;
    
    public Jurusan(){
    }
    
    public Jurusan(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
    }
    
    public String getKode(){
        return kode;
    } 
    
    public void setKode(){
        this.kode = kode;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(){
        this.nama = nama;
    }
    
}