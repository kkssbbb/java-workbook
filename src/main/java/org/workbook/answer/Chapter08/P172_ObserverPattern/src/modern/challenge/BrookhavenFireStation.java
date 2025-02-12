package org.workbook.answer.Chapter08.P172_ObserverPattern.src.modern.challenge;

public class BrookhavenFireStation implements FireObserver {

    @Override
    public void fire(String address) {
        if(address.contains("Brookhaven")) {
            System.out.println("Brookhaven fire station will go to this fire");
        }
    }
    
}
