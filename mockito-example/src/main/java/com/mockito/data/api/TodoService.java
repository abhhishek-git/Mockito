package com.mockito.data.api;

import java.util.List;

public interface TodoService {
	public List<String> retrieveToDos(String user);
}
