package com.jsp.spring_boot_crud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jsp.spring_boot_crud.dto.Admin;
import com.jsp.spring_boot_crud.respository.AdminRepository;

@Repository
public class AdminDao {
	
	@Autowired
	AdminRepository adminRepository;
	
	public Admin save(Admin admin) {
		return adminRepository.save(admin);	
	}
	
	public Admin getById(int id) { 
		Optional<Admin> optional=adminRepository.findById(id);
		return optional.get();
	}
	
	public void deleteById(int id) {
		 adminRepository.deleteById(id);	
	}
	
	public void deleteAll() {
		adminRepository.deleteAll();
	}
	
	public Admin updateAllRecord(Admin admin) {
		Optional<Admin> optional=adminRepository.findById(admin.getId());
		Admin admin2=optional.get();
		if(admin2!=null) {
			return adminRepository.save(admin);
		}
		return  null;
	}
	
	public List<Admin> getAll(){
		return adminRepository.findAll();
	}
	
	public Admin  updateRecord(Admin admin) {
		Optional<Admin> optional= adminRepository.findById(admin.getId());
		Admin admin2=optional.get();
		if(admin2!=null) {
			return adminRepository.save(admin);
		}
		return null;
		
	}

}
