package com.example.springbootdemo.dto;

import java.util.List;

public class CollectedDataDto {
	List<String> tower;
	List<String> module;
	List<String> resource;
	List<String> practitioner;
	List<String> location;

	public List<String> getTower() {
		return tower;
	}

	public void setTower(List<String> tower) {
		this.tower = tower;
	}

	public List<String> getModule() {
		return module;
	}

	public void setModule(List<String> module) {
		this.module = module;
	}

	public List<String> getResource() {
		return resource;
	}

	public void setResource(List<String> resource) {
		this.resource = resource;
	}

	public List<String> getPractitioner() {
		return practitioner;
	}

	public void setPractitioner(List<String> practitioner) {
		this.practitioner = practitioner;
	}

	public List<String> getLocation() {
		return location;
	}

	public void setLocation(List<String> location) {
		this.location = location;
	}
}
