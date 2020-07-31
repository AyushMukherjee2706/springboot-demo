package com.example.springbootdemo.service;

import org.springframework.web.multipart.MultipartFile;


public interface StorageService { //
	public void init();

	public void save(MultipartFile file);

//	public Resource load(String filename);
//
//	public void deleteAll();

	public String[] loadAll();
}
