/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmaanalizi;

/**
 *
 * @author Sedo
 */
public class Stack extends ArrayBasedList {

    int top;

    public Stack() {
        arrayList = new int[DEFAULT_SIZE];
    }

    void push(int x) {
        if (currentSize == arrayList.length) {
            genislet();
        }
        arrayList[top]=x;
        top++;
        currentSize++;
    }
    
    void pop()
    {
        arrayList[top]=0;
        top--;
        currentSize--;
    }

    void sifirla() {
        currentSize = 0;
        top = -1;
    }

    boolean bosMu() {
        return currentSize == 0;
    }
}
