/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsubsum;

import java.util.Arrays;

/**
 *
 * @author Sedo
 */
public class maxSubSumIndis {
    int [] dizi ;
    int toplam;
    int max=0;
    int baslangicIndis;
    int bitisIndis;
    
    public maxSubSumIndis(int[] dizi){
        this.dizi=dizi;
    }
    
    public void findmaxSum(){
        for(int i=1;i<dizi.length+1;i++){
            toplam=0;
            for(int j=i-1;j<dizi.length;j++){
                toplam +=dizi[j];
                if(toplam>max){
                    max=toplam;
                    baslangicIndis=i-1;
                    bitisIndis=j;
                }
            }
        }
        System.out.println(max);
    }
    
    public void writeIndexes(){
        System.out.print("Indisler : ");
        for(int i=baslangicIndis;i<=bitisIndis;i++){
            System.out.print(i+",");
        }
    }
    
}
