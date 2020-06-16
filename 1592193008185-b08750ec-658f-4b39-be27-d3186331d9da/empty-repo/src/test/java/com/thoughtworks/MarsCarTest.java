package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MarsCarTest {
    @Test
    public void should_return_01N_give_00N_M(){
        MarsCar marsCar = new MarsCar(0,0,"N");
        MarsCar result = marsCar.move(marsCar,"M");
        int x = result.getX_axis();
        int y = result.getY_axis();
        String direction = result.getDirection();
        assertEquals(String.valueOf(x),"0");
        assertEquals(String.valueOf(y),"1");
        assertEquals(direction,"N");
    }
    public void should_return_00W_give_00N_L(){

    }
    public void should_return_00E_give_00N_R(){

    }

    public void should_return_0_1S_give_00S_M(){

    }
    public void should_return_00E_give_00S_L(){

    }
    public void should_return_00W_give_00S_R(){

    }

    public void should_return_10E_give_00E_M(){

    }
    public void should_return_00N_give_00E_L(){

    }
    public void should_return_00S_give_00E_R(){

    }

    public void should_return__10W_give_00W_M(){

    }
    public void should_return_00S_give_00W_L(){

    }
    public void should_return_00N_give_00W_R(){

    }



}
