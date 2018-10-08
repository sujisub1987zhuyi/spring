package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.model.Girl;
import com.example.repository.GirlRepository;

import net.bytebuddy.asm.Advice.This;

@RunWith(MockitoJUnitRunner.class)
public class GirlServiceTest {

	@Mock
	private GirlRepository grilRepository;
	
	@InjectMocks
	private GirlService girlService;
	
	
	@Before
	public void setup() { 
		MockitoAnnotations.initMocks(This.class);
	}
	
	@Test
	public void should_GetAll() {
		List<Girl> list = new ArrayList<>();
		list.add(Girl.builder().age(10).cupSize("B").id(1).build());
		Mockito.when(grilRepository.findAll()).thenReturn(list);
		girlService.findAll();
	}

}
