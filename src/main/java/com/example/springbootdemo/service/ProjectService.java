package com.example.springbootdemo.service;

import com.example.springbootdemo.dto.ProjectDto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Service
public class ProjectService {

	ArrayList projectList = new ArrayList<ProjectDto>();

	ProjectDto projectDto1 = new ProjectDto();

	public ArrayList allProjects(){

		projectDto1.setTitle("Project Important");
		projectDto1.setSubtitle("This project");
		projectDto1.setDetail("Some quick example text to build on the card title and make up the bulk of the card's");

		projectList.add(projectDto1);
		projectList.add(projectDto1);
		projectList.add(projectDto1);


		return projectList;
	}
}
