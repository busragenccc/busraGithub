/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsubsum;

/**
 *
 * @author Sedo
 */
public class MaxSubSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] dizi = {1,-3,5,-8,5,1,7,1};
        maxSubSumIndis m = new maxSubSumIndis(dizi);
        m.findmaxSum();
        m.writeIndexes();
    }
}
