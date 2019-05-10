package ru.elena.zh.tractor.service.impl;

import ru.elena.zh.tractor.base.Tractor;
import ru.elena.zh.tractor.exception.TractorInDitchException;
import ru.elena.zh.tractor.service.TractorExplorer;

public class TractorExplorerImpl implements TractorExplorer {

    private int maxX = 5;
    private int maxY = 5;
    private final int MIN = 0;
    private Tractor tractor;

    public TractorExplorerImpl(int maxX, int maxY, Tractor tractor) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.tractor = tractor;
    }

    public TractorExplorerImpl(Tractor tractor) {
        this.tractor = tractor;
    }

    @Override
    public Tractor moveForwards() {
        tractor.moveForwards();
        checkPosition();
        return tractor;
    }

    @Override
    public Tractor moveBackword() {
        tractor.turnClockwise();
        tractor.turnClockwise();
        tractor.moveForwards();
        checkPosition();
        if(tractor != null){
            tractor.turnClockwise();
            tractor.turnClockwise();
        }
        return tractor;
    }

    @Override
    public void turnClockwise() {
        tractor.turnClockwise();
    }

    @Override
    public void turnContraClockwise() {
        tractor.turnClockwise();
        tractor.turnClockwise();
        tractor.turnClockwise();
    }

    private void checkPosition() {
        if (tractor.getPositionX() > maxX || tractor.getPositionY() > maxY || tractor.getPositionX() < MIN || tractor.getPositionY() < MIN) {
            try {
                throw new TractorInDitchException("the tractor is in the ditch");
            } catch (TractorInDitchException ex) {
                System.out.println(ex.getMessage());
                tractor = null;
            }
        }
    }

}
