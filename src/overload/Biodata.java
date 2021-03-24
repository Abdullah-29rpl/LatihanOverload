/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Biodata {
    Scanner input = new Scanner (System.in);
    //overlod nama void sama beda parameter
    public void Siswa(){
        String Nama, Kelas, Absen;// variable
        System.out.println(" Isi Data Siswa ");
        System.out.println("================");
        System.out.print("Nama : ");
        Nama = input.nextLine();
        System.out.print("Kelas : ");
        Kelas = input.nextLine();
        System.out.print("Absen : ");
        Absen = input.nextLine();
        System.out.println("");
        System.out.println("Nama : " + Nama);
        System.out.println("Kelas : " + Kelas);
        System.out.println("Absen : " + Absen);
        System.out.println("=================");
        System.out.println(" Tanpa Parameter ");
    }
    public void Siswa(String Nama, String Kelas, String Absen){//variable parameter
        System.out.println(" Isi Data Siswa ");
        System.out.println("================");
        System.out.print("Nama : ");
        Nama = input.nextLine();
        System.out.print("Kelas : ");
        Kelas = input.nextLine();
        System.out.print("Absen : ");
        Absen = input.nextLine();
        System.out.println("");
        System.out.println("Nama : " + Nama);
        System.out.println("Kelas : " + Kelas);
        System.out.println("Absen : " + Absen);
        System.out.println("==================");
        System.out.println(" Dengan Parameter ");
        
    }
}
