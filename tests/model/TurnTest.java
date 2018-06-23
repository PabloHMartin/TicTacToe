package model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    private Turn OUTTurn;

    @Before
    public void before(){
        OUTTurn = new Turn();
    }

    @Test
    public void testTurn(){
        assertEquals(Color.XS,OUTTurn.take());
    }

    @Test
    public void testChange(){
        OUTTurn.change();
        assertEquals(Color.OS,OUTTurn.take());
        OUTTurn.change();
        assertEquals(Color.XS, OUTTurn.take());
        OUTTurn.change();
        assertEquals(Color.OS,OUTTurn.take());
    }

}