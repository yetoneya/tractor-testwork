package ru.elena.zh.tractor.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.elena.zh.tractor.base.Tractor;
import ru.elena.zh.tractor.impl.TractorImpl;
import ru.elena.zh.tractor.service.TractorExplorer;

public class TractorExplorerImplTest {

    @Test
    public void testMoveForwards() {
        System.out.println("moveForwards");
        Tractor tractor = new TractorImpl();
        TractorExplorer te = new TractorExplorerImpl(4, 4, tractor);
        tractor = te.moveForwards();
        assertEquals(tractor.getPositionY(), 1);
    }

    @Test
    public void testTurnClockwise() {
        System.out.println("turnClockwise");
        Tractor tractor = new TractorImpl();
        TractorExplorer te = new TractorExplorerImpl(4, 4, tractor);
        te.turnClockwise();
        assertEquals(tractor.getOrientation(), "E");
    }

    @Test
    public void testTurnContraClockwise() {
        System.out.println("turnContraClockwise");
        Tractor tractor = new TractorImpl();
        TractorExplorer te = new TractorExplorerImpl(4, 4, tractor);
        te.turnContraClockwise();
        assertEquals(tractor.getOrientation(), "W");
    }

    @Test
    public void testMoveBackword() {
        System.out.println("moveBackward");
        Tractor tractor = new TractorImpl();
        TractorExplorer te = new TractorExplorerImpl(4, 4, tractor);
        tractor = te.moveForwards();
        tractor = te.moveBackword();
        assertEquals(tractor.getPositionY(), 0);
        assertEquals(tractor.getOrientation(), "N");
    }
    
    @Test
    public void testTractorInDitch() {
        System.out.println("tractorInDitch");
        Tractor tractor = new TractorImpl();
        TractorExplorer te = new TractorExplorerImpl(4, 4, tractor);
        tractor = te.moveForwards();
        tractor = te.moveBackword();
        tractor = te.moveBackword();
        assertEquals(tractor, null);
    }

}
