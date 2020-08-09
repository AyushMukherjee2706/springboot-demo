package com.example.springbootdemo.controller;

import com.example.springbootdemo.dto.CollectedDataDto;
import com.example.springbootdemo.dto.ExcelDataDto;
import com.example.springbootdemo.dto.RecordDto;
import com.example.springbootdemo.service.ProjectService;
import com.example.springbootdemo.service.StorageService;
import com.example.springbootdemo.util.ProjectUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class FileController {

	private final StorageService storageService;
	private final ProjectService projectService;

	@Autowired
	public FileController(StorageService storageService, ProjectService projectService) {
		this.storageService = storageService;
		this.projectService = projectService;
	}

	@RequestMapping(value =  "/upload", method = RequestMethod.POST, consumes = "multipart/form-data")
	public void fileUpload(@RequestParam("file") MultipartFile file) throws Exception {

		storageService.save(file);
	}

	@RequestMapping(value =  "/all", method = RequestMethod.GET)
	public ResponseEntity listFiles() throws Exception {

		return new ResponseEntity(projectService.getAllRecords(), HttpStatus.OK);
	}

	@RequestMapping(value =  "/data", method = RequestMethod.POST)
	public ResponseEntity dataUpload(@RequestBody ArrayList<RecordDto> data) throws Exception {

		for(RecordDto recordDto: data){

			projectService.uploadData(ProjectUtil.recordValueOf(recordDto));
		}
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value =  "/test", method = RequestMethod.GET)
	public void test() throws Exception {

		System.out.println("Testing it");
	}

	@RequestMapping(value =  "/project/all", method = RequestMethod.GET)
	public ResponseEntity getAllProject() throws Exception {

		return new ResponseEntity(projectService.getAllProjects(), HttpStatus.OK);
	}

	@RequestMapping(value =  "/result", method = RequestMethod.POST)
	public void getResult(@RequestBody CollectedDataDto collectedDataDto) throws Exception {

		System.out.println("in result catching");
		projectService.getResult(collectedDataDto);
	}


}
