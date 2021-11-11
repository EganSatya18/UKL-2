/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobalelang2;

import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telp = new ArrayList<String>();
    
    public Petugas(){
        this.namaPetugas.add("Aryo");
        this.alamat.add("Nganjuk");
        this.telp.add("081235867923");
        
        this.namaPetugas.add("Krisna");
        this.alamat.add("Sidoarjo");
        this.telp.add("081209347932");
    }
    
    @Override
    public void setNama(String nama){
        this.namaPetugas.add(nama);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelp(String telp){
        this.telp.add(telp);
    }
    
    @Override
    public String getNama(int id){
        return this.namaPetugas.get(id);
    }
    @Override
    public String getAlamat(int id){
        return this.alamat.get(id);
    }
    @Override
    public String getTelp(int id){
        return this.telp.get(id);
    }
    public int getJumlahPetugas(){
        return this.namaPetugas.size();
    }
}
