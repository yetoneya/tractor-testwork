package ru.elena.zh.tractor.impl;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ru.elena.zh.tractor.base.Tractor;

public class TractorImplTest {

    @Test
    public void testMoveForwards() {
        System.out.println("moveForvard");
        Tractor tractor = new TractorImpl();
        tractor.moveForwards();
        assertEquals(tractor.getPositionY(), 1);
    }

    @Test
    public void testTurnClockwise() {
        System.out.println("turnClockwise");
        Tractor tractor = new TractorImpl();
        tractor.turnClockwise();
        assertEquals(tractor.getOrientation(), "E");
    }

    @Test
    public void testMoveAndTurn() {
        System.out.println("moveAndTurn");
        Tractor tractor = new TractorImpl();
        tractor.moveForwards();
        tractor.turnClockwise();
        tractor.moveForwards();
        tractor.turnClockwise();
        assertEquals(tractor.getPositionX(), 1);
        assertEquals(tractor.getPositionY(), 1);
        assertEquals(tractor.getOrientation(), "S");
        tractor.moveForwards();
        tractor.turnClockwise();
        tractor.moveForwards();
        tractor.turnClockwise();
        assertEquals(tractor.getPositionX(), 0);
        assertEquals(tractor.getPositionY(), 0);
        assertEquals(tractor.getOrientation(), "N");
    }
}
