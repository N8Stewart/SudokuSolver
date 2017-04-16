package com.stewart.grid.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Map;

/**
 * A square grid of variable size
 */
@ToString
@EqualsAndHashCode
public class Grid {
    private int size;
    private Map<Coordinate, Cell> cells;
}
