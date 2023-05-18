package kr.or.ssis.todo.service;

import kr.or.ssis.todo.dao.TodoDao;
import kr.or.ssis.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoDao todoDao;

    public List<Todo> viewAllTodos() {
        return todoDao.selectAllTodos();
    }

    public Todo viewTodoByTodoId(String todoId) {
        return null;
    }
}
