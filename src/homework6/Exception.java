package homework6;

import java.util.Scanner;

public class Exception {

    public static void tryCatch(){

        try {
            int result = 10/0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
    }

    public static void tryCatchFewCatch (){
        try {

            int [] array = {1, 2, 3};
            System.out.println(array[10]);
            int result = 10/0;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
    }

    public static void tryCatchMultiCatch () {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[10]);
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Произошла ошибка");
        }
    }

    public static void tryCatchFinally (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        try {
            int result = scanner.nextInt();
            System.out.println("Успешный вывод " + result);
        } catch (java.lang.Exception e) {
            System.out.println("Неверный формат ввода");
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {

        tryCatch();
        tryCatchFewCatch();
        tryCatchMultiCatch();
        tryCatchFinally();
    }

}