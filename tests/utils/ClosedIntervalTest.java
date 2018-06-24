package utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class ClosedIntervalTest {

    private ClosedInterval OUTClosedInterval;

    @Test(expected = AssertionError.class)
    public void testClosedIntervalWithMinGreaterThanMax(){
        OUTClosedInterval = new ClosedInterval(0,0);
        OUTClosedInterval = new ClosedInterval(0,-1);
    }

    @Test
    public void testIncludes(){

    }

}
