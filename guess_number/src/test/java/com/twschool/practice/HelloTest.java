package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void should_run_test_pass() {
        Assert.assertTrue(true);
    }

    @Test
    public void should_return_4A0B_given_1234_when_true1234(){
        GuessGame guessGame = new GuessGame();
        String result = guessGame.answer(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
        assertEquals(result,"4A0B");
    }
}
