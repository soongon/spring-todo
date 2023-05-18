package kr.or.ssis.todo.controller;

import kr.or.ssis.todo.model.Todo;
import kr.or.ssis.todo.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    private static final Logger log = LoggerFactory.getLogger(TodoController.class);

    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Todo> viewAllTodos() {
        log.debug("viewAllTodos 호출됨...");
        return todoService.viewAllTodos();
    }

    @GetMapping("/todos/{todoId}")
    public Todo viewTodoByTodoId(@PathVariable int todoId) {
        return todoService.viewTodoByTodoId(todoId);
    }

    @PostMapping("/todos")
    public void registTodo(@RequestBody Todo todo) {
        log.debug(todo.toString());
        todoService.registTodo(todo);
    }

    @PutMapping("/todos/{todoId}")
    public void completeTodo(@PathVariable int todoId) {
        todoService.completeTodo(todoId);
    }

    @DeleteMapping("/todos/{todoId}")
    public void removeTodoByTodoId(@PathVariable int todoId) {
        todoService.removeTodoByTodoId(todoId);
    }
}
