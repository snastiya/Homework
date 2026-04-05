package PerimetresAndSquares;

import java.util.Scanner;

public class Square implements Figure {

    double a;
    double squareSquare;
    double squarePerimeter;

    @Override
    public void inputFigure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи длину стороны квадрата: ");
        a = scanner.nextInt();

    }

    @Override
    public void square() {
        squareSquare = Math.round((a * a)*100D)/100D;
        System.out.println("Площадь квадрата равна: " + squareSquare);
    }

    @Override
    public void showPerimeter() {
        squarePerimeter = Math.round((4 * a)*100D)/100D;
        System.out.println("Периметр квадрата равен: " + squarePerimeter);
        System.out.println();
    }

    @Override
    public double calcPerimeter() {
        return squarePerimeter;
    }
}
