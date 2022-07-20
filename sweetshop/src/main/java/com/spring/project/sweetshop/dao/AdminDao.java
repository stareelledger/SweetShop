package com.spring.project.sweetshop.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;


import com.spring.project.sweetshop.entities.Admin;

public class AdminDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Transactional
	public int insert(Admin admin) {
		//insert 
		Integer i=(Integer) this.hibernateTemplate.save(admin);
		return i;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public Admin getAdmin(int adminId) {
	Admin admin=this.hibernateTemplate.get(Admin.class,adminId);
		return admin;
	}
	@Transactional
	public void deleteAdmin(int adminId) {
		Admin admin=this.hibernateTemplate.get(Admin.class,adminId);
		this.hibernateTemplate.delete(admin);
	}
	//update data
	@Transactional
	public void updateAdmin(Admin admin) {
		this.hibernateTemplate.update(admin);
	}


	
}
