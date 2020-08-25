package com.training.testing.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.training.testing.model.Scholar;

@Repository //Connect to Db
public class ScholarRepo {

	public List<Scholar> getAllScholars() {
		List<Scholar> scholars = new ArrayList<>();
		Scholar scholar1 = new Scholar();
		scholar1.setInum("i524893");
		scholar1.setName("Noirheeta");
		scholar1.setCourseDur(2);
		scholar1.setJoinYear(2020);
		
		Scholar scholar2 = new Scholar();
		scholar2.setInum("i524894");
		scholar2.setName("Harshit");
		scholar2.setCourseDur(2);
		scholar2.setJoinYear(2020);
		
		Scholar scholar3 = new Scholar();
		scholar3.setInum("i524895");
		scholar3.setName("Naman");
		scholar3.setCourseDur(2);
		scholar3.setJoinYear(2020);
		
		scholars.add(scholar1);
		scholars.add(scholar2);
		scholars.add(scholar3);
		
		return scholars;
		
		}
	
	public Scholar getScholar(String id) {
		Scholar scholar1 = new Scholar();
		scholar1.setInum(id);
		scholar1.setName("Noirheeta");
		
		return scholar1;
	}

	public void addScholar(Scholar scholar) {
		System.out.println(scholar.getInum()+" "+scholar.getName()+" "+scholar.getCourseDur());
		
		
	}
}
