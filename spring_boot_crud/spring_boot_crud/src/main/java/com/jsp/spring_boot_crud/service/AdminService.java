package com.jsp.spring_boot_crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring_boot_crud.dao.AdminDao;
import com.jsp.spring_boot_crud.dto.Admin;

@Service
public class AdminService {
	@Autowired
	AdminDao adminDao;
	
	public Admin save(Admin admin) {
		return  adminDao.save(admin);
	}
	
	public Admin getById(int id) {
		return adminDao.getById(id);
	}
	
	public void deleteById(int id) {
		adminDao.deleteById(id);
	}
	
	public void deleteAll() {
		adminDao.deleteAll();
	}
	
	public Admin updateAllRecord(Admin admin) {
		return adminDao.updateAllRecord(admin);
	}
	
	public List<Admin> getAll(){
		return adminDao.getAll();
	}
	
	public Admin  updateRecord(Admin admin) {
		return adminDao.updateRecord(admin);
	}
}
