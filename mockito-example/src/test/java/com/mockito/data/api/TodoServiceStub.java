package com.mockito.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{

	@Override
	public List<String> retrieveToDos(String user) {
		return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to dance");
	}


}
