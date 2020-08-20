package com.example.springbootdemo.dto;

public class RecordDto {
	private String practitionerName;
	private String project;
	private String tower;
	private String module;
	private String certification;
	private String typeOfResource;

	@Override
	public String toString() {
		return "RecordDto{" +
				"practitionerName='" + practitionerName + '\'' +
				", project='" + project + '\'' +
				", tower='" + tower + '\'' +
				", module='" + module + '\'' +
				", certificationYear='" + certification + '\'' +
				", typeOfResource='" + typeOfResource + '\'' +
				", emailId='" + emailId + '\'' +
				", location='" + location + '\'' +
				'}';
	}

	private String emailId;
	private String location;

	public String getPractitionerName() {
		return practitionerName;
	}

	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getTower() {
		return tower;
	}

	public void setTower(String tower) {
		this.tower = tower;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getTypeOfResource() {
		return typeOfResource;
	}

	public void setTypeOfResource(String typeOfResource) {
		this.typeOfResource = typeOfResource;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
