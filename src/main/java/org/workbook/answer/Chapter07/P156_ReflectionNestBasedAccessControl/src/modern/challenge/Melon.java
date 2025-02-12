package org.workbook.answer.Chapter07.P156_ReflectionNestBasedAccessControl.src.modern.challenge;

public class Melon {

    private final String type;
    private final int weight;

    public Melon(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public class Slice {

        public class Peeler {
        }
    }

    public class Juicer {
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return type + "(" + weight + "g)";
    }
}
