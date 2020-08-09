package com.example.springbootdemo.dto;

import java.util.ArrayList;

public class ExcelDataDto {
	ArrayList<ArrayList<String>> data;

	public ArrayList<ArrayList<String>> getData() {
		return data;
	}

	public void setData(ArrayList<ArrayList<String>> data) {
		this.data = data;
	}
}
