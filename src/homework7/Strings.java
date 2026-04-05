package homework7;

import java.util.ArrayList;

import static homework7.InputStrings.inputStrings;

public class Strings {

    public static void task1() {

        System.out.println("Задача 1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.\n" +
                "Вывести найденные строки и их длину.");
        System.out.println();

        InputStrings input = inputStrings();
        String s1 = input.s1();
        String s2 = input.s2();
        String s3 = input.s3();

        String shortest, longest;

        if (s1.length() < s2.length() && s1.length() < s3.length()) {
            shortest = s1;
            System.out.println("Значение самой короткой строки: " + shortest + ", ее длина: " + shortest.length());
        } else if (s2.length() < s1.length() && s2.length() < s3.length()) {
            shortest = s2;
            System.out.println("Значение самой короткой строки: " + shortest + ", ее длина: " + shortest.length());
        } else if (s3.length() < s1.length() && s3.length() < s2.length()) {
            shortest = s3;
            System.out.println("Значение самой короткой строки: " + shortest + ", ее длина: " + shortest.length());
        } else {
            System.out.println("Более чем одна строка с одинаково маленькой длиной");
        }

        if (s1.length() > s2.length() && s1.length() > s3.length()) {
            longest = s1;
            System.out.println("Значение самой длиной строки: " + longest + ", ее длина: " + longest.length());
        } else if (s2.length() > s1.length() && s2.length() > s3.length()) {
            longest = s2;
            System.out.println("Значение самой длиной строки: " + longest + ", ее длина: " + longest.length());
        } else if (s3.length() > s1.length() && s3.length() > s2.length()) {
            longest = s3;
            System.out.println("Значение самой длиной строки: " + longest + ", ее длина: " + longest.length());
        } else {
            System.out.println("Более чем одна строка с одинаково большой длиной");
        }

    }

    public static void task2() {

        System.out.println("Задача 2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке\n" +
                "возрастания значений их длины.");
        System.out.println();

        InputStrings input = inputStrings();
        String s1 = input.s1();
        String s2 = input.s2();
        String s3 = input.s3();

        String[] massiveWords = {s1, s2, s3};

        boolean sorted = false;
        String temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < massiveWords.length - 1; i++) {
                if (massiveWords[i].length() > massiveWords[i + 1].length()) {
                    temp = massiveWords[i];
                    massiveWords[i] = massiveWords[i + 1];
                    massiveWords[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        for (int i = 0; i < massiveWords.length; i++) {
            System.out.println("Слово: " + massiveWords[i] + ". Длина: " + massiveWords[i].length());
        }
    }

    public static void task3() {

        System.out.println("Задача 3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых\n" +
                "меньше средней, а также их длину");
        System.out.println();

        InputStrings input = inputStrings();
        String s1 = input.s1();
        String s2 = input.s2();
        String s3 = input.s3();

        String[] massiveWords = {s1, s2, s3};
        ArrayList arrayWords = new ArrayList<>();

        int avgLenght = (s1.length() + s2.length() + s3.length()) / 3;

        //Заполнение массива словами меньше средней длины
        for (int i = 0; i < massiveWords.length; i++) {

            if (massiveWords[i].length() < avgLenght) {
                arrayWords.add(massiveWords[i]);
            }
        }

        //Вывод слов
        if (arrayWords.isEmpty()) {
            System.out.println("Нет строк короче средней длины.");
        } else {
            String[] newMassiveWords = (String[]) arrayWords.toArray(new String[0]);
            System.out.println("Список слов с длиной меньше средней: ");
            for (int i = 0; i < newMassiveWords.length; i++) {
                System.out.println("Слово: " + newMassiveWords[i] + " его длина: " + newMassiveWords[i].length());
            }
        }
    }

    public static void task3_1() {

        System.out.println("Задача 3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых\n" +
                "меньше средней, а также их длину");
        System.out.println();

        InputStrings input = inputStrings();
        String s1 = input.s1();
        String s2 = input.s2();
        String s3 = input.s3();

        int avgLenght = (s1.length() + s2.length() + s3.length()) / 3;

        System.out.println("Средняя длина строки: " + avgLenght);

        if (s1.length() < avgLenght) {
            System.out.println("Значение cтроки с длиной меньше средней: " + s1 + ", ее длина: " + s1.length());
        }
        if (s2.length() < avgLenght) {
            System.out.println("Значение cтроки с длиной меньше средней: " + s2 + ", ее длина: " + s2.length());
        }
        if (s3.length() < avgLenght) {
            System.out.println("Значение cтроки с длиной меньше средней: " + s3 + ", ее длина: " + s3.length());
        } else {
            System.out.println("Нет строк с длиной меньше средней");
        }
    }

    public static void task4() {

        System.out.println("Задача 4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных\n" +
                "символов. Если таких слов несколько, найти первое из них.");

        InputStrings input = inputStrings();
        String s1 = input.s1();
        String s2 = input.s2();
        String s3 = input.s3();

        // Поиск первого слова с уникальными символами
        String result = null;

        if (UniqueCharacters(s1)) {
            result = s1;
        } else if (UniqueCharacters(s2)) {
            result = s2;
        } else if (UniqueCharacters(s3)) {
            result = s3;
        }

        // Вывод результата
        if (result != null) {
            System.out.println("Первое слово с разными символами: " + result);
        } else {
            System.out.println("Во всех словах есть повторяющиеся символы");
        }
    }


    private static boolean UniqueCharacters(String word) {
        // Преобразуем строку в массив символов
        char[] chars = word.toCharArray();
        // Сортируем массив
        java.util.Arrays.sort(chars);

        // Проверяем соседние символы
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                return false; // Нашли повторяющийся символ
            }
        }
        return true;
    }


    public static void task5() {

        System.out.println("Задача 5. Вывести на консоль новую строку, которой задублирована каждая буква из\n" +
                "начальной строки. Например, \"Hello\" -> \"HHeelllloo\"");
        System.out.println();

        String word = "Hello";
        String newWord = "";

        char letter;
        for (int i = 0; i < word.length(); i++) {
            letter = word.charAt(i);
            System.out.println(letter);

            newWord = newWord + letter + letter;
        }

        System.out.println("Исходное слово: " + word);
        System.out.println("Новое слово: " + newWord);

    }

    public static void task5_2() {

        System.out.println("Задача 5. Вывести на консоль новую строку, которой задублирована каждая буква из\n" +
                "начальной строки. Например, \"Hello\" -> \"HHeelllloo\"");
        System.out.println();

        String word = "Hello";
        String newWord = "";

        char[] letters = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {

            newWord = newWord + letters[i] + letters[i];

        }

        System.out.println("Исходное слово: " + word);
        System.out.println("Новое слово: " + newWord);

    }

    public static void main(String[] args) {

        task1();  //готово
        //task2(); //готово
        //task3(); //готово
        //task3_1(); //готово
        //task4();
        //task5(); //готово
        //task5_2(); //готово

    }

}
