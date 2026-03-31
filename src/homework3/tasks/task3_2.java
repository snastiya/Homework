package homework3.tasks;

import java.util.Arrays;

public class task3_2 {

    public static void main(String[] args) {

        String[] fruits = {"Яблоко", "Груша", "Банан", "Апельсин"};

        System.out.println(fruits[1]);
        System.out.println(fruits[3]);

        System.out.println(fruits.length);

        fruits[2] = "Мандарин";

        System.out.println(Arrays.toString(fruits));

    }
}