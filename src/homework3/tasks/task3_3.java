package homework3.tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
3.1 Создать пустой массив типа double с названием masDouble такого размера,
который пользователь вводит с клавиатуры.
3.2 Заполнить masDouble рандомными числами, используя Math.random() и
вывести его в консоль.
3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в
прямом и обратном порядке
 */

public class task3_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        Random random = new Random();

        int[] masDouble = new int[a];

        for (int i = 0; i < a; i++) {
            masDouble[i] = random.nextInt(11);
        }
        System.out.println("Вывод стартового массива: " + Arrays.toString(masDouble));

        for (int i = 2; i < a; i++) {

            if (i % 2 == 0) {
                masDouble[i] = masDouble[i] * masDouble[i];
            }

        }
        System.out.println("Вывод массива вoзведенного в степень: " + Arrays.toString(masDouble));
        Arrays.sort(masDouble);
        System.out.println("Вывод массива в прямом порядке: " + Arrays.toString(masDouble));


        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a - 1; i++) {
                if (masDouble[i] < masDouble[i + 1]) {
                    temp = masDouble[i];
                    masDouble[i] = masDouble[i + 1];
                    masDouble[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.println("Вывод массива в обратном порядке: " + Arrays.toString(masDouble));

    }
}