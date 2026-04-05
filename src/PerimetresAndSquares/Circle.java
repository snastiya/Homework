package PerimetresAndSquares;

import java.util.Scanner;

public class Circle implements Figure {

    double pi = 3.14;
    double radius;
    double circleSquare;
    double circlePerimeter;

    @Override
    public void inputFigure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи радиус круга: ");
        radius = scanner.nextInt();

    }

    @Override
    public void square() {
        circleSquare = Math.round((pi * (radius * radius)) * 100D)/100D;
        System.out.println("Площадь круга равна: " + circleSquare);
    }

    @Override
    public void showPerimeter() {
        circlePerimeter = Math.round((2 * pi * radius)*100D)/100D;
        System.out.println("Периметр круга (длина окружности) равен/на: " + circlePerimeter);
        System.out.println();
    }

    @Override
    public double calcPerimeter() {
        return circlePerimeter;
    }
}
