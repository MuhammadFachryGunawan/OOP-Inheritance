/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author user
 */
public class Fakultas_IF {
    
    public String idDosen;
    public String namaDosen;
    public String MK;

    public Fakultas_IF(String idDosen, String namaDosen, String MK) {
        this.idDosen = idDosen;
        this.namaDosen = namaDosen;
        this.MK = MK;
    }
    
    public void biayaIF(){
        System.out.println("biaya untuk Informatika adalah 10 juta ");
    }
    public void biayaDS(){
        System.out.println("biaya untuk DataScience adalah 8 juta ");
    }
    public void biayaRPL(){
        System.out.println("biaya untuk RPL adalah 7 juta ");
    }
    public void biayaIFINT(){
        System.out.println("biaya untuk Informatika inter adalah 15 juta ");
    }    

    protected void showInfo(){
        System.out.println("Kode Dosen : "+ this.idDosen );
        System.out.println("Nama Dosen : " + this.namaDosen );
        System.out.println("Mata Kuliah Ajar : " + this.MK); 
    }
    
    
    
}
