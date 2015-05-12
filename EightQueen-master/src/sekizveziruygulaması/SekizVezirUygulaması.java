/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sekizveziruygulaması;

/**
 *
 * @author Sedo
 */
public class SekizVezirUygulaması {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SekizVezir s1 = new SekizVezir();
        
        s1.Create();
        s1.VezirleriYazdir();
        System.out.println("Cakisma Sayisi = " + s1.CakismalariSay()); 
        System.out.println("Son Durum Cakisma Sayisi = " + s1.Konfigurasyon());
    }
}
