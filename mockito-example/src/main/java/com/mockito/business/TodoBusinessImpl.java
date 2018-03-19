package com.mockito.business;

import java.util.ArrayList;
import java.util.List;

import com.mockito.data.api.TodoService;

//TodoBusinessImpl is SUT: System Under Test
//TodoService is Dependency as TodoBusinessImpl requires its
public class TodoBusinessImpl {

	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}

	public List<String> retrieveTodoRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<>();
		List<String> todos = todoService.retrieveToDos(user);
		for(String todo: todos) {
			if(todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		
		return filteredTodos;
	}

}
