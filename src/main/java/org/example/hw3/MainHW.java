package org.example.hw3;
// HW 3.1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
// переданное число четным или нечетным. (код приложен в презентации)
// HW 3.2.Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в
// интервал (25;100). (код приложен в презентации)
public class MainHW {
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInterval(int m){
        return m > 25 && m < 100;
    }
}

