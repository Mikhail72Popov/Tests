//Задание 1. ** В классе Calculator создайте метод calculateDiscount,
//        который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки.
//        Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
//        Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать
//        исключение ArithmeticException.
//        Не забудьте написать тесты для проверки этого поведения.

package org.example.hw1;

public class Calculator {
    public static double calculateDiscount(double amount, double discount){
        if (amount < 0 || discount <0 || discount > 100){
            throw new ArithmeticException("Недопустимые аргументы");
        }
        else {
            double discountAmount = amount * discount / 100;
            double result = amount - discountAmount;
            System.out.println(result);
            return result;
        }
    }
}
