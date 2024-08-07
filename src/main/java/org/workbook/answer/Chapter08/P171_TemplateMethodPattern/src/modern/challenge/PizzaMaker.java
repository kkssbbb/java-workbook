package org.workbook.answer.Chapter08.P171_TemplateMethodPattern.src.modern.challenge;

public abstract class PizzaMaker {

    public void make(Pizza pizza) {        
        makeDough(pizza);
        addTopIngredients(pizza);
        bake(pizza);
    }

    private void makeDough(Pizza pizza) {
        System.out.println("Make dough");
    }

    private void bake(Pizza pizza) {
        System.out.println("Bake the pizza");
    }

    public abstract void addTopIngredients(Pizza pizza);
}
