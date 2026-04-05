package homework7;

import java.util.Scanner;

public record InputStrings(String s1, String s2, String s3) {

    public static InputStrings inputStrings() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение первой строки: ");
        String s1 = scanner.nextLine();
        System.out.println("Введите значение второй строки: ");
        String s2 = scanner.nextLine();
        System.out.println("Введите значение третьей строки: ");
        String s3 = scanner.nextLine();

        scanner.close();
        return new InputStrings(s1, s2, s3);
    }

}
