package com.stewart.grid.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * A coordinate used to identify the location of an individual cell
 */
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Coordinate {
    @Getter
    private final int row;
    @Getter
    private final int column;
}
