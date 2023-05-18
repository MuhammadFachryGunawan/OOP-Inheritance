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
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------------------------");
        Informatika prodi_if = new Informatika("Senin , 15.30 -18.30","3","TULT 0702","ISB","Imanuel Sembiring","PBO");
        Fakultas_IF fif = new Informatika("Senin , 15.30 - 18.30","3","TULT 0702","ISB","Imanuel Sembiring","PBO");
        prodi_if.infoMataKuliah();
        System.out.println("");
        fif.showInfo();
        
        System.out.println("--------------------------");
        System.out.println("");
        
        DataScience prodi_ds = new DataScience("Selasa , 12.30 - 14.00","3","GKU 34","AQB","akmal qris","SQL");
        Fakultas_IF fds = new DataScience("Selasa , 12.30 - 14.00","3","GKU 34","AQB","akmal qris","SQL");
        prodi_ds.infoMataKuliah();
        System.out.println("");
        fds.showInfo();
        
        System.out.println("--------------------------");
        System.out.println("");
        
        RPL prodi_RPL = new RPL("Kamis , 12.30 - 14.00","2","GKU 0678","KMK","kumala ma kumala","Python");
        Fakultas_IF fRPL = new RPL("Kamis , 12.30 - 14.00","2","GKU 0678","KMK","kumala ma kumala","Python");
        prodi_RPL.infoMataKuliah();
        System.out.println("");
        fRPL.showInfo();
        
        System.out.println("--------------------------");
        System.out.println(""); 
        
        informatikaint prodi_ifint = new informatikaint("Sabtu , 20.00 - 21.00","3","TULT 0713","MIM","mamut insah maymunah","Cyber Security");
        Fakultas_IF ifint = new informatikaint("Sabtu , 20.00 - 21.00","3","TULT 0713","MIM","mamut insah maymunah","Cyber Security");
        prodi_ifint.infoMataKuliah();
        System.out.println("");
        ifint.showInfo();
        
        System.out.println("--------------------------");
        System.out.println("");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
