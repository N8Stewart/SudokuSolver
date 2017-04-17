package com.stewart.grid.model;

import com.google.common.collect.ImmutableList;
import com.stewart.helpers.TestHelpers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

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
        final String expectedGrid = "3  2     |  8     6  |         \n" +
                "---------|-----------|---------\n" +
                "      1  |  2  5     |     6   \n" +
                "---------|-----------|---------\n" +
                "   5     |     1     |  3      \n" +
                "---------|-----------|---------\n" +
                "   4     |     8     |     1  3\n" +
                "---------|-----------|---------\n" +
                "   6  5  |  3     2  |  8  7   \n" +
                "---------|-----------|---------\n" +
                "9  3     |     6     |     5   \n" +
                "---------|-----------|---------\n" +
                "      4  |     3     |     2   \n" +
                "---------|-----------|---------\n" +
                "   1     |     7  5  |  4      \n" +
                "---------|-----------|---------\n" +
                "         |  4     8  |     9  6\n" +
                "---------|-----------|---------";
        assertEquals(expectedGrid, grid.toString());
    }

    @Test
    public void testToStringOnFullGrid() {
        final Grid grid = TestHelpers.getFullGrid();
        final String expectedGrid = "8  9  3  |  5  4  6  |  7  1  2\n" +
                "---------|-----------|---------\n" +
                "2  6  4  |  9  7  1  |  8  5  3\n" +
                "---------|-----------|---------\n" +
                "7  5  1  |  3  2  8  |  6  4  9\n" +
                "---------|-----------|---------\n" +
                "1  3  6  |  4  5  9  |  2  7  8\n" +
                "---------|-----------|---------\n" +
                "5  2  8  |  6  1  7  |  3  9  4\n" +
                "---------|-----------|---------\n" +
                "4  7  9  |  8  3  2  |  5  6  1\n" +
                "---------|-----------|---------\n" +
                "3  1  7  |  2  6  4  |  9  8  5\n" +
                "---------|-----------|---------\n" +
                "9  4  5  |  7  8  3  |  1  2  6\n" +
                "---------|-----------|---------\n" +
                "6  8  2  |  1  9  5  |  4  3  7\n" +
                "---------|-----------|---------";
        assertEquals(expectedGrid, grid.toString());
    }

}
