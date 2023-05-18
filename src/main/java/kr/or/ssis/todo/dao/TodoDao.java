package kr.or.ssis.todo.dao;

import kr.or.ssis.todo.model.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
@Mapper
public interface TodoDao {

    List<Todo> selectAllTodos();

    void insertTodo(Todo todo);

    void updateToCompleteByTodoId(int todoId);

    void deleteTodoByTodoId(int todoId);

    Todo selectTodoByTodoId(int todoId);
}
