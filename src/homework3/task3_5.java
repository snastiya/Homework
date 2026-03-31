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
Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
 */

public class task3_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        Random random = new Random();

        int[] numbers = new int[a];

        for (int i = 0; i < a; i++) {
            numbers[i] = random.nextInt(11);
        }
        System.out.println("Вывод стартового массива: " + Arrays.toString(numbers));

        int zeroCount = 0;

        for (int i = 0; i < a; i++) {
            if (numbers[i] == 0) {
                zeroCount++;
            }
        }
        System.out.println("Количество нулей: " + zeroCount);
    }
}