package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class CoordinateTest {


    private Coordinate OUTCoordinate;

    @Test
    public void testCoordinate(){
        OUTCoordinate = new Coordinate();
        assertEquals(0,OUTCoordinate.getRow());
        assertEquals(0,OUTCoordinate.getColumn());
    }

    @Test(expected = AssertionError.class)
    public void testCoordinateIntIntWithException(){
        OUTCoordinate = new Coordinate(-1,3);
    }



}
