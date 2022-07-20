package com.spring.project.sweetshop.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.project.sweetshop.entities.Customer;



public class CustomerDao {
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int insert(Customer customer) {
		//insert 
		Integer i=(Integer) this.hibernateTemplate.save(customer);
		return i;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//get the single data(object)
	public Customer getCustomer(int customerId) {
	Customer Customer=this.hibernateTemplate.get(Customer.class,customerId);
		return Customer;
	}
}
