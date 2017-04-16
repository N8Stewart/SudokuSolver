package com.stewart.grid.model;

import lombok.*;

/**
 * A coordinate used to identify the location of an individual cell
 */
@ToString
@EqualsAndHashCode
public class Coordinate {
    @Getter
    private final int row;
    @Getter
    private final int column;

    public Coordinate(final int column, final int row) {
        this.row = row;
        this.column = column;
    }

    public static Coordinate of(final int row, final int column) {
        return new Coordinate(row, column);
    }

}
