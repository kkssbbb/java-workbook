package org.workbook.answer.Chapter10.P200_ObjectVsClassLevelLocking.src.modern.challenge;

public class ClassOll3 {

    private final Object ollLock = new Object();

    public void methodOll() {
        synchronized (ollLock) {
            System.out.println("This is an OLL example");
        }
    }

}
