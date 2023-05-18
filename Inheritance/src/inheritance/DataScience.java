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
public class DataScience extends Fakultas_IF{
    public String jadwalMK;
    public String SKS;
    public String ruangan_kuliah;

    public DataScience (String jadwalMK, String SKS, String ruangan_kuliah, String idDosen, String namaDosen, String MK) {
        super(idDosen, namaDosen, MK);
        this.jadwalMK = jadwalMK;
        this.SKS = SKS;
        this.ruangan_kuliah = ruangan_kuliah;
    }
    
    public void biayaDS(){
        System.out.println("biaya untuk DataScience adalah 8 juta ");
    }
    
    @Override
    public void showInfo(){
        System.out.println("Kode Dosen : "+ this.idDosen + "\nNama Dosen : " + this.namaDosen +"\nMata Kuliah Ajar : " + this.MK  ); 
    }

    public void infoMataKuliah(){
        super.showInfo();
        System.out.println("Jadwal Mata Kuliah : " + this.jadwalMK);
        System.out.println("SKS : " + this.SKS);
        System.out.println("Ruangan : " + this.ruangan_kuliah);
        System.out.println("biaya untuk DataScience adalah 8 juta ");
    }
    
}
