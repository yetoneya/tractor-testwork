package ru.elena.zh.tractor.impl;

import ru.elena.zh.tractor.base.Tractor;

public class TractorImpl extends Tractor {

    @Override
    public void moveForwards() {
        switch (orientation) {
            case "N":
                positionY += 1;
                break;
            case "E":
                positionX += 1;
                break;
            case "S":
                positionY -= 1;
                break;
            case "W":
                positionX -= 1;
                break;
        }
    }

    @Override
    public void turnClockwise() {
        switch (orientation) {
            case "N":
                orientation = "E";
                break;
            case "E":
                orientation = "S";
                break;
            case "S":
                orientation = "W";
                break;
            case "W":
                orientation = "N";
                break;
        }
    }


}
