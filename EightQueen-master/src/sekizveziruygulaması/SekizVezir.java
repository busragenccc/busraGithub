/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sekizveziruygulaması;

/**
 *
 * @author Sedo
 */
public class SekizVezir {
    int [][] tahta =new int[8][8];
    public void Create()
    {
        for(int x=0;x<8;x++)
        {
            int random = (int)(Math.random()*8);
            tahta[random][x]=1;
            continue;
        }
    }
    
     public void VezirleriYazdir()
     {
        int N=8;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N ; j++) {
                if (tahta[i][j] == 1) System.out.print("Q ");
                else           System.out.print("* ");
            }
            System.out.println();
        }  
        System.out.println();
    }
     
     public void VezirleriYazdir(int[][] dizi)
     {
        int N=8;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N ; j++) {
                if (dizi[i][j] == 1) System.out.print("Q ");
                else           System.out.print("* ");
            }
            System.out.println();
        }  
        System.out.println();
    }
     
     public int CakismalariSay()
     {
         int sayac =0;
         int cakisma =0;
         int toplam=0;
         for(int i =0;i<8;i++)
         {
             for(int j=0;j<8;j++)
             {
                 if(tahta[i][j]==1)
                 {
                     sayac++;
                 }
             }
             if(sayac>1)
             {
                cakisma=cakisma+sayac;
                toplam = toplam + (cakisma*(cakisma-1));
             }
             sayac=0;
             cakisma=0;
         }
         return toplam;
     }
     
     public int CakismalariSay(int[][] dizi)
     {
         int sayac =0;
         int cakisma =0;
         int toplam=0;
         for(int i =0;i<8;i++)
         {
             for(int j=0;j<8;j++)
             {
                 if(dizi[i][j]==1)
                 {
                     sayac++;
                 }
             }
             if(sayac>1)
             {
                cakisma=cakisma+sayac;
                toplam = toplam + (cakisma*(cakisma-1));
             }
             sayac=0;
             cakisma=0;
         }
         return toplam;
     }
     
     public int Konfigurasyon()
     {
         int [][]araTahta = tahta.clone();
         
         int minCakisma=CakismalariSay();
         int minX,minY;
         
         for(int i=0;i<8;i++)
         {
             for(int j=0;j<8;j++)
             {
                 if(araTahta[j][i]==1)
                 {
                     araTahta[j][i]=0;
                     int [][] geciciTahta = araTahta.clone();
                     for(int k=0;k<8;k++)
                     {
                             if (geciciTahta[k][i] ==0)
                             {
                               geciciTahta[k][i]=1;
                               if(CakismalariSay(geciciTahta) <minCakisma)
                               {
                                   minCakisma = CakismalariSay(geciciTahta);
                                   minX=i;
                                   minY=k;
                                   System.out.println("Yeni Bulundu");
                                   VezirleriYazdir(geciciTahta);
                                   System.out.println("Yeni Cakisma Sayisi = "+minCakisma);
                               }
                               geciciTahta[k][i]=0;
                             } 
                     }
                     araTahta[j][i]=1;
                 }
             }
         }
         return minCakisma;
     }
     
}
