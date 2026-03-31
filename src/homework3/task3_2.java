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
Задача 2:
Найти минимальный - максимальный элементы и вывести в консоль.
 */

public class task3_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        Random random = new Random();

        int[] numbers = new int[a];

        for (int i = 0; i < a; i++) {
            numbers[i] = random.nextInt(11);
        }
        System.out.println("Вывод стартового массива: " + Arrays.toString(numbers));

        int min = numbers[0];

        for (int i = 0; i < a; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Минимальное число в массиве: " + min);

        int max = numbers[0];

        for (int i = 0; i < a; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Максимальное число в массиве: " + max);
    }
}