package PerimetresAndSquares;


import java.util.ArrayList;
import java.util.Arrays;

public class SummaPerimetres {


    public static void main(String[] args) {
        ArrayList<Double> allPerimeters = new ArrayList<>();

        Figure circle = new Circle();
        Figure reclangle = new Rectangle();
        Figure rhombus = new Rhombus();
        Figure square = new Square();
        Figure triangle = new Triangle();


        circle.inputFigure();
        circle.square();
        circle.showPerimeter();
        double p1 = circle.calcPerimeter();
        allPerimeters.add(p1);

        reclangle.inputFigure();
        reclangle.square();
        reclangle.showPerimeter();
        double p2 = reclangle.calcPerimeter();
        allPerimeters.add(p2);

        rhombus.inputFigure();
        rhombus.square();
        rhombus.showPerimeter();
        double p3 = rhombus.calcPerimeter();
        allPerimeters.add(p3);

        square.inputFigure();
        square.square();
        square.showPerimeter();
        double p4 = square.calcPerimeter();
        allPerimeters.add(p4);

        triangle.inputFigure();
        triangle.square();
        triangle.showPerimeter();
        double p5 = triangle.calcPerimeter();
        allPerimeters.add(p5);

        Double[] perimeterArray = allPerimeters.toArray(new Double[0]);
        System.out.println(Arrays.toString(perimeterArray));

        double sumPerimeters = 0;

        for(int i=0; i < perimeterArray.length; i++){
            sumPerimeters = sumPerimeters + perimeterArray[i];
        }
            sumPerimeters = Math.round(sumPerimeters*100D)/100D;
        System.out.println("Сумма периметров всех фигур равна: " + sumPerimeters);

    }

}
