package com.training.testing.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.testing.model.Scholar;
import com.training.testing.model.ScholarUI5;
import com.training.testing.service.ScholarService;





//Define APIs 

@RestController 	//this states that all the apis are found within this class
@RequestMapping("api/v1") //giving address(an endpoint) basically
public class ScholarController {
	
	private ScholarService scholarService;
	@Autowired
	
	public ScholarController(ScholarService scholarService) {
		this.scholarService = scholarService;
	}

	
	
	//{url}/api/v1/allscholars
	@GetMapping("allscholars")
	public List<ScholarUI5> getAllScholars(ScholarService scholarService) {
		return scholarService.getAllScholars();
		
		}
	
	

	//{url}/api/v1/scholar?id={id}
	@GetMapping("scholar")
	public ScholarUI5 getScholar(@RequestParam String id) {
		return scholarService.getScholar(id);
	}
	
	
//{url}/api/v1/scholar RB=id
	@PostMapping("scholar")
	public void addScholars(@RequestBody ScholarUI5 scholar) {
		scholarService.addScholar(scholar);
		}
	
	
	//{url}/api/v1/scholar?id={id}
	@DeleteMapping("scholar")
	public void delScholar(@RequestParam String id) {
		System.out.println("Deleting Scholar with id= "+id);
	}
}
