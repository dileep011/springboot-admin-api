package com.jsp.spring_boot_crud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.spring_boot_crud.dto.Admin;
import com.jsp.spring_boot_crud.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@PostMapping("/admins")
	public Admin save(@RequestBody Admin admin) {
		if(admin!=null) {
		return adminService.save(admin);
		}else {
			return null;
		}	
	}
	@GetMapping("/admins/{id}")
	public Admin getById(@PathVariable int id) {
		return adminService.getById(id);
	}
	
	@DeleteMapping("/admins/{id}")
	public void deleteById(@PathVariable int id) {
		adminService.deleteById(id);
	}
	
	@PutMapping("/admins")
	public Admin updateAllRecord(@RequestBody Admin admin) {
		return adminService.updateAllRecord(admin);
	}
	
	@GetMapping("/admins")
	public List<Admin> getAll(){
		 return adminService.getAll();
	}
	
	@PatchMapping("/admins")
	public Admin  updateRecord(@RequestBody Admin admin) {
		return adminService.updateRecord(admin);
	}
}
