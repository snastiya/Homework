package PerimetresAndSquares;

import java.util.Scanner;

public class Triangle implements Figure {

    double a;
    double triangleSquare;
    double trianglePerimeter;


    @Override
    public void inputFigure() {
        System.out.println("Рассматриваем частный случай треугольника - равносторонний треугольник.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи длину стороны треугольника: ");
        a = scanner.nextInt();

    }

    @Override
    public void square() {
        triangleSquare = Math.round(((Math.sqrt(3)*Math.pow(a, 2))/a)*100D)/100D;
        System.out.println("Площадь квадрата равна: " + triangleSquare);
    }

    @Override
    public void showPerimeter() {
        trianglePerimeter = Math.round((3 * a)*100D)/100D;
        System.out.println("Периметр квадрата равен: " + trianglePerimeter);
        System.out.println();
    }

    @Override
    public double calcPerimeter() {
        return trianglePerimeter;
    }
}
