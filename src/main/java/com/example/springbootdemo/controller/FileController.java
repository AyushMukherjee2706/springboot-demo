package com.example.springbootdemo.controller;

import com.example.springbootdemo.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
public class FileController {

	private final StorageService storageService;

	@Autowired
	public FileController(StorageService storageService) {
		this.storageService = storageService;
	}

	@RequestMapping(value =  "/upload", method = RequestMethod.POST, consumes = "multipart/form-data")
	public void fileUpload(@RequestParam("file") MultipartFile file) throws Exception {

		storageService.save(file);
	}

	@RequestMapping(value =  "/all", method = RequestMethod.GET)
	public String[] listFiles() throws Exception {

		return storageService.loadAll() ;
	}

}
