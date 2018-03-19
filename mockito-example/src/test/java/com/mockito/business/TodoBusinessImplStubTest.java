package com.mockito.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.mockito.data.api.TodoService;
import com.mockito.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodoRelatedToSpring_usingStub() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl =
				new TodoBusinessImpl(todoServiceStub);
		
		List<String> filteredTodos = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");
		assertEquals(2, filteredTodos.size());
	}

}
