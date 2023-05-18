package kr.or.ssis.todo.dao;

import kr.or.ssis.todo.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class TodoDao {

    public List<Todo> selectAllTodos() {
        return Arrays.asList(
                new Todo(1, "청소하기", false),
                new Todo(2, "음악감상하기", false)
        );
    }
}
