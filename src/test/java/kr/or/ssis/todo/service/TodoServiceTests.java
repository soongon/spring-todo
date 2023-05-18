package kr.or.ssis.todo.service;

import kr.or.ssis.todo.model.Todo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class TodoServiceTests {

    @Autowired
    private TodoService todoService;

    @Test
    public void testRegistTodo() {
        // 1. 1000, "테스트 투두", false 이렇게 입력해서 정상적으로 입력되면 ok
        todoService.registTodo(new Todo(1000, "테스트 투두", false));
    }

    @Test
    public void testCompleteTodo() {
        // 3 번 할일의 완료 작업을 수행하고, 결과를 확인해서 완료로 변경되면 ok
        todoService.completeTodo(3);
        Todo todo = todoService.viewTodoByTodoId(3);
        Assertions.assertTrue(todo.isCompleted());
    }
}
