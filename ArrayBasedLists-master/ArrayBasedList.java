/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmaanalizi;

/**
 *
 * @author Sedo
 */
public class ArrayBasedList {

    int[] arrayList;
    static final int DEFAULT_SIZE = 10;
    int currentSize;

    void add(int deger) {
        int uzunluk = arrayList.length;
        arrayList[uzunluk] = deger;
    }

    void genislet() {
        int[] newArray;

        newArray = new int[arrayList.length * 2];

        for (int i = 0; i < currentSize; i++) {
            newArray[i] = arrayList[i];
        }
        arrayList = newArray.clone();
    }

}
