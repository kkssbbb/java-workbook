package org.workbook.answer.Chapter09.P177_TestHighOrderFunctions.src.modern.challenge;

@FunctionalInterface
public interface Replacer<String> {
    
    String replace(String s);
}
