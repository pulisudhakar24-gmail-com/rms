package com.ondemand.rms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name= "on-demand")
public class OnDemand implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GenarateValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getSoNumber() {
		return soNumber;
	}

	public void setSoNumber(String soNumber) {
		this.soNumber = soNumber;
	}

	public String getRequesterName() {
		return requesterName;
	}

	public void setRequesterName(String requesterName) {
		this.requesterName = requesterName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name= "so_number")
	private String soNumber;
	
	@Column(name = "requester_name")
	private String requesterName;
	
	@column (name = "account")
	private String account;
	
	@column(name ="region")
	private String region;
	
	@column(name ="location")
	private String location;
	
	@column (name ="skills")
	private String skills;
	
	@column (name ="grade")
	private String grade;
	
	@column (name ="priority")
	private String priority;
	
	@column (name ="create_date")
	private String createDate;
	
	@column (name ="created_by")
	private String createdBy;
	
	@column (name ="status")
	private String status;
}
