package kr.or.ssis.todo.model;

public class Todo {
    private int todoId;
    private String title;
    private boolean completed;

    public Todo() {}

    public Todo(int todoId, String title, boolean completed) {
        this.todoId = todoId;
        this.title = title;
        this.completed = completed;
    }

    public int getTodoId() {
        return todoId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todoId=" + todoId +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
