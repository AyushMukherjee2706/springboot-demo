package com.example.springbootdemo.controller;

import com.example.springbootdemo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@RequestMapping(value = "/project/all", method = RequestMethod.GET)
	public ResponseEntity allProjects() {

		return new ResponseEntity(projectService.allProjects(), HttpStatus.OK);
	}
}
