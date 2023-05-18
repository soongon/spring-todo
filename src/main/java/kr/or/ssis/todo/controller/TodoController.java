package kr.or.ssis.todo.controller;

import kr.or.ssis.todo.model.Todo;
import kr.or.ssis.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/todos")
    public void registTodo(@RequestBody Todo todo) {
        todoService.registTodo(todo);
    }
}
