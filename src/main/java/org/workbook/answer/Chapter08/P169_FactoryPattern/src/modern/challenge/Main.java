package org.workbook.answer.Chapter08.P169_FactoryPattern.src.modern.challenge;

public class Main {

    public static void main(String[] args) {

        Gac gac = (Gac) MelonFactory.newInstance(Gac.class);        
        Melon melon = (Melon) MelonFactory.newInstance("Gac", 2000, "red");        
        
        System.out.println("Gac: " + gac);
        System.out.println("Melon: " + melon);
    }
    
}
