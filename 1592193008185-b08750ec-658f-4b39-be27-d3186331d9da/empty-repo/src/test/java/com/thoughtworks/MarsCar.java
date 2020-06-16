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

   MarsCar move(String command) {
       if ("N".equals(this.getDirection())) {
            if ("M".equals(command)) {
                this.setY_axis(this.getY_axis() + 1);
            }
            if ("L".equals(command)) {
                this.setDirection("W");
            }
            if ("R".equals(command)) {
                this.setDirection("E");
            }

        }

        else if ("S".equals(this.getDirection())) {
            if ("M".equals(command)) {
                this.setY_axis(this.getY_axis() - 1);
            }
            if ("L".equals(command)) {
                this.setDirection("E");
            }
            if ("R".equals(command)) {
                this.setDirection("W");
            }

        }
        else if ("E".equals(this.getDirection())) {
            if ("M".equals(command)) {
                this.setX_axis(this.getX_axis() + 1);
            }
            if ("L".equals(command)) {
                this.setDirection("N");
            }
            if ("R".equals(command)) {
                this.setDirection("S");
            }

        }
        else if ("W".equals(this.getDirection())) {
            if ("M".equals(command)) {
                this.setX_axis(this.getX_axis() - 1);
            }
            if ("L".equals(command)) {
                this.setDirection("S");
            }
            if ("R".equals(command)) {
                this.setDirection("N");
            }

        }
        return this;
    }
}
