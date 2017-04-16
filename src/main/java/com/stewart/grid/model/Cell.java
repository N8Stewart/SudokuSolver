package com.stewart.grid.model;

import java.util.Arrays;

/**
 * A single cell in a Sudoku grid
 */
public class Cell {

    private int value;
    private int[] tentative; // if tentative[1] == 1, then value can be 1.

    /**
     * Create a blank cell with an entropy of 9
     */
    public Cell() {
        this.value = 0;
        this.tentative = new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // offset by 1
    }

    /**
     * Create a cell with pre-defined value (entropy of 1)
     *
     * @param value The value of the cell
     */
    public Cell(final int value) {
        validate(value);
        this.value = value;
        this.tentative = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // offset by 1
        this.tentative[value] = 1;
    }

    private void validate(int value) {
        if (value <= 0 || value > 9)
            throw new IllegalArgumentException(String.format("Invalid Cell value '%d'. Value must be an integer between 1-9.", value));
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        validate(value);
        this.value = value;
    }

    /**
     * Calculate the entropy of the current cell.
     * Entropy in this context is defined as the number of possible values this cell can take on.
     * An entropy of 1 means this cell can only be a single value.
     *
     * @return an integer from 0 to 9. An entropy of 0 means there is no value for the cell which solves the puzzle.
     */
    public int getEntropy() {
        return Arrays.stream(this.tentative).sum();
    }

}
