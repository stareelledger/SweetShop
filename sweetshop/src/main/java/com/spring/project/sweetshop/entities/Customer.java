package com.spring.project.sweetshop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="custId")
	private int custId;
	@Column(name="custname")
	private String custName;
	@Column(name="custpass")
	private String custpass;
	public Customer(int custId, String custName, String custpass) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custpass = custpass;
	}
	public Customer() {
		super();
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustpass() {
		return custpass;
	}
	public void setCustpass(String custpass) {
		this.custpass = custpass;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custpass=" + custpass + "]";
	}
}
