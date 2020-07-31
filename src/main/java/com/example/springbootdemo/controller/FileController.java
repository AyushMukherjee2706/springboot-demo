package com.example.springbootdemo.controller;

import com.example.springbootdemo.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin //To permit cross origin request 
public class FileController {

	private final StorageService storageService; 

	@Autowired
	public FileController(StorageService storageService) {
		this.storageService = storageService;
	}

	@RequestMapping(value =  "/upload", method = RequestMethod.POST, consumes = "multipart/form-data")//when we click upload
	public void fileUpload(@RequestParam("file") MultipartFile file) throws Exception {

		storageService.save(file); // where are we catching this exception.
	}

	@RequestMapping(value =  "/all", method = RequestMethod.GET) // to fetch the list of sheet uploaded.
	public String[] listFiles() throws Exception {

		return storageService.loadAll() ;// where are we catching this exception.
	}

}
