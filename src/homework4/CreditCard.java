package homework4;

/*
Задача 1:
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */

import java.util.Random;
import java.util.Scanner;

public class CreditCard {
    long cardNumber;
    int money;

    public CreditCard() {
        this.cardNumber = cardNumber;
        this.money = money;

        Random random = new Random();

        cardNumber = 1_000_000_000_000_000L + random.nextLong(9_000_000_000_000_000L);
        money = random.nextInt(1000);

    }

    public void cardInfo() {

        System.out.println("Номер карты: " + cardNumber + ", баланс карты до проведения операции: " + money);
        System.out.println();
    }


    public double spisanie() {

        System.out.println("Введите сумму которую нужно списать с карты: " + cardNumber);
        Scanner scanner = new Scanner(System.in);
        int summaSpisaniya = scanner.nextInt();

        while (summaSpisaniya > money) {
            System.out.println("Введите сумму меньшую или равную: " + money);
            summaSpisaniya = scanner.nextInt();
        }

        money = money - summaSpisaniya;
        System.out.println("Номер карты:" + cardNumber + ", баланс карты после операции: " + money);
        System.out.println();
        return money;
    }

    public double zachislenie() {

        System.out.println("Введите сумму которую нужно зачислить на карту: " + cardNumber);
        Scanner scanner = new Scanner(System.in);
        int summaZachisleniya = scanner.nextInt();
        money = money + summaZachisleniya;
        System.out.println("Номер карты:" + cardNumber + ", баланс карты после операции: " + money);
        System.out.println();
        return money;
    }

}
