package PerimetresAndSquares;

import java.util.Scanner;

public class Rhombus implements Figure {

    double d1;
    double d2;
    double rhombusSquare;
    double rhombusPerimeter;

    @Override
    public void inputFigure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи длину первой диагонали ромба : ");
        d1 = scanner.nextInt();
        System.out.println("Введи длину второй диагонали ромба: ");
        d2 = scanner.nextInt();

    }

    @Override
    public void square() {
        rhombusSquare = Math.round(((d1 * d2) / 2)*100D)/100D;
        System.out.println("Площадь ромба равна: " + rhombusSquare);
    }

    @Override
    public void showPerimeter() {
        rhombusPerimeter = Math.round(((Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2))) * 2)*100D)/100D;
        System.out.println("Периметр ромба равен: " + rhombusPerimeter);
        System.out.println();
    }

    @Override
    public double calcPerimeter() {
        return rhombusPerimeter;
    }
}
