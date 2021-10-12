package com.smatrixe.adapter.outbound;

import com.smatrixe.domain.ToDo;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface ToDoRepository extends R2dbcRepository<ToDo, Long> {
}
