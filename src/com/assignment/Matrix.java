//Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object.
// The Matrix class has the following information:
// 1.number of rows of matrix
// 2.number of columns of matrix3 - elements of matrix in the form of 2D arrayThe Matrix class has methods for each of the following:
// 1 - get the number of rows
// 2 - get the number of columns
// 3 - set the elements of the matrix at given position (i,j)
// 4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.5 - multiplying the two matrices
package com.assignment;
import java.util.Scanner;
public class Matrix {
    private int rows;
    private int columns;
    private int elements[][];
    Matrix(int rows, int columns){

    }
    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public void setElements(int[][] elements) {
        this.elements = elements;
    }
}
