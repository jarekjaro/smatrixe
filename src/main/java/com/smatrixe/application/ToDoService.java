package com.smatrixe.application;

import com.smatrixe.adapter.outbound.ToDoRepository;
import com.smatrixe.domain.ToDo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class ToDoService {
    private final ToDoRepository toDoRepository;

    public Flux<ToDo> getAllTodos() {
        return toDoRepository.findAll();
    }
}
