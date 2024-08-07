package org.workbook.answer.Chapter02.P53_CloningObjects.src.main.java.modern.challenge.shallow.copy.clone;

public class Point implements Cloneable {

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Point clone() throws
            CloneNotSupportedException {
        return (Point) super.clone();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}
