package com.twschool.practice;

import java.util.Random;

class GuessGame {
    int[] gameAnswer = new int[4];
    int[] userAnswer = new int[4];

    String answer(int[] userAnswer, int[] gameAnswer) {
        int aNum = 0;
        int bNum = 0;
        String result;
        for (int i = 0; i < gameAnswer.length; i++) {
            if (userAnswer[i] == gameAnswer[i]) {
                aNum += 1;
            } else {
                for (int value : gameAnswer) {
                    if (userAnswer[i] == value) {
                        bNum += 1;
                    }
                }
            }
        }
        result = aNum + "A" + bNum + "B";
        return result;
    }

    int[] randNums() {
        for (int i = 0; i < gameAnswer.length; i++) {
            Random ran = new Random();
            int a = ran.nextInt(10);
            if (i - 1 != -1) {
                for (int j = 0; j < i; j++) {
                    if (a == gameAnswer[j]) {
                        i--;
                        break;
                    } else {
                        gameAnswer[i] = a;
                    }
                }
            } else {
                gameAnswer[i] = a;
            }
        }
        return gameAnswer;
    }
}
