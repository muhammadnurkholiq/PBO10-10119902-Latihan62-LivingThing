/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA     : Muhammad Nurkholiq
 * KELAS    : IF10K
 * NIM  `   : 10119902
 * Deskripsi Program    : Program Ini Untuk Menampilkan Program Living Thing
 * 
 */ 
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println("==== Aktivitas ");
        human.setNama("Muhammad Nurkholiq");
               
        human.Breath(human.getNama());
        human.walk(human.getNama());
        human.eat(human.getNama());
    }
    
}
