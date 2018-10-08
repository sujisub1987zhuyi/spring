package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Girl;
import com.example.service.GirlService;

import io.swagger.annotations.ApiOperation;

@RestController
@Validated
public class GrilController {

	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
	private GirlService girlService;
	
	
	@GetMapping(value ="/all")
	@ApiOperation(value = "Get List Detail", notes = "Returns List Detail information.")
	public @ResponseBody Iterable<Girl> getAllUsers() {
		// This returns a JSON or XML with the users
		return girlService.findAll();
	}
}