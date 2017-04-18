package com.stewart.grid.model;

import com.google.common.collect.ImmutableList;
import com.stewart.helpers.TestHelpers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class GridTest {

    @Test
    public void testInstantiationOfEmptyGridDefaultSize() {
        final Grid grid = new Grid();
        assertEquals(9, grid.getSize());

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                final Cell cell = grid.getCell(Coordinate.of(row, col));
                assertEquals(9, cell.getEntropy());
                assertEquals(0, cell.getValue());
            }
        }
    }

    @Test
    public void testGetRows() {
        final Grid grid = TestHelpers.getFullGrid();
        assertEquals(ImmutableList.of(
                new Cell(8),
                new Cell(2),
                new Cell(7),
                new Cell(1),
                new Cell(5),
                new Cell(4),
                new Cell(3),
                new Cell(9),
                new Cell(6)
        ), grid.getRow(0));

        assertEquals(ImmutableList.of(
                new Cell(9),
                new Cell(6),
                new Cell(5),
                new Cell(3),
                new Cell(2),
                new Cell(7),
                new Cell(1),
                new Cell(4),
                new Cell(8)
        ), grid.getRow(1));

        assertEquals(ImmutableList.of(
                new Cell(3),
                new Cell(4),
                new Cell(1),
                new Cell(6),
                new Cell(8),
                new Cell(9),
                new Cell(7),
                new Cell(5),
                new Cell(2)
        ), grid.getRow(2));

        assertEquals(ImmutableList.of(
                new Cell(5),
                new Cell(9),
                new Cell(3),
                new Cell(4),
                new Cell(6),
                new Cell(8),
                new Cell(2),
                new Cell(7),
                new Cell(1)
        ), grid.getRow(3));

        assertEquals(ImmutableList.of(
                new Cell(4),
                new Cell(7),
                new Cell(2),
                new Cell(5),
                new Cell(1),
                new Cell(3),
                new Cell(6),
                new Cell(8),
                new Cell(9)
        ), grid.getRow(4));

        assertEquals(ImmutableList.of(
                new Cell(6),
                new Cell(1),
                new Cell(8),
                new Cell(9),
                new Cell(7),
                new Cell(2),
                new Cell(4),
                new Cell(3),
                new Cell(5)
        ), grid.getRow(5));

        assertEquals(ImmutableList.of(
                new Cell(7),
                new Cell(8),
                new Cell(6),
                new Cell(2),
                new Cell(3),
                new Cell(5),
                new Cell(9),
                new Cell(1),
                new Cell(4)
        ), grid.getRow(6));

        assertEquals(ImmutableList.of(
                new Cell(1),
                new Cell(5),
                new Cell(4),
                new Cell(7),
                new Cell(9),
                new Cell(6),
                new Cell(8),
                new Cell(2),
                new Cell(3)
        ), grid.getRow(7));

        assertEquals(ImmutableList.of(
                new Cell(2),
                new Cell(3),
                new Cell(9),
                new Cell(8),
                new Cell(4),
                new Cell(1),
                new Cell(5),
                new Cell(6),
                new Cell(7)
        ), grid.getRow(8));
    }

    @Test
    public void testGetColumns() {
        final Grid grid = TestHelpers.getFullGrid();
        assertEquals(ImmutableList.of(
                new Cell(8),
                new Cell(9),
                new Cell(3),
                new Cell(5),
                new Cell(4),
                new Cell(6),
                new Cell(7),
                new Cell(1),
                new Cell(2)
        ), grid.getColumn(0));

        assertEquals(ImmutableList.of(
                new Cell(2),
                new Cell(6),
                new Cell(4),
                new Cell(9),
                new Cell(7),
                new Cell(1),
                new Cell(8),
                new Cell(5),
                new Cell(3)
        ), grid.getColumn(1));

        assertEquals(ImmutableList.of(
                new Cell(7),
                new Cell(5),
                new Cell(1),
                new Cell(3),
                new Cell(2),
                new Cell(8),
                new Cell(6),
                new Cell(4),
                new Cell(9)
        ), grid.getColumn(2));

        assertEquals(ImmutableList.of(
                new Cell(1),
                new Cell(3),
                new Cell(6),
                new Cell(4),
                new Cell(5),
                new Cell(9),
                new Cell(2),
                new Cell(7),
                new Cell(8)
        ), grid.getColumn(3));

        assertEquals(ImmutableList.of(
                new Cell(5),
                new Cell(2),
                new Cell(8),
                new Cell(6),
                new Cell(1),
                new Cell(7),
                new Cell(3),
                new Cell(9),
                new Cell(4)
        ), grid.getColumn(4));

        assertEquals(ImmutableList.of(
                new Cell(4),
                new Cell(7),
                new Cell(9),
                new Cell(8),
                new Cell(3),
                new Cell(2),
                new Cell(5),
                new Cell(6),
                new Cell(1)
        ), grid.getColumn(5));

        assertEquals(ImmutableList.of(
                new Cell(3),
                new Cell(1),
                new Cell(7),
                new Cell(2),
                new Cell(6),
                new Cell(4),
                new Cell(9),
                new Cell(8),
                new Cell(5)
        ), grid.getColumn(6));

        assertEquals(ImmutableList.of(
                new Cell(9),
                new Cell(4),
                new Cell(5),
                new Cell(7),
                new Cell(8),
                new Cell(3),
                new Cell(1),
                new Cell(2),
                new Cell(6)
        ), grid.getColumn(7));

        assertEquals(ImmutableList.of(
                new Cell(6),
                new Cell(8),
                new Cell(2),
                new Cell(1),
                new Cell(9),
                new Cell(5),
                new Cell(4),
                new Cell(3),
                new Cell(7)
        ), grid.getColumn(8));
    }

    @Test
    public void testGetSubGrids() {
        final Grid grid = TestHelpers.getFullGrid();
        assertEquals(ImmutableList.of(
                new Cell(8),
                new Cell(2),
                new Cell(7),
                new Cell(9),
                new Cell(6),
                new Cell(5),
                new Cell(3),
                new Cell(4),
                new Cell(1)
        ), grid.getSubGrid(Coordinate.of(0, 0)));

        assertEquals(ImmutableList.of(
                new Cell(1),
                new Cell(5),
                new Cell(4),
                new Cell(3),
                new Cell(2),
                new Cell(7),
                new Cell(6),
                new Cell(8),
                new Cell(9)
        ), grid.getSubGrid(Coordinate.of(0, 3)));

        assertEquals(ImmutableList.of(
                new Cell(3),
                new Cell(9),
                new Cell(6),
                new Cell(1),
                new Cell(4),
                new Cell(8),
                new Cell(7),
                new Cell(5),
                new Cell(2)
        ), grid.getSubGrid(Coordinate.of(0, 6)));

        assertEquals(ImmutableList.of(
                new Cell(5),
                new Cell(9),
                new Cell(3),
                new Cell(4),
                new Cell(7),
                new Cell(2),
                new Cell(6),
                new Cell(1),
                new Cell(8)
        ), grid.getSubGrid(Coordinate.of(3, 0)));

        assertEquals(ImmutableList.of(
                new Cell(4),
                new Cell(6),
                new Cell(8),
                new Cell(5),
                new Cell(1),
                new Cell(3),
                new Cell(9),
                new Cell(7),
                new Cell(2)
        ), grid.getSubGrid(Coordinate.of(3, 3)));

        assertEquals(ImmutableList.of(
                new Cell(2),
                new Cell(7),
                new Cell(1),
                new Cell(6),
                new Cell(8),
                new Cell(9),
                new Cell(4),
                new Cell(3),
                new Cell(5)
        ), grid.getSubGrid(Coordinate.of(3, 6)));

        assertEquals(ImmutableList.of(
                new Cell(7),
                new Cell(8),
                new Cell(6),
                new Cell(1),
                new Cell(5),
                new Cell(4),
                new Cell(2),
                new Cell(3),
                new Cell(9)
        ), grid.getSubGrid(Coordinate.of(6, 0)));

        assertEquals(ImmutableList.of(
                new Cell(2),
                new Cell(3),
                new Cell(5),
                new Cell(7),
                new Cell(9),
                new Cell(6),
                new Cell(8),
                new Cell(4),
                new Cell(1)
        ), grid.getSubGrid(Coordinate.of(6, 3)));

        assertEquals(ImmutableList.of(
                new Cell(9),
                new Cell(1),
                new Cell(4),
                new Cell(8),
                new Cell(2),
                new Cell(3),
                new Cell(5),
                new Cell(6),
                new Cell(7)
        ), grid.getSubGrid(Coordinate.of(6, 6)));
    }

    @Test
    public void getSubGridsCorrectCoordinates() {
        final Grid grid = TestHelpers.getFullGrid();
        assertEquals(ImmutableList.of(
                new Cell(8),
                new Cell(2),
                new Cell(7),
                new Cell(9),
                new Cell(6),
                new Cell(5),
                new Cell(3),
                new Cell(4),
                new Cell(1)
        ), grid.getSubGrid(Coordinate.of(0, 0)));

        assertEquals(ImmutableList.of(
                new Cell(1),
                new Cell(5),
                new Cell(4),
                new Cell(3),
                new Cell(2),
                new Cell(7),
                new Cell(6),
                new Cell(8),
                new Cell(9)
        ), grid.getSubGrid(Coordinate.of(1, 4)));

        assertEquals(ImmutableList.of(
                new Cell(3),
                new Cell(9),
                new Cell(6),
                new Cell(1),
                new Cell(4),
                new Cell(8),
                new Cell(7),
                new Cell(5),
                new Cell(2)
        ), grid.getSubGrid(Coordinate.of(2, 6)));

        assertEquals(ImmutableList.of(
                new Cell(5),
                new Cell(9),
                new Cell(3),
                new Cell(4),
                new Cell(7),
                new Cell(2),
                new Cell(6),
                new Cell(1),
                new Cell(8)
        ), grid.getSubGrid(Coordinate.of(4, 0)));

        assertEquals(ImmutableList.of(
                new Cell(4),
                new Cell(6),
                new Cell(8),
                new Cell(5),
                new Cell(1),
                new Cell(3),
                new Cell(9),
                new Cell(7),
                new Cell(2)
        ), grid.getSubGrid(Coordinate.of(4, 4)));

        assertEquals(ImmutableList.of(
                new Cell(2),
                new Cell(7),
                new Cell(1),
                new Cell(6),
                new Cell(8),
                new Cell(9),
                new Cell(4),
                new Cell(3),
                new Cell(5)
        ), grid.getSubGrid(Coordinate.of(4, 8)));

        assertEquals(ImmutableList.of(
                new Cell(7),
                new Cell(8),
                new Cell(6),
                new Cell(1),
                new Cell(5),
                new Cell(4),
                new Cell(2),
                new Cell(3),
                new Cell(9)
        ), grid.getSubGrid(Coordinate.of(8, 0)));

        assertEquals(ImmutableList.of(
                new Cell(2),
                new Cell(3),
                new Cell(5),
                new Cell(7),
                new Cell(9),
                new Cell(6),
                new Cell(8),
                new Cell(4),
                new Cell(1)
        ), grid.getSubGrid(Coordinate.of(8, 5)));

        assertEquals(ImmutableList.of(
                new Cell(9),
                new Cell(1),
                new Cell(4),
                new Cell(8),
                new Cell(2),
                new Cell(3),
                new Cell(5),
                new Cell(6),
                new Cell(7)
        ), grid.getSubGrid(Coordinate.of(7, 7)));
    }

    @Test
    public void getColumnReturnsANewListOfOldReferences() {
        final Grid grid = TestHelpers.getFullGrid();

        final List<Cell> column0List1 = grid.getColumn(0);
        final List<Cell> column0List2 = grid.getColumn(0);

        // List references should be different
        assertFalse(column0List1 == column0List2);

        // Cell references should be identical
        column0List1.forEach(cell -> assertTrue(column0List2.contains(cell)));
    }

    @Test
    public void getRowReturnsANewListOfOldReferences() {
        final Grid grid = TestHelpers.getFullGrid();

        final List<Cell> row0List1 = grid.getRow(0);
        final List<Cell> row0List2 = grid.getRow(0);

        // List references should be different
        assertFalse(row0List1 == row0List2);

        // Cell references should be identical
        row0List1.forEach(cell -> assertTrue(row0List2.contains(cell)));
    }

    @Test
    public void getSubGridReturnsANewListOfOldReferences() {
        final Grid grid = TestHelpers.getFullGrid();

        final List<Cell> grid0List1 = grid.getSubGrid(Coordinate.of(0,0));
        final List<Cell> grid0List2 = grid.getSubGrid(Coordinate.of(0,0));

        // List references should be different
        assertFalse(grid0List1 == grid0List2);

        // Cell references should be identical
        grid0List1.forEach(cell -> assertTrue(grid0List2.contains(cell)));
    }

    @Test
    public void testToStringOnDefaultGrid() {
        final Grid grid = new Grid();
        final String expectedGrid = "         |           |         \n" +
                "---------|-----------|---------\n" +
                "         |           |         \n" +
                "---------|-----------|---------\n" +
                "         |           |         \n" +
                "---------|-----------|---------\n" +
                "         |           |         \n" +
                "---------|-----------|---------\n" +
                "         |           |         \n" +
                "---------|-----------|---------\n" +
                "         |           |         \n" +
                "---------|-----------|---------\n" +
                "         |           |         \n" +
                "---------|-----------|---------\n" +
                "         |           |         \n" +
                "---------|-----------|---------\n" +
                "         |           |         \n" +
                "---------|-----------|---------";
        assertEquals(expectedGrid, grid.toString());
    }

    @Test
    public void testToStringOnPartialGrid() {
        final Grid grid = TestHelpers.getPartialGrid();
        final String expectedGrid = "3        |        9  |         \n" +
                "---------|-----------|---------\n" +
                "2     5  |  4  6  3  |     1   \n" +
                "---------|-----------|---------\n" +
                "   1     |     5     |  4      \n" +
                "---------|-----------|---------\n" +
                "8  2     |     3     |        4\n" +
                "---------|-----------|---------\n" +
                "   5  1  |  8     6  |  3  7   \n" +
                "---------|-----------|---------\n" +
                "6        |     2     |     5  8\n" +
                "---------|-----------|---------\n" +
                "      3  |     8     |     4   \n" +
                "---------|-----------|---------\n" +
                "   6     |  1  7  5  |  2     9\n" +
                "---------|-----------|---------\n" +
                "         |  3        |        6\n" +
                "---------|-----------|---------";
        assertEquals(expectedGrid, grid.toString());
    }

    @Test
    public void testToStringOnFullGrid() {
        final Grid grid = TestHelpers.getFullGrid();
        final String expectedGrid = "8  2  7  |  1  5  4  |  3  9  6\n" +
                "---------|-----------|---------\n" +
                "9  6  5  |  3  2  7  |  1  4  8\n" +
                "---------|-----------|---------\n" +
                "3  4  1  |  6  8  9  |  7  5  2\n" +
                "---------|-----------|---------\n" +
                "5  9  3  |  4  6  8  |  2  7  1\n" +
                "---------|-----------|---------\n" +
                "4  7  2  |  5  1  3  |  6  8  9\n" +
                "---------|-----------|---------\n" +
                "6  1  8  |  9  7  2  |  4  3  5\n" +
                "---------|-----------|---------\n" +
                "7  8  6  |  2  3  5  |  9  1  4\n" +
                "---------|-----------|---------\n" +
                "1  5  4  |  7  9  6  |  8  2  3\n" +
                "---------|-----------|---------\n" +
                "2  3  9  |  8  4  1  |  5  6  7\n" +
                "---------|-----------|---------";
        assertEquals(expectedGrid, grid.toString());
    }

}
