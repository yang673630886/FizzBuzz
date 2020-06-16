package com.thoughtworks;

public class MarsCar {
    private int x_axis;
    private int y_axis;
    private String direction;

    public MarsCar(int x_axis, int y_axis, String direction) {
        this.x_axis = x_axis;
        this.y_axis = y_axis;
        this.direction = direction;
    }

    public int getX_axis() {
        return x_axis;
    }

    public void setX_axis(int x_axis) {
        this.x_axis = x_axis;
    }

    public int getY_axis() {
        return y_axis;
    }

    public void setY_axis(int y_axis) {
        this.y_axis = y_axis;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public MarsCar move(MarsCar marsCar,String command){
        if (marsCar.getDirection() == "N"){
            if (command == "M"){
                marsCar.setY_axis(marsCar.getY_axis()+1);
            }
            if(command=="L"){
                marsCar.setDirection("W");
            }
            if(command=="R"){
                marsCar.setDirection("E");
            }
        }
        return marsCar;

    }
}
