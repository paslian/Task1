/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg1;

/**
 *
 * @author hp
 */
 class namabiodata {
        String namaLengkap;
        String tempatLahir;
        String tanggalLahir;
        String hobi;
        String zodiak;
        String makananFavorit;
        String citaCita;
}

public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        namabiodata saya = new namabiodata();
         saya.namaLengkap = "Paslian Sahat Rafael";
         saya.tempatLahir = "Jakarta";
         saya.tanggalLahir = "21 Oktober 2003";
         saya.hobi = "Membaca";
         saya.zodiak = "Libra";
         saya.makananFavorit = "Mie";
         saya.citaCita = "Software Enginner";

        System.out.println(saya.namaLengkap);
        System.out.println(saya.tempatLahir);
        System.out.println(saya.tanggalLahir);
        System.out.println(saya.hobi);
        System.out.println(saya.zodiak);
        System.out.println(saya.makananFavorit);
        System.out.println(saya.citaCita);
    }
    
}
