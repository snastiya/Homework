package homework3.tasks;

import java.util.Random;

public class task3_1 {

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int a = random.nextInt(100);
            int square = a * a;
            System.out.println(square);
        }
    }
}