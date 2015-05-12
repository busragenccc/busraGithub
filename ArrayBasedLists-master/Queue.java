/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmaanalizi;

/**
 *
 * @author Sedo
 */
public class Queue extends ArrayBasedList {

    int bas, son;

    public Queue() {
        arrayList = new int[DEFAULT_SIZE];
        sifirla();
    }

    void enqueue(int x) {
        if (currentSize == arrayList.length) {
            genislet();
        }
        son = increment(son);
        arrayList[son] = x;
        currentSize++;
    }

    public void dequeue() {
        if (bosMu()) {
            System.out.println("Kuyruk Boş");
        }
        currentSize--;

        int returnValue = arrayList[ bas];
        bas = increment(bas);
    }

    void sifirla() {
        currentSize = 0;
        bas = 0;
        son = -1;
    }

    boolean bosMu() {
        return currentSize == 0;
    }

    private int increment(int x) {
        if (++x == arrayList.length) {
            x = 0;
        }
        return x;
    }
}
