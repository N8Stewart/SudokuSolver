package com.stewart.grid.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class CoordinateTest {

    @Test
    public void testStaticInstantiation() {
        final Coordinate coordinate = Coordinate.of(1, 1);
        assertEquals(1, coordinate.getRow());
        assertEquals(1, coordinate.getColumn());
    }

    @Test
    public void testConstructorInstantiation() {
        final Coordinate coordinate = new Coordinate(1, 1);
        assertEquals(1, coordinate.getRow());
        assertEquals(1, coordinate.getColumn());
    }

}
