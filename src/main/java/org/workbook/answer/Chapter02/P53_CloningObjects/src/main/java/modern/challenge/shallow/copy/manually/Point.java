package org.workbook.answer.Chapter02.P53_CloningObjects.src.main.java.modern.challenge.shallow.copy.manually;

public class Point {

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point clonePoint() {

        Point point = new Point();
        point.setX(this.x);
        point.setY(this.y);

        return point;
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
