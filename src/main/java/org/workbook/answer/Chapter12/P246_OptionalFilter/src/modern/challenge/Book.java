package org.workbook.answer.Chapter12.P246_OptionalFilter.src.modern.challenge;

import java.util.Optional;

public class Book {

    private String isbn;

    public Optional<String> getIsbn() {
        return Optional.ofNullable(isbn);
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
