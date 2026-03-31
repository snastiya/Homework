package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Задача *:
Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} - > 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив.
Массив не содержит нуля в начале, кроме самого числа 0.
Пример:
Input: [1,4,0,5,6,3]
Output: [1,4,0,5,6,4]
Input: [9,9,9]
Output: [1,0,0,0]
 */

public class task3_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        Random random = new Random();

        int[] numbers = new int[a];

        for (int i = 0; i < a; i++) {
            numbers[i] = random.nextInt(11);
        }
        System.out.println("Вывод стартового массива: " + Arrays.toString(numbers));

        String chislo = "";
        for (int digit : numbers) {
            chislo += digit;
        }

        int number = Integer.parseInt(chislo);
        System.out.println(number); // Вывод: 999

        number += 1;

        String newNumber = Integer.toString(number);

        int arraylenght = newNumber.length();

        char[] charArray = newNumber.toCharArray();
        int newNumbers[] = new int[arraylenght];

        for (int i = 0; i < arraylenght; i++) {
            newNumbers[i] = Character.getNumericValue(charArray[i]);

        }
        System.out.println(Arrays.toString(newNumbers));
    }
}