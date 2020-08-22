package com.example.springbootdemo.controller;

import com.example.springbootdemo.dto.CollectedDataDto;
import com.example.springbootdemo.dto.RecordDto;
import com.example.springbootdemo.service.ProjectService;
import com.example.springbootdemo.util.ProjectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class FileController {


	private final ProjectService projectService;

	@Autowired
	public FileController(ProjectService projectService) {

		this.projectService = projectService;
	}

	//Annotation for mapping web requests onto methods
	@RequestMapping(value = "/project", method = RequestMethod.GET)// fetching the record from the table
	public ResponseEntity listFiles(@RequestParam("name") String projectName) throws Exception {

		System.out.println(projectName);
		return new ResponseEntity(projectService.getRecordsByProject(projectName), HttpStatus.OK);
	}

	@RequestMapping(value = "/data", method = RequestMethod.POST) //posting the data to DB
	public ResponseEntity dataUpload(@RequestBody ArrayList<RecordDto> data) throws Exception {

		for (RecordDto recordDto : data) { // each row is taken in the from of string

			projectService.uploadData(ProjectUtil.recordValueOf(recordDto));
		}
		return new ResponseEntity(HttpStatus.OK);
	}


	@RequestMapping(value = "/project/all", method = RequestMethod.GET)
	public ResponseEntity getAllProject() throws Exception {

		return new ResponseEntity(projectService.getAllProjects(), HttpStatus.OK);
	}

	//result
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public ResponseEntity getResult(@RequestBody CollectedDataDto collectedDataDto) throws Exception {

		System.out.println("in result catching");
		return new ResponseEntity(projectService.getResult(collectedDataDto), HttpStatus.OK);
	}


}
