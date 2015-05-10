/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr;

/**
 *
 * @author Administrator
 */
public class ArrayList<T> {

    protected Object[] var;
    private int currentElement;

    public ArrayList(int size) {
        var = new Object[size];
    }

    public ArrayList() {
        var = new Object[10];
    }

    public void add(T value) {

        if (var.length == currentElement) {
            extendArray(10);
        }

        var[currentElement++] = value;
    }

    private void extendArray(int sizeDelta) {
        Object[] tmp = new Object[var.length + sizeDelta];
        System.arraycopy(var, 0, tmp, 0, var.length);
        var = tmp;
    }

    public T get(int index) {
        return (T) var[index];
    }

}
