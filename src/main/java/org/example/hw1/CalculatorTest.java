package org.example.hw1;
import org.example.hw1.Calculator;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        if (180.0 != Calculator.calculateDiscount(200.0, 20.0)){
            throw new AssertionError("Ошибка в методе");
        }
        else new Calculator();
    }
}

