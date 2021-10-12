package com.smatrixe.domain;

import org.springframework.data.annotation.Id;

public record ToDo(@Id Long id, String text, ToDoType type) {
    public ToDo changeText(String newText) {
        return new ToDo(id, newText, type);
    }
}
