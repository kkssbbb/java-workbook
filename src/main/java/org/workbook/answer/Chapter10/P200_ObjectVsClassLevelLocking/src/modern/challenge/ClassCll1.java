package org.workbook.answer.Chapter10.P200_ObjectVsClassLevelLocking.src.modern.challenge;

public class ClassCll1 {

    public synchronized static void methodCll() {
        System.out.println("This is an CLL example");
    }
}
