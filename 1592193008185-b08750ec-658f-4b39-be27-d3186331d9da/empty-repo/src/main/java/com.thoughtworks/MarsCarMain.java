package com.thoughtworks;

class MarsCarMain {
    void sendCommendsForMove(MarsCar marsCar, String commends) {
        String[] commend = commends.split("");
        for (String string : commend) {
            marsCar.move(string);
        }
    }
}
