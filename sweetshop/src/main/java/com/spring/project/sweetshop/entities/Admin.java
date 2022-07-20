package com.spring.project.sweetshop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sweetadmin")
public class Admin {
	@Id
	@Column(name="adid")
	private int adid;
	@Column(name="adusername")
	private String adusername;
	@Column(name="adpasscode")
	private String adpassword;
	
	public Admin(int adid, String adusername, String adpassword) {
		super();
		this.adid = adid;
		this.adusername = adusername;
		this.adpassword = adpassword;
	}
	

	public Admin() {
		super();
	}


	public int getAdid() {
		return adid;
	}
	public void setAdid(int adid) {
		this.adid = adid;
	}
	public String getAdusername() {
		return adusername;
	}
	public void setAdusername(String adusername) {
		this.adusername = adusername;
	}
	public String getAdpassword() {
		return adpassword;
	}
	public void setAdpassword(String adpassword) {
		this.adpassword = adpassword;
	}
	
}
