package com.spring.project.sweetshop.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.project.sweetshop.entities.Sweet;



public class SweetDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public int insert(Sweet sweet) {
		//insert 
		Integer i=(Integer) this.hibernateTemplate.save(sweet);
		return i;
	}
	//get the single data(object)
	public Sweet getSweet(int sweetId) {
	Sweet sweet=this.hibernateTemplate.get(Sweet.class,sweetId);
		return sweet;
	}
	
	//get all student(all rows)
	public List<Sweet> getAllSweets(){
		List<Sweet> sweet=this.hibernateTemplate.loadAll(Sweet.class);
		return sweet;
	}
	
	//deleting the data
	@Transactional
	public void deleteSweet(int sweetProduct) {
		Sweet sweet=this.hibernateTemplate.get(Sweet.class,sweetProduct);
		this.hibernateTemplate.delete(sweet);
	}
	//update data
	@Transactional
	public void updateSweet(Sweet sweet) {
		this.hibernateTemplate.update(sweet);
	}
}
