package com.smatrixe.adapter.inbound;

import com.smatrixe.application.ToDoService;
import com.smatrixe.domain.ToDo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
public class ToDoController {

    private final ToDoService toDoService;

    @GetMapping(value = "/todos")
    Flux<ToDo> getAllToDos() {
        return toDoService.getAllTodos();
    }
}
