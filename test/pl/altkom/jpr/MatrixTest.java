/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class MatrixTest {

    public MatrixTest() {
    }

    /**
     * Test of setValue method, of class Matrix.
     */
    @Test
    public void testSetValue() {

        Matrix matrix = new Matrix(3, 3);

        matrix.setValue(1, 1, 12);

        assert matrix.var[1][1] == 12;

    }

    @Test
    public void testSetValueError() {

        Matrix matrix = new Matrix(3, 3);

        matrix.setValue(1, 1, 12);

        assert !(matrix.var[1][1] == 1);

    }

    /**
     * Test of getValue method, of class Matrix.
     */
    @Test
    public void testGetValue() {

        Matrix matrix = new Matrix(3, 3);

        matrix.var[0][0] = 11;

        assert matrix.getValue(0, 0) == 11;

    }

}
