package com.stewart.helpers;

import com.stewart.grid.model.Coordinate;
import com.stewart.grid.model.Grid;

public class TestHelpers {

    public static Grid getPartialGrid() {
        final Grid grid = new Grid();

        // Fill out the grid
        grid.getCell(Coordinate.of(0, 0)).setValue(3);
        grid.getCell(Coordinate.of(0, 5)).setValue(9);

        grid.getCell(Coordinate.of(1, 0)).setValue(2);
        grid.getCell(Coordinate.of(1, 2)).setValue(5);
        grid.getCell(Coordinate.of(1, 3)).setValue(4);
        grid.getCell(Coordinate.of(1, 4)).setValue(6);
        grid.getCell(Coordinate.of(1, 5)).setValue(3);
        grid.getCell(Coordinate.of(1, 7)).setValue(1);

        grid.getCell(Coordinate.of(2, 1)).setValue(1);
        grid.getCell(Coordinate.of(2, 4)).setValue(5);
        grid.getCell(Coordinate.of(2, 6)).setValue(4);

        grid.getCell(Coordinate.of(3, 0)).setValue(8);
        grid.getCell(Coordinate.of(3, 1)).setValue(2);
        grid.getCell(Coordinate.of(3, 4)).setValue(3);
        grid.getCell(Coordinate.of(3, 8)).setValue(4);

        grid.getCell(Coordinate.of(4, 1)).setValue(5);
        grid.getCell(Coordinate.of(4, 2)).setValue(1);
        grid.getCell(Coordinate.of(4, 3)).setValue(8);
        grid.getCell(Coordinate.of(4, 5)).setValue(6);
        grid.getCell(Coordinate.of(4, 6)).setValue(3);
        grid.getCell(Coordinate.of(4, 7)).setValue(7);

        grid.getCell(Coordinate.of(5, 0)).setValue(6);
        grid.getCell(Coordinate.of(5, 4)).setValue(2);
        grid.getCell(Coordinate.of(5, 7)).setValue(5);
        grid.getCell(Coordinate.of(5, 8)).setValue(8);

        grid.getCell(Coordinate.of(6, 2)).setValue(3);
        grid.getCell(Coordinate.of(6, 4)).setValue(8);
        grid.getCell(Coordinate.of(6, 7)).setValue(4);

        grid.getCell(Coordinate.of(7, 1)).setValue(6);
        grid.getCell(Coordinate.of(7, 3)).setValue(1);
        grid.getCell(Coordinate.of(7, 4)).setValue(7);
        grid.getCell(Coordinate.of(7, 5)).setValue(5);
        grid.getCell(Coordinate.of(7, 6)).setValue(2);
        grid.getCell(Coordinate.of(7, 8)).setValue(9);

        grid.getCell(Coordinate.of(8, 3)).setValue(3);
        grid.getCell(Coordinate.of(8, 8)).setValue(6);

        return grid;
    }

    public static Grid getFullGrid() {
        final Grid grid = new Grid();

        // Fill out the grid
        grid.getCell(Coordinate.of(0, 0)).setValue(8);
        grid.getCell(Coordinate.of(0, 1)).setValue(2);
        grid.getCell(Coordinate.of(0, 2)).setValue(7);
        grid.getCell(Coordinate.of(0, 3)).setValue(1);
        grid.getCell(Coordinate.of(0, 4)).setValue(5);
        grid.getCell(Coordinate.of(0, 5)).setValue(4);
        grid.getCell(Coordinate.of(0, 6)).setValue(3);
        grid.getCell(Coordinate.of(0, 7)).setValue(9);
        grid.getCell(Coordinate.of(0, 8)).setValue(6);

        grid.getCell(Coordinate.of(1, 0)).setValue(9);
        grid.getCell(Coordinate.of(1, 1)).setValue(6);
        grid.getCell(Coordinate.of(1, 2)).setValue(5);
        grid.getCell(Coordinate.of(1, 3)).setValue(3);
        grid.getCell(Coordinate.of(1, 4)).setValue(2);
        grid.getCell(Coordinate.of(1, 5)).setValue(7);
        grid.getCell(Coordinate.of(1, 6)).setValue(1);
        grid.getCell(Coordinate.of(1, 7)).setValue(4);
        grid.getCell(Coordinate.of(1, 8)).setValue(8);

        grid.getCell(Coordinate.of(2, 0)).setValue(3);
        grid.getCell(Coordinate.of(2, 1)).setValue(4);
        grid.getCell(Coordinate.of(2, 2)).setValue(1);
        grid.getCell(Coordinate.of(2, 3)).setValue(6);
        grid.getCell(Coordinate.of(2, 4)).setValue(8);
        grid.getCell(Coordinate.of(2, 5)).setValue(9);
        grid.getCell(Coordinate.of(2, 6)).setValue(7);
        grid.getCell(Coordinate.of(2, 7)).setValue(5);
        grid.getCell(Coordinate.of(2, 8)).setValue(2);

        grid.getCell(Coordinate.of(3, 0)).setValue(5);
        grid.getCell(Coordinate.of(3, 1)).setValue(9);
        grid.getCell(Coordinate.of(3, 2)).setValue(3);
        grid.getCell(Coordinate.of(3, 3)).setValue(4);
        grid.getCell(Coordinate.of(3, 4)).setValue(6);
        grid.getCell(Coordinate.of(3, 5)).setValue(8);
        grid.getCell(Coordinate.of(3, 6)).setValue(2);
        grid.getCell(Coordinate.of(3, 7)).setValue(7);
        grid.getCell(Coordinate.of(3, 8)).setValue(1);

        grid.getCell(Coordinate.of(4, 0)).setValue(4);
        grid.getCell(Coordinate.of(4, 1)).setValue(7);
        grid.getCell(Coordinate.of(4, 2)).setValue(2);
        grid.getCell(Coordinate.of(4, 3)).setValue(5);
        grid.getCell(Coordinate.of(4, 4)).setValue(1);
        grid.getCell(Coordinate.of(4, 5)).setValue(3);
        grid.getCell(Coordinate.of(4, 6)).setValue(6);
        grid.getCell(Coordinate.of(4, 7)).setValue(8);
        grid.getCell(Coordinate.of(4, 8)).setValue(9);

        grid.getCell(Coordinate.of(5, 0)).setValue(6);
        grid.getCell(Coordinate.of(5, 1)).setValue(1);
        grid.getCell(Coordinate.of(5, 2)).setValue(8);
        grid.getCell(Coordinate.of(5, 3)).setValue(9);
        grid.getCell(Coordinate.of(5, 4)).setValue(7);
        grid.getCell(Coordinate.of(5, 5)).setValue(2);
        grid.getCell(Coordinate.of(5, 6)).setValue(4);
        grid.getCell(Coordinate.of(5, 7)).setValue(3);
        grid.getCell(Coordinate.of(5, 8)).setValue(5);

        grid.getCell(Coordinate.of(6, 0)).setValue(7);
        grid.getCell(Coordinate.of(6, 1)).setValue(8);
        grid.getCell(Coordinate.of(6, 2)).setValue(6);
        grid.getCell(Coordinate.of(6, 3)).setValue(2);
        grid.getCell(Coordinate.of(6, 4)).setValue(3);
        grid.getCell(Coordinate.of(6, 5)).setValue(5);
        grid.getCell(Coordinate.of(6, 6)).setValue(9);
        grid.getCell(Coordinate.of(6, 7)).setValue(1);
        grid.getCell(Coordinate.of(6, 8)).setValue(4);

        grid.getCell(Coordinate.of(7, 0)).setValue(1);
        grid.getCell(Coordinate.of(7, 1)).setValue(5);
        grid.getCell(Coordinate.of(7, 2)).setValue(4);
        grid.getCell(Coordinate.of(7, 3)).setValue(7);
        grid.getCell(Coordinate.of(7, 4)).setValue(9);
        grid.getCell(Coordinate.of(7, 5)).setValue(6);
        grid.getCell(Coordinate.of(7, 6)).setValue(8);
        grid.getCell(Coordinate.of(7, 7)).setValue(2);
        grid.getCell(Coordinate.of(7, 8)).setValue(3);

        grid.getCell(Coordinate.of(8, 0)).setValue(2);
        grid.getCell(Coordinate.of(8, 1)).setValue(3);
        grid.getCell(Coordinate.of(8, 2)).setValue(9);
        grid.getCell(Coordinate.of(8, 3)).setValue(8);
        grid.getCell(Coordinate.of(8, 4)).setValue(4);
        grid.getCell(Coordinate.of(8, 5)).setValue(1);
        grid.getCell(Coordinate.of(8, 6)).setValue(5);
        grid.getCell(Coordinate.of(8, 7)).setValue(6);
        grid.getCell(Coordinate.of(8, 8)).setValue(7);

        return grid;
    }

}
