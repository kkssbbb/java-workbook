package org.workbook.answer.Chapter04.P85_AssigningArrayToVar.src.modern.challenge;

public class Main {

    public static void main(String[] args) {

        // using explicit type
        int[] numbers = new int[10];
        
        // using var
        var numberArray = new int[10]; // inferred as array of int, int[]
    }
    
}
