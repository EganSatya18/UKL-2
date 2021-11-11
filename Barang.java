/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobalelang2;

import java.util.ArrayList;

public class Barang{
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public void setIdMasyarakat(int idMasyarakat){
        this.idMasyarakat.add(idMasyarakat);
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public void setHargaAwal(int hargaAwal){
        this.hargaAwal.add(hargaAwal);
    }
    public void setStatus(boolean status){
        this.status.add(status);
    }
    
    public int getIdMasyarakat(int id){
        return this.idMasyarakat.get(id);
    }
    public String getNamaBarang(int id){
        return this.namaBarang.get(id);
    }
    public int getHargaAwal(int id){
        return this.hargaAwal.get(id);
    }
    public boolean getStatus(int id){
        return this.status.get(id);
    }
    public int getJumlahBarang(){
        return this.namaBarang.size();
    }
    public void editStatus(int id, boolean status){
        this.status.set(id, status);
    }
}
