package com.example.springbootdemo.service;

import com.example.springbootdemo.dto.CollectedDataDto;
import com.example.springbootdemo.dto.ProjectDto;
import com.example.springbootdemo.model.Record;
import com.example.springbootdemo.repository.RecordRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class ProjectService {

	
	@Autowired
	private RecordRepository recordRepository;

	public void uploadData(Record record) {

		try {
			recordRepository.save(record);
		} catch (Exception e) {
			System.out.println("Exception while inserting data" + e.getMessage());
		}
	}

	public Set getAllProjects() {
		Set<String> linkedHashSet = new LinkedHashSet<>();

		for (String project : recordRepository.findAllProjects()) {
			linkedHashSet.add(project);
		}

		return linkedHashSet;
	}

	public List<Record> getRecordsByProject(String projectName){
		return recordRepository.findByProject(projectName);
	}
//Result
	public List getResult(CollectedDataDto collectedDataDto){
		List<Record> recs = recordRepository.findAllRecords(collectedDataDto.getLocation(), collectedDataDto.getModule(), collectedDataDto.getTower(), collectedDataDto.getResource());
		for(Record rec: recs){
			System.out.println("---------------------------Data---------------------------------------");
			System.out.println(rec.getLocation());
			System.out.println(rec.getModule());
			System.out.println(rec.getTower());
			System.out.println(rec.getPractitionerName());
			System.out.println(rec.getCertification());
			System.out.println(rec.getEmailId());
			
			
			
		}
		return recs;

	}
}
