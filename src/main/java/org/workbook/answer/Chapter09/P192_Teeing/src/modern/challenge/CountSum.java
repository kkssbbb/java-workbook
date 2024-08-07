package org.workbook.answer.Chapter09.P192_Teeing.src.modern.challenge;

public class CountSum {
    
    private final Long count;
    private final Integer sum;

    public CountSum(Long count, Integer sum) {
        this.count = count;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "CountSum{" + "count=" + count + ", sum=" + sum + '}';
    }        
    
}
