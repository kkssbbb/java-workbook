package org.workbook.answer.Chapter08.P166_WritingFunctionalInterfaces.src.modern.challenge;

public class GacMelonPredicate implements MelonPredicate {

    @Override
    public boolean test(Melon melon) {    
        return "gac".equalsIgnoreCase(melon.getType());
    }

}
