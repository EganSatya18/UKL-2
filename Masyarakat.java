/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobalelang2; 

import java.util.ArrayList;

public class Masyarakat implements User {
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telp = new ArrayList<String>();
    
    public Masyarakat(){
        this.namaMasyarakat.add("Satya");
        this.alamat.add("Batu");
        this.telp.add("081227857687");
        
        this.namaMasyarakat.add("Lio");
        this.alamat.add("Bumiaji");
        this.telp.add("081278364828");
        
        this.namaMasyarakat.add("Kezhia");
        this.alamat.add("Tumpang");
        this.telp.add("0817659287842");
        
        this.namaMasyarakat.add("Erina");
        this.alamat.add("Sukun");
        this.telp.add("0810912789812");
        
        this.namaMasyarakat.add("Hildan");
        this.alamat.add("Turen");
        this.telp.add("081289880943");
    }
    
    @Override
    public void setNama(String nama){
        this.namaMasyarakat.add(nama);
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
        return this.namaMasyarakat.get(id);
    }
    @Override
    public String getAlamat(int id){
        return this.alamat.get(id);
    }
    @Override
    public String getTelp(int id){
        return this.telp.get(id);
    }
    public int getJumlahMasyarakat(){
        return this.namaMasyarakat.size();
    }
}
