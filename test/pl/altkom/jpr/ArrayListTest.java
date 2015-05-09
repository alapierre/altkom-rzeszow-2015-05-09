/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class ArrayListTest {
    
    public ArrayListTest() {
    }

    /**
     * Test of add method, of class ArrayList.
     */
    @Test
    public void testAdd() {
        
        ArrayList list = new ArrayList();
        
        for(int i = 0; i<100; i++) {
            list.add(i);
        }
        
        System.out.println(Arrays.toString(list.var));
        
        for(int i = 0; i<100; i++) {
            assert (Integer)list.var[i] == i;
        }
    }
    
    @Test
    public void testGet() {
        
        ArrayList list = new ArrayList();
        
        list.add(12);
        
        assert (Integer)list.get(0) == 12;
                
    }
}
