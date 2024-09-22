package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NumberOperations {
    public static void main(String[] args) {
        // 1 завдання: Створення списку чисел
        List<Double> numberListTask1 = new ArrayList<>();
        numberListTask1.add(10.0);
        numberListTask1.add(20.5);
        numberListTask1.add(30.0);
        numberListTask1.add(40.7);
        numberListTask1.add(50.0);
        numberListTask1.add(60.3);
        numberListTask1.add(70.0);
        numberListTask1.add(80.1);
        numberListTask1.add(90.0);
        numberListTask1.add(100.9);

        // Виведення списку
        System.out.println("Завдання 1");
        System.out.println("Всі числа: " + numberListTask1);

        // 2 завдання: Створення чисел різних типів
        int intNumber = 127645;
        double doubleNumber = 20.556777d;
        float floatNumber = 30.01f;
        long longNumber = 405444455;
        BigDecimal bigDecimalNumber = new BigDecimal("50.123456");

        // Створення загального списку для чисел різних типів
        List<Number> numberListTask2 = new ArrayList<>();
        numberListTask2.add(intNumber);
        numberListTask2.add(doubleNumber);
        numberListTask2.add(floatNumber);
        numberListTask2.add(longNumber);
        numberListTask2.add(bigDecimalNumber);

        // 4. Виведення чисел у початковому форматі
        System.out.println("\nЗавдання 2");
        System.out.println("Числа у початковому форматі:");
        for (Number number : numberListTask2) {
            System.out.println(number);
        }

        // 5. Виведення чисел у форматі цілих чисел
        System.out.println("\nЧисла у форматі цілих чисел:");
        for (Number number : numberListTask2) {
            System.out.println(number.intValue());
        }

        // 6. Виведення чисел у форматі дробних чисел з двома знаками після коми
        System.out.println("\nЧисла у форматі дробних чисел з двома знаками після коми:");
        for (Number number : numberListTask2) {
            System.out.println(String.format("%.2f", number.doubleValue()));
        }

        // 7. Розподіл чисел на різні списки залежно від їх типу
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<BigDecimal> bigDecimalList = new ArrayList<>();

        for (Number number : numberListTask2) {
            if (number instanceof Integer) {
                integerList.add((Integer) number);
            } else if (number instanceof Double) {
                doubleList.add((Double) number);
            } else if (number instanceof BigDecimal) {
                bigDecimalList.add((BigDecimal) number);
            }
        }

        // Виведення чисел з окремих списків
        System.out.println("\nЦілі числа:");
        for (Integer number : integerList) {
            System.out.println(number);
        }

        System.out.println("\nЧисла з плаваючою комою:");
        for (Double number : doubleList) {
            System.out.println(number);
        }

        System.out.println("\nBigDecimal числа:");
        for (BigDecimal number : bigDecimalList) {
            System.out.println(number);
        }

        // 3 завдання: Створення нового списку, де кожне число початкового списку помножене на 2
        List<Double> multipliedList = new ArrayList<>();
        for (Double number : numberListTask1) {
            multipliedList.add(number * 2);
        }

        // Виведення нового списку з числами, помноженими на 2
        System.out.println("\nЗавдання 3");
        System.out.println("Новий список (числа з 1 завдання помножені на 2):");
        for (Double number : multipliedList) {
            System.out.println(number);
        }
    }
}
