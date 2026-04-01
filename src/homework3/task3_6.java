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
Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
 */

public class task3_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        Random random = new Random();

        int[] numbers = new int[a];

        for (int i = 0; i < a; i++) {
            numbers[i] = random.nextInt(11);
        }
        System.out.println("Вывод стартового массива: " + Arrays.toString(numbers));

        boolean upper = true;

        for (int i = 0; i < a - 1; i++) {
            if (numbers[i] >= numbers[i + 1]) {
                upper = false;
                break;
            }
        }
        if (upper) {
            System.out.println("Массив является возрастающим");
        } else {
            System.out.println("Массив НЕ является возрастающим");
        }
    }
}