package homework4;

/*
Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
-количеством купюр каждого номинала
 */

import java.util.Scanner;

public class ATM {
    int countHundred;
    int countFifty;
    int countTwenty;

    int sumAferInput;

    public ATM() {
        this.countHundred = 0;
        this.countFifty = 0;
        this.countTwenty = 0;
    }

    public int inputMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести количество вносимых купюр номиналом 100: ");
        countHundred = scanner.nextInt();
        System.out.println("Ввести количество вносимых купюр номиналом 50: ");
        countFifty = scanner.nextInt();
        System.out.println("Ввести количество вносимых купюр номиналом 20: ");
        countTwenty = scanner.nextInt();

        sumAferInput = (countHundred * 100) + (countFifty * 50) + (countTwenty * 20);

        System.out.println("Общая сумма купюр в банкомате: " + sumAferInput);
        System.out.println("Купюр по 100: " + countHundred);
        System.out.println("Купюр по 50: " + countFifty);
        System.out.println("Купюр по 20: " + countTwenty);
        System.out.println();
        return sumAferInput;

    }

    public boolean getMoney() {

        System.out.println("Введите сумму для снятия: ");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int sumForGet = scanner.nextInt();

        if (sumForGet <= 0 || sumForGet > sumAferInput) {
            System.out.println("Невозможно выдать сумму " + sumForGet + ". Введите ненулевое значение или сумму не превышающую " + sumAferInput);
            return false;
        }

        int tempSum = sumForGet;
        int take100 = 0;
        int take50 = 0;
        int take20 = 0;

        // Сначала выдаем сотки, пока не кончатся купюры
        while (tempSum >= 100 && countHundred > take100) {
            tempSum = tempSum - 100;
            take100++;
        }
        // Потом выдаем полтосы, пока не кончатся купюры
        while (tempSum >= 50 && countFifty > take50) {
            tempSum = tempSum - 50;
            take50++;
        }
        // Потом выдаем двадцатки, пока не кончатся купюры
        while (tempSum >= 20 && countTwenty > take20) {
            tempSum = tempSum - 20;
            take20++;
        }

        // Если в коце осталось не 0 рублей, выдача не будет произведена
        if (tempSum != 0) {
            System.out.println("Невозможно выдать сумму " + sumForGet + " имеющимися купюрами.");
            return false;
        }

        // Формируем остаток купюр в банкомате
        countHundred = countHundred - take100;
        countFifty = countFifty - take50;
        countTwenty = countTwenty - take20;


        // Формируем сообщение после успешного снятия
        System.out.println("Выдана сумма - " + sumForGet);
        System.out.println();
        if (take100 > 0) System.out.println("Выдано купюрами по 100 - " + take100);
        if (take50 > 0) System.out.println("Выдано купюрами по 50 - " + take50);
        if (take20 > 0) System.out.println("Выдано купюрами по 20 - " + take20);

        return true;

    }


}




