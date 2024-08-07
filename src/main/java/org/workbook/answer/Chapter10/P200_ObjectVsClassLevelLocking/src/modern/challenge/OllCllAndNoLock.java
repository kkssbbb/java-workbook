package org.workbook.answer.Chapter10.P200_ObjectVsClassLevelLocking.src.modern.challenge;

public class OllCllAndNoLock {

    public void notSynchronizedMethod() {
        System.out.println("notSynchronizedMethod(): " + Thread.currentThread().getName());
        while (true) {
        }
    }

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
