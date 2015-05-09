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
public class ArrayList {
    
    protected Object[] var;
    private int currentElement;

    public ArrayList() {
        var = new Object[10];
    }
    
    public void add(Object value) {
        
        if(var.length == currentElement) {
            Object[] tmp = new Object[var.length + 10];
            System.arraycopy(var, 0, tmp, 0, var.length);
            var = tmp;
        }
        
        var[currentElement++] = value;
        
    }
    
    public Object get(int index) {
        return var[index];
    }
    
}
