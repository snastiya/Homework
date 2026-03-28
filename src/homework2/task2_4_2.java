package homework2;

import java.util.Scanner;

public class task2_4_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int temp = scanner.nextInt();

        if (temp > -5) {
            System.out.println("Warm");
        } else if (temp <= -5 && temp > -20) {
            System.out.println("Normal");
        } else if (temp <= -20) {
            System.out.println("Cold");
        }

    }
}