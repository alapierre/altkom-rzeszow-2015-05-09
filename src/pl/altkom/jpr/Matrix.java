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
public class Matrix {

    protected double var[][];

    public Matrix(int rows, int columns) {
        var = new double[rows][columns];
    }

    public void setValue(int r, int c, double value) {
        var[r][c] = value;
    }

    public double getValue(int r, int c) {
        return var[r][c];
    }

}
