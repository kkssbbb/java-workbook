package org.workbook.answer.Chapter08.P174_;

public class Main {

    public static void main(String[] args) {

        Cake cake = new Nuts(new Cream(new BaseCake()));
        System.out.println(cake.decorate());

        System.out.println("\nOr, like this:\n");

        BaseCake baseCake = new BaseCake();
        Cream creamCake = new Cream(baseCake);
        Nuts nutsCake = new Nuts(creamCake);

        System.out.println(baseCake.decorate());
        System.out.println(creamCake.decorate());
        System.out.println(nutsCake.decorate());
    }

}
