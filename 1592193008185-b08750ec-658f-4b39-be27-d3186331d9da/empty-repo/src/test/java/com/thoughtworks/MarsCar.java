package com.thoughtworks;

class MarsCar {
    private int x_axis;
    private int y_axis;
    private String direction;

    MarsCar(int x_axis, int y_axis, String direction) {
        this.x_axis = x_axis;
        this.y_axis = y_axis;
        this.direction = direction;
    }

    int getX_axis() {
        return x_axis;
    }

    private void setX_axis(int x_axis) {
        this.x_axis = x_axis;
    }

    int getY_axis() {
        return y_axis;
    }

    private void setY_axis(int y_axis) {
        this.y_axis = y_axis;
    }

    String getDirection() {
        return direction;
    }

    private void setDirection(String direction) {
        this.direction = direction;
    }

   MarsCar move(MarsCar marsCar, String command) {

        if ("N".equals(marsCar.getDirection())) {
            if ("M".equals(command)) {
                marsCar.setY_axis(marsCar.getY_axis() + 1);
            }
            if ("L".equals(command)) {
                marsCar.setDirection("W");
            }
            if ("R".equals(command)) {
                marsCar.setDirection("E");
            }
            return marsCar;
        }

        if ("S".equals(marsCar.getDirection())) {
            if ("M".equals(command)) {
                marsCar.setY_axis(marsCar.getY_axis() - 1);
            }
            if ("L".equals(command)) {
                marsCar.setDirection("E");
            }
            if ("R".equals(command)) {
                marsCar.setDirection("W");
            }
            return marsCar;
        }
        if ("E".equals(marsCar.getDirection())) {
            if ("M".equals(command)) {
                marsCar.setX_axis(marsCar.getX_axis() + 1);
            }
            if ("L".equals(command)) {
                marsCar.setDirection("N");
            }
            if ("R".equals(command)) {
                marsCar.setDirection("S");
            }
            return marsCar;
        }
        if ("W".equals(marsCar.getDirection())) {
            if ("M".equals(command)) {
                marsCar.setX_axis(marsCar.getX_axis() - 1);
            }
            if ("L".equals(command)) {
                marsCar.setDirection("S");
            }
            if ("R".equals(command)) {
                marsCar.setDirection("N");
            }
            return marsCar;
        }
        return null;
    }
}
