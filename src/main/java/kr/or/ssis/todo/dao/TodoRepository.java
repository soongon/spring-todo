package kr.or.ssis.todo.dao;

import kr.or.ssis.todo.model.Todo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoRepository {

    private SqlSessionTemplate sessionTemplate;

    public List<Todo> selectAllTodos() {
        return sessionTemplate.selectList("selectAllTodos");
    }

    public void insertTodo(Todo todo) {
        sessionTemplate.insert("insertTodo", todo);
    }

//    public void updateToCompleteByTodoId(int todoId) {}
//
//
//    public void deleteTodoByTodoId(int todoId) {
//
//    }
//
//    Todo selectTodoByTodoId(int todoId) {
//
//    }
}
