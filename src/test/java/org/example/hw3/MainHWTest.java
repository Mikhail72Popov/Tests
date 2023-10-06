package org.example.hw3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainHWTest {
    private final MainHW mainHW = new MainHW();

    @Test
    public void testEvenOddNumber_evenNumber(){
        int n = 10;
        boolean result = mainHW.evenOddNumber(n);
        Assertions.assertTrue(result);
    }
    @Test
    public void testEvenOddNumber_oddNumber(){
        int n = 15;
        boolean result = mainHW.evenOddNumber(n);
        Assertions.assertFalse(result);
    }
    @Test
    public void testNumberInterval_numberRange(){
        int m = 26;
        boolean result = mainHW.numberInterval(m);
        Assertions.assertTrue(result);
    }
    @Test
    public void testNumberInterval_numberOfRange(){
        int m = 101;
        boolean result = mainHW.numberInterval(m);
        Assertions.assertFalse(result);
    }
}
