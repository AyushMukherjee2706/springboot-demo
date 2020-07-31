package com.example.springbootdemo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.util.stream.Stream;

@Service // Learn more on this
public class StorageServiceImpl implements StorageService {

	private final Path root = Paths.get("uploads");


	public void save(MultipartFile file) { // Is this upload or selecting the files then.
		try {
			Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
		} catch (Exception e) {
			throw new RuntimeException("Could not store the file. Error: " + e.getMessage());
		}
	}

	public void init() { // method to create the upload folder is not already existing
		try {
			Files.createDirectory(root);
			System.out.println("intializing");
		} catch (Exception e) {
			throw new RuntimeException("Could not initialize folder for upload!");
		}
	}

	public String[] loadAll() { // method to load all the files that are uploaded.
//		try {
//			return Files.walk(this.root, 1).filter(path -> !path.equals(this.root)).map(this.root::relativize);
//		}
//
		try {
			File folders = new File("uploads");

			return folders.list(); // returning the list in "List of files" page
		} catch (Exception e) {
			throw new RuntimeException("Could not load the files!");
		}
	}
}
