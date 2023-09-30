package fr.lernejo.todo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TodoListController {

    ArrayList<Todo> todoList = new ArrayList<Todo>();

    @PostMapping(value="/api/todo")
    private void addTodo(@RequestBody Todo todo){
        todoList.add(todo);
    }

    @GetMapping(value="/api/todo")
    private ArrayList<Todo> getTodoList(){
        return todoList;
    }
}
