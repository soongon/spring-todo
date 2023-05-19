package kr.or.ssis.todo.service;

import kr.or.ssis.todo.dao.TodoDao;
import kr.or.ssis.todo.model.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    //private static final Logger log =
    //        LoggerFactory.getLogger(TodoService.class);

    @Autowired
    private TodoDao todoDao;

    public List<Todo> viewAllTodos() {

        return todoDao.selectAllTodos();
    }

    public Todo viewTodoByTodoId(int todoId) {
        return todoDao.selectTodoByTodoId(todoId);
    }

    public void registTodo(Todo todo) {

        todoDao.insertTodo(todo);
    }

    public void completeTodo(int todoId) {
        todoDao.updateToCompleteByTodoId(todoId);
    }

    public void removeTodoByTodoId(int todoId) {
        todoDao.deleteTodoByTodoId(todoId);
    }
}
