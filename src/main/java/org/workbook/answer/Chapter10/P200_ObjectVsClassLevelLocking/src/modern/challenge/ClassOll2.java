package org.workbook.answer.Chapter10.P200_ObjectVsClassLevelLocking.src.modern.challenge;

public class ClassOll2 {

    public void methodOll() {
        synchronized (this) {
            System.out.println("This is an OLL example");
        }
    }
}
