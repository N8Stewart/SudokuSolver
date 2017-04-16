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
        } catch(IllegalArgumentException ignored) {}
    }


    @Test
    public void testInstantiationFailsForInvalidCellValue0() {
        try {
            new Cell(0);
            fail("Cell value of 0 is not a valid cell value.");
        } catch(IllegalArgumentException ignored) {}
    }


    @Test
    public void testInstantiationFailsForInvalidCellValue10() {
        try {
            new Cell(10);
            fail("Cell value of 10 is not a valid cell value.");
        } catch(IllegalArgumentException ignored) {}
    }

    @Test
    public void testSetValueFailsForInvalidCellValueNegative1() {
        try {
            final Cell cell = new Cell();
            cell.setValue(-1);
            fail("Cell value of -1 is not a valid cell value.");
        } catch(IllegalArgumentException ignored) {}
    }


    @Test
    public void testSetValueFailsForInvalidCellValue0() {
        try {
            final Cell cell = new Cell();
            cell.setValue(0);
            fail("Cell value of 0 is not a valid cell value.");
        } catch(IllegalArgumentException ignored) {}
    }


    @Test
    public void testSetValueFailsForInvalidCellValue10() {
        try {
            final Cell cell = new Cell();
            cell.setValue(10);
            fail("Cell value of 10 is not a valid cell value.");
        } catch(IllegalArgumentException ignored) {}
    }

}
