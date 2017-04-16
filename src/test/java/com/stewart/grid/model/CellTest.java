package com.stewart.grid.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class CellTest {

    @Test
    public void testEntropyIs9ForNewCell() {
        final Cell cell = new Cell();
        assertEquals(9, cell.getEntropy());
    }

    @Test
    public void testEntropyIs1ForPreDefined() {
        final Cell cell = new Cell(1);
        assertEquals(1, cell.getEntropy());
    }

    @Test
    public void testInstantiationFailsForInvalidCellValueNegative1() {
        try {
            new Cell(-1);
            fail("Cell value of -1 is not a valid cell value.");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    public void testInstantiationFailsForInvalidCellValue0() {
        try {
            new Cell(0);
            fail("Cell value of 0 is not a valid cell value.");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    public void testInstantiationFailsForInvalidCellValue10() {
        try {
            new Cell(10);
            fail("Cell value of 10 is not a valid cell value.");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    public void testSetValueFailsForInvalidCellValueNegative1() {
        try {
            final Cell cell = new Cell();
            cell.setValue(-1);
            fail("Cell value of -1 is not a valid cell value.");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    public void testSetValueFailsForInvalidCellValue0() {
        try {
            final Cell cell = new Cell();
            cell.setValue(0);
            fail("Cell value of 0 is not a valid cell value.");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    public void testSetValueFailsForInvalidCellValue10() {
        try {
            final Cell cell = new Cell();
            cell.setValue(10);
            fail("Cell value of 10 is not a valid cell value.");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    public void testClearPossibilityFailsForInvalidCellValueNegative1() {
        try {
            final Cell cell = new Cell();
            cell.clearPossibility(-1);
            fail("Cell value of -1 is not a valid cell value.");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    public void testClearPossibilityForInvalidCellValue0() {
        try {
            final Cell cell = new Cell();
            cell.clearPossibility(0);
            fail("Cell value of 0 is not a valid cell value.");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    public void testClearPossibilityFailsForInvalidCellValue10() {
        try {
            final Cell cell = new Cell();
            cell.clearPossibility(10);
            fail("Cell value of 10 is not a valid cell value.");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    public void testClearPossibilitiesToCheckCorrectValuesAreAssigned() {
        final Cell cell = new Cell();
        for (int i = 1; i <= 9; i++) {
            assertEquals(10 - i, cell.getEntropy());
            cell.clearPossibility(i);
            assertEquals(9 - i, cell.getEntropy());
            if (i != 8) {
                assertEquals(0, cell.getValue());
            } else {
                assertEquals(9, cell.getValue());
            }
        }
    }

    @Test
    public void testSetValueSetsCorrectValueAndResetsEntropy() {
        final Cell cell = new Cell();
        assertEquals(9, cell.getEntropy());
        assertEquals(0, cell.getValue());

        cell.setValue(1);

        assertEquals(1, cell.getEntropy());
        assertEquals(1, cell.getValue());
    }

}
