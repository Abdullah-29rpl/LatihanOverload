/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author apple
 */
public class Overload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //objek 
        Biodata tampil = new Biodata();
        
        tampil.Siswa();
        System.out.println("");
        System.out.println("");
        tampil.Siswa("", "", "");
    }
    
}
