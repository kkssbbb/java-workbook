package org.workbook.answer.Chapter07.P158_ReflectingAnnotations.src.modern.challenge;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Fruit {
    public String name();
    public String value();
}
