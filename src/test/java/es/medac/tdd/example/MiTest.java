package es.medac.tdd.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MiTest {

    @Test
    public void testSumar(){
        Calc calc = new Calc(2,2);
        Integer result = calc.sumar();
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testSumarUnoMasUno(){
        Calc calc = new Calc(1,1);
        Integer result = calc.sumar();
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testRestar(){
        Calc calc = new Calc(2,1);
        Integer result = calc.restar();
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testRestarUnoMenosUno(){
        Calc calc = new Calc(1,1);
        Integer result = calc.restar();
        Assertions.assertEquals(0, result);
    }
    @Test
    public void testMultiplicar(){
        Calc calc = new Calc(2,2);
        Integer result = calc.mult();
        Assertions.assertEquals(4, result);
    }
    @Test
    public void testMultPorCero(){
        Calc calc = new Calc(2,0);
        Integer result = calc.mult();
        Assertions.assertEquals(0, result);
    }
    @Test
    public void dividir(){
        Calc calc = new Calc(2,2);
        Integer result = calc.div();
        Assertions.assertEquals(1, result);
    }
}
