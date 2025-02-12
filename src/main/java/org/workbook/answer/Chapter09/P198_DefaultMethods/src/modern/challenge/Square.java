package org.workbook.answer.Chapter09.P198_DefaultMethods.src.modern.challenge;

public class Square implements Polygon {

    private final double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return Math.pow(perimeter(edge, edge, edge, edge) / 4, 2);
    }
}
