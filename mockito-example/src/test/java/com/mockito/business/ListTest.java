package com.mockito.business;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void mockListSizeMethod() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2,listMock.size());
	}
	
	@Test
	public void mockListSizeMethod_returnMultipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(5);
		
		assertEquals(2,listMock.size());
		assertEquals(5,listMock.size());
	}
	
	@Test
	public void mockListGet() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Mockito");
		
		assertEquals("Mockito",listMock.get(0));
		assertEquals(null,listMock.get(1));
	}
	
	//Matches any argument passed
	@Test
	public void mockListGetArgumentMatcher() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("Mockito");
		
		assertEquals("Mockito",listMock.get(0));
		assertEquals("Mockito",listMock.get(1));
	}


}
