package com.stewart.grid.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class GridTest {

    @Test
    public void testInstantiationOfEmptyGridDefaultSize() {
        final Grid grid = new Grid();
        assertEquals(9, grid.getSize());

        final Map<Coordinate, Cell> cells = grid.getCells();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                final Cell cell = cells.remove(Coordinate.of(row, col));
                assertEquals(9, cell.getEntropy());
                assertEquals(0, cell.getValue());
            }
        }
        assertTrue(cells.isEmpty());
    }

    @Test
    public void testInstantiationOfEmptyGridSize3() {
        final Grid grid = new Grid(3);
        assertEquals(3, grid.getSize());

        final Map<Coordinate, Cell> cells = grid.getCells();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                final Cell cell = cells.remove(Coordinate.of(row, col));
                assertEquals(9, cell.getEntropy());
                assertEquals(0, cell.getValue());
            }
        }
        assertTrue(cells.isEmpty());
    }

}
