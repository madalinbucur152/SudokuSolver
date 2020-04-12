package com.madalinBucur;

public class Main {

    public static void main(String[] args) {

        Sudoku sudoku = new Sudoku(Sudoku.sudokuToSolve);
        System.out.println("Sudoku grid to solve");
        sudoku.display();

        // we try resolution
        if (sudoku.solve()) {
            System.out.println("Sudoku grid solved with  backtracking");
            sudoku.display();
            //  System.out.println("Number of backtracks = " + b);
        } else {
            System.out.println("Unsolvable");
        }
    }
}
