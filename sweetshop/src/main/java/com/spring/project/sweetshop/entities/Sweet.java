package com.spring.project.sweetshop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sweet")
public class Sweet {
	@Id
	@Column(name="sid")
	private int id;

	@Column(name="category")
	private String catgeory;
	@Column(name="product")
	private String product;
	@Column(name="rate")
	private int rate;
	@Column(name="offer")
	private int offer;
	public Sweet(int id, String catgeory, String product, int rate, int offer) {
		super();
		this.id=id;
		this.catgeory = catgeory;
		this.product = product;
		this.rate = rate;
		this.offer = offer;
	}
	public Sweet() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return catgeory;
	}
	public void setCategory(String catgeory) {
		this.catgeory = catgeory;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getOffer() {
		return offer;
	}
	public void setOffer(int offer) {
		this.offer = offer;
	}
	@Override
	public String toString() {
		return "Sweet [catgeory=" + catgeory + ", product=" + product + ", rate=" + rate + ", offer=" + offer + "]";
	}
	
}
