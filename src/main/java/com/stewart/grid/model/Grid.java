package com.stewart.grid.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * A square grid of variable size
 */
@ToString
@EqualsAndHashCode
public class Grid {

    public static final int DEFAULT_SIZE = 9;

    @Getter
    private int size;
    @Getter
    private Map<Coordinate, Cell> cells;

    /**
     * Create an empty grid of size {@code size}
     *
     * @param size the length of the sides of the grid
     */
    public Grid(final int size) {
        if (size <= 0)
            throw new IllegalArgumentException(String.format("Invalid Grid Size: %d. Grid size must be and integer and >= 1", size));

        this.size = size;
        cells = new HashMap<>();
        generateEmptyGrid();
    }

    /**
     * Create an empty grid of default size {@code DEFAULT_SIZE}
     */
    public Grid() {
        this(DEFAULT_SIZE);
    }

    private void generateEmptyGrid() {
        for (int row = 0; row < this.size; row++) {
            for (int col = 0; col < this.size; col++) {
                cells.put(Coordinate.of(row, col), new Cell());
            }
        }
    }

}
