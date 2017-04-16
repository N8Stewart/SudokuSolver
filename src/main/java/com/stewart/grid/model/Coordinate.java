package com.stewart.grid.model;

/**
 * A coordinate used to identify the location of an individual cell
 */
public class Coordinate {
    private final int row;
    private final int column;

    public Coordinate(final int row, final int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
