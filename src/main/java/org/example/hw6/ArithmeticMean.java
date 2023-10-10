package org.example.hw6;

import java.util.List;

/**
 * Задание 1.
 * Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
 * a. Рассчитывает среднее значение каждого списка.
 * b. Сравнивает эти средние значения и выводит соответствующее сообщение:
 * - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
 * - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
 * - ""Средние значения равны"", если средние значения списков равны.
 *
 * Важно:
 * Приложение должно быть написано в соответствии с принципами объектно-ориентированного программирования.
 * Используйте Pytest (для Python) или JUnit (для Java) для написания тестов,
 * которые проверяют правильность работы программы. Тесты должны учитывать различные сценарии использования
 * вашего приложения.
 * Используйте pylint (для Python) или Checkstyle (для Java) для проверки качества кода.
 * Сгенерируйте отчет о покрытии кода тестами. Ваша цель - достичь минимум 90% покрытия.
 */

public class ArithmeticMean {

    public static void main(String[] args) {
        double l1 = List1.list1();
        double l2 = List2.list2();
            System.out.println("среднее значение первого списка = " + l1);
            System.out.println("среднее значение второго списка = " + l2);

            if (l1 == l2) {
                System.out.println("Средние значения равны");
                return;
            }
            if (l1 > l2) {
                System.out.println("Первый список имеет большее среднее значение");
                return;
            }
            System.out.println("Второй список имеет большее среднее значение");

        }

}
/**
public class ArithmeticMean{
    public String compareLists(List<Double> list1, List<Double> list2){
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);
        if (average1 > average2){
            return "Первый список имеет большее среднее значение";
        }else if (average1 < average2){
            return "Второй список имеет большее среднее значение";
        }else {
            return "Средние значения равны";
        }
    }
    private double calculateAverage(List<Double> list){
        double sum = 0;
        for (double num : list){
            sum += num;
        }
        return sum / list.size();
    }
}
 */