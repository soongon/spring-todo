package kr.or.ssis.todo.dao;

import kr.or.ssis.todo.model.Todo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TodoDaoTests {  // test suit

    @Autowired
    private TodoDao todoDao;

    @Test
    public void testSelectAllTodos() {  // test case
        // 1. 실행 결과가 null이 아니면 테스트 통과
        List<Todo> todos = todoDao.selectAllTodos();
        //Assertions.assertNotNull(todos);

        // 2. 실행결과의 List<Todo>의 size가 0보다 크면 테스트 통과
        assertTrue(todos.size() > 0);
        assertEquals(3, todos.size());

//        if (todos != null) {
//            ok
//        } else {
//            실패
//        }
    }
    @Test
    public void testSelectTodoByTodoId() {
        // todo id 1번 으로 테스트해서 결과가 null 아니면 테스트 통과
        Todo todo = todoDao.selectTodoByTodoId(1);
        assertNotNull(todo);
        // todo id 1번 으로 테스트해서 결과의 title 속성이 "점심먹기" 이면 통과
        assertEquals("점심먹기", todo.getTitle());
        //assertTrue(todo.getTitle().equals("점심먹기"));
    }

}
