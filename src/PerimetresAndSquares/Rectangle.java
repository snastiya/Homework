package PerimetresAndSquares;
//прямоугольник

import java.util.Scanner;

public class Rectangle implements Figure {

    double a;
    double b;
    double rectangleSquare;
    double rectanglePerimeter;

    @Override
    public void inputFigure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи длину первой стороны прямоугольника: ");
        a = scanner.nextInt();
        System.out.println("Введи длину второй стороны прямоугольника: ");
        b = scanner.nextInt();

    }

    @Override
    public void square() {
        rectangleSquare = Math.round((a * b) * 100D) / 100D;
        System.out.println("Площадь прямоугольника равна: ");
    }

    @Override
    public void showPerimeter() {
        rectanglePerimeter = Math.round(((a + b) * 2) * 100D) / 100D;
        System.out.println("Периметр прямоугольника равен: " + rectanglePerimeter);
        System.out.println();
    }

    @Override
    public double calcPerimeter() {
        return rectanglePerimeter;
    }
}
