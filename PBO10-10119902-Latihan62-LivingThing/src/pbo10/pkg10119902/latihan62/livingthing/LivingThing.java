/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan62.livingthing;

/**
 *
 * @author korik
 */
public abstract class LivingThing {
    public abstract void Breath(String nama);
    
    public void walk(String nama) {
        System.out.println(nama + " Berjalan ");
    }
     public void eat(String nama){
         System.out.println(nama + " Makan ");
     }   
}