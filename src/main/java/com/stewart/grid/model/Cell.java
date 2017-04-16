package com.stewart.grid.model;

import java.util.Arrays;

/**
 * A single cell in a Sudoku grid
 */
public class Cell {

    private int value;
    private int[] possibility; // if tentative[1] == 1, then value can be 1.

    /**
     * Create a blank cell with an entropy of 9
     */
    public Cell() {
        this.value = 0;
        this.possibility = new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 1}; // offset by 1
    }

    /**
     * Create a cell with pre-defined value (entropy of 1)
     *
     * @param value The value of the cell
     */
    public Cell(final int value) {
        setValue(value);
    }

    private void validate(final int value) {
        if (value <= 0 || value > 9)
            throw new IllegalArgumentException(String.format("Invalid Cell value '%d'. Value must be an integer between 1-9.", value));
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        validate(value);
        this.value = value;
        this.possibility = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // offset by 1
        this.possibility[value] = 1;
    }

    /**
     * Calculate the entropy of the current cell.
     * Entropy in this context is defined as the number of possible values this cell can take on.
     * An entropy of 1 means this cell can only be a single value.
     *
     * @return an integer from 0 to 9. An entropy of 0 means there is no value for the cell which solves the puzzle.
     */
    public int getEntropy() {
        return Arrays.stream(this.possibility).sum();
    }

    /**
     * Clear a possible value from the list of possibilities.
     * If the possibility of {@code value} is 1, decrease the entropy by 1.
     *
     * @param value the value to clear from the list of possibilities
     * @return the value of this cell if entropy == 1; otherwise, return 0
     */
    public int clearPossibility(final int value) {
        validate(value);
        this.possibility[value] = 0;
        this.value = 0;
        if (getEntropy() == 1)
            for (int i = 1; i <= 9; i++)
                if (this.possibility[i] == 1)
                    this.value = i;

        return this.value;
    }

}
