package org.workbook.answer.Chapter10.P200_ObjectVsClassLevelLocking.src.modern.challenge;

public class OllAndCll {

    public synchronized void nonStaticMethod() {
        System.out.println("nonStaticMethod(): " + Thread.currentThread().getName());
        while (true) {            
        }
    }

    public synchronized static void staticMethod() {
        System.out.println("staticMethod(): " + Thread.currentThread().getName());
        while (true) {            
        }
    }
}
