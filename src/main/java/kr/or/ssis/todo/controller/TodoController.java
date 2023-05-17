package kr.or.ssis.todo.controller;

import kr.or.ssis.todo.model.Todo;
import kr.or.ssis.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> viewAllTodos() {
        return todoService.viewAllTodos();
    }

    @GetMapping("/todos/{todoId}")
    public Todo viewTodoByTodoId(@PathVariable String todoId) {
        return todoService.viewTodoByTodoId(todoId);
    }
}
