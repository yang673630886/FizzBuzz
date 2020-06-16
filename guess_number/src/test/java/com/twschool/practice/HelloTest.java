package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HelloTest {
    GuessGame guessGame = new GuessGame();

    @Test
    public void should_run_test_pass() {
        Assert.assertTrue(true);
    }

    @Test
    public void should_return_4A0B_given_1234_when_true1234() {
        String result = guessGame.answer(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
        assertEquals(result, "4A0B");
    }

    @Test
    public void should_return_2A2B_given_1243_when_true1234() {
        String result = guessGame.answer(new int[]{1, 2, 4, 3}, new int[]{1, 2, 3, 4});
        assertEquals(result, "2A2B");
    }

    @Test
    public void should_return_1A2B_given_1543_when_true1234() {
        String result = guessGame.answer(new int[]{1, 5, 4, 3}, new int[]{1, 2, 3, 4});
        assertEquals(result, "1A2B");
    }

    @Test
    public void should_return_0A4B_given_4321_when_true1234() {
        String result = guessGame.answer(new int[]{4, 3, 2, 1}, new int[]{1, 2, 3, 4});
        assertEquals(result, "0A4B");
    }

    @Test
    public void should_return_0A3B_given_5321_when_true1234() {
        String result = guessGame.answer(new int[]{5, 3, 2, 1}, new int[]{1, 2, 3, 4});
        assertEquals(result, "0A3B");
    }

    @Test
    public void should_return_0A0B_given_5678_when_true1234() {
        String result = guessGame.answer(new int[]{5, 6, 7, 8}, new int[]{1, 2, 3, 4});
        assertEquals(result, "0A0B");
    }

    @Test
    public void should_return_randnum_when_randNums(){
        int[] result =guessGame.randNums();
        System.out.println(Arrays.toString(result));
    }
}
