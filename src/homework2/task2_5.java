package homework2;

import java.util.Scanner;

public class task2_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chislo = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= chislo; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}