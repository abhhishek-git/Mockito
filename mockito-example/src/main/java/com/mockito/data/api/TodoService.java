package com.mockito.data.api;

import java.util.List;

// Create TodoServiceStub
//Test TodoBusinessImpl using TodoServiceStub
public interface TodoService {
	public List<String> retrieveToDos(String user);
}
