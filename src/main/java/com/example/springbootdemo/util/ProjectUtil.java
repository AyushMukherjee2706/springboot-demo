package com.example.springbootdemo.util;

import com.example.springbootdemo.dto.RecordDto;
import com.example.springbootdemo.model.Record;

public class ProjectUtil {

	public static Record recordValueOf(RecordDto recordDto){

		Record record = new Record();
		record.setCertification(recordDto.getCertification());
		record.setEmailId(recordDto.getEmailId());
		record.setLocation(recordDto.getLocation());
		record.setModule(recordDto.getModule());
		record.setProject(recordDto.getProject());
		record.setPractitionerName(recordDto.getPractitionerName());
		record.setTower(recordDto.getTower());
		record.setTypeOfResource(recordDto.getTypeOfResource());

		return record;
	}
}
