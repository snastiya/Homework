package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:
Задача 5:
Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.
 */

public class task3_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        Random random = new Random();

        int[] numbers = new int[a];

        for (int i = 0; i < a; i++) {
            numbers[i] = random.nextInt(11);
        }
        System.out.println("Вывод стартового массива: " + Arrays.toString(numbers));

        int temp;

        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
            }

        System.out.println("Вывод инвертированного массива: " + Arrays.toString(numbers));

        }
    }