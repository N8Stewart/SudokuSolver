package com.stewart.grid.model;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;
import java.util.Map;

/**
 * A square grid of variable size
 */
@EqualsAndHashCode
public class Grid {

    private static final int DEFAULT_SIZE = 9;
    private static final char COLUMN_SEPARATOR = '|';

    @Getter
    private int size;
    private Map<Coordinate, Cell> cells;
    private Map<Integer, List<Cell>> rows;
    private Map<Integer, List<Cell>> columns;


    /**
     * Create an empty grid of default size {@code DEFAULT_SIZE}
     */
    public Grid() {
        this.size = DEFAULT_SIZE;
        cells = Maps.newHashMap();
        rows = Maps.newHashMap();
        columns = Maps.newHashMap();

        // Initialize the rows/columns
        for (int i = 0; i < this.size; i++) {
            rows.put(i, Lists.newArrayList());
            columns.put(i, Lists.newArrayList());
        }

        // Create cells and add references to cells/rows/columns
        generateEmptyGrid();
    }

    @Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        for (int row = 0; row < this.size; row++) {
            buffer.append(String.format("%s  %s  %s  %c  %s  %s  %s  %c  %s  %s  %s%n---------%c-----------%c---------",
                    cells.get(Coordinate.of(row, 0)),
                    cells.get(Coordinate.of(row, 1)),
                    cells.get(Coordinate.of(row, 2)),
                    COLUMN_SEPARATOR,
                    cells.get(Coordinate.of(row, 3)),
                    cells.get(Coordinate.of(row, 4)),
                    cells.get(Coordinate.of(row, 5)),
                    COLUMN_SEPARATOR,
                    cells.get(Coordinate.of(row, 6)),
                    cells.get(Coordinate.of(row, 7)),
                    cells.get(Coordinate.of(row, 8)),
                    COLUMN_SEPARATOR,
                    COLUMN_SEPARATOR
            ));
            if (row != this.size - 1)
                buffer.append(String.format("%n"));
        }
        return buffer.toString();
    }

    /**
     * Get {@code Cell} with given {@code Coordinate}
     *
     * @param coordinate the coordinate of the cell to be returned
     * @return the {@code Cell} referenced by the provided {@code Coordinate}
     */
    public Cell getCell(final Coordinate coordinate) {
        return cells.get(coordinate);
    }

    /**
     * Get a copy of {@code Cell} references pertaining to the provided row
     *
     * @param row the row with which to grab the list of {@code Cell}s
     * @return a {@code List} of {@code Cell}s
     */
    public List<Cell> getRow(final int row) {
        final List<Cell> rowCells = Lists.newArrayList();
        rowCells.addAll(rows.get(row));
        return rowCells;
    }

    /**
     * Get a copy of {@code Cell} references pertaining to the provided column
     *
     * @param column the column with which to grab the list of {@code Cell}s
     * @return a {@code List} of {@code Cell}s
     */
    public List<Cell> getColumn(final int column) {
        final List<Cell> colCells = Lists.newArrayList();
        colCells.addAll(columns.get(column));
        return colCells;
    }


    private void generateEmptyGrid() {
        for (int row = 0; row < this.size; row++) {
            for (int col = 0; col < this.size; col++) {
                final Cell cell = new Cell();
                cells.put(Coordinate.of(row, col), cell);
                rows.get(row).add(cell);
                columns.get(col).add(cell);
            }
        }
    }

}
