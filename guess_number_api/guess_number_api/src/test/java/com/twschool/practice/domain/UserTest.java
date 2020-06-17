package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class UserTest {
    private GuessNumberGame guessNumberGame;



    @Before
    public void setUp() throws Exception {
        Answer answer = new Answer(Arrays.asList("1", "2", "3", "4"));
        RandomAnswerGenerator randomAnswerGenerator = Mockito.mock(RandomAnswerGenerator.class);
        Mockito.when(randomAnswerGenerator.generateAnswer()).thenReturn(answer);
        guessNumberGame = new GuessNumberGame(randomAnswerGenerator);
    }

    @Test
    public void should_return_6_when_win_2_times() {
        User user = new User("1","zhang",guessNumberGame);
        user.playGame(Arrays.asList("1", "2", "3", "4"));
        user.playGame(Arrays.asList("1", "2", "3", "4"));

        String grade = String.valueOf(guessNumberGame.getGrade());

        Assert.assertEquals("6", grade);
    }

    @Test
    public void should_return_11_when_win_3_times() {
        User user = new User("1","zhang",guessNumberGame);
        user.playGame(Arrays.asList("1", "2", "3", "4"));
        user.playGame(Arrays.asList("1", "2", "3", "4"));
        user.playGame(Arrays.asList("1", "2", "3", "4"));

        String grade = String.valueOf(guessNumberGame.getGrade());

        Assert.assertEquals("11", grade);
    }

    @Test
    public void should_return_20_when_win_5_times() {
        User user = new User("1","zhang",guessNumberGame);
        user.playGame(Arrays.asList("1", "2", "3", "4"));
        user.playGame(Arrays.asList("1", "2", "3", "4"));
        user.playGame(Arrays.asList("1", "2", "3", "4"));
        user.playGame(Arrays.asList("1", "2", "3", "4"));
        user.playGame(Arrays.asList("1", "2", "3", "4"));

        String grade = String.valueOf(guessNumberGame.getGrade());

        Assert.assertEquals("20", grade);
    }

    @Test
    public void should_return_zhang_20_when_win_5_times_and_return_san_11_when_win_3_times() {
        Answer answer = new Answer(Arrays.asList("1", "2", "3", "4"));
        RandomAnswerGenerator randomAnswerGenerator = Mockito.mock(RandomAnswerGenerator.class);
        Mockito.when(randomAnswerGenerator.generateAnswer()).thenReturn(answer);

        User user = new User("1","zhang",guessNumberGame);
        user.playGame(Arrays.asList("1", "2", "3", "4"));
        user.playGame(Arrays.asList("1", "2", "3", "4"));
        user.playGame(Arrays.asList("1", "2", "3", "4"));
        user.playGame(Arrays.asList("1", "2", "3", "4"));
        user.playGame(Arrays.asList("1", "2", "3", "4"));
        String grade = String.valueOf(guessNumberGame.getGrade());
        Assert.assertEquals("20", grade);

        GuessNumberGame guessNumberGame1 = new GuessNumberGame(randomAnswerGenerator);
        User user2 = new User("1","san",guessNumberGame1);
        user2.playGame(Arrays.asList("1", "2", "3", "4"));
        user2.playGame(Arrays.asList("1", "2", "3", "4"));
        user2.playGame(Arrays.asList("1", "2", "3", "4"));
        String grade2 = String.valueOf(guessNumberGame1.getGrade());
        Assert.assertEquals("11", grade2);
    }
}
