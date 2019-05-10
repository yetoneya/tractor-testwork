package ru.elena.zh.tractor.base;

public abstract class Tractor {

    protected int positionX;
    protected int positionY;
    protected String orientation = "N";

    public abstract void moveForwards();

    public abstract void turnClockwise();

    
    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getOrientation() {
        return orientation;
    }
}
