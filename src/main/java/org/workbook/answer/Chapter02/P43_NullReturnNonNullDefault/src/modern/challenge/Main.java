package org.workbook.answer.Chapter02.P43_NullReturnNonNullDefault.src.modern.challenge;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Mazda", null);
        
        System.out.println("Car name: " + car.getName());
        System.out.println("Car color: " + car.getColor());
    }
    
}
