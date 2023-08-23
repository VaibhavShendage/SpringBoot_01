package com.rt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rt.dao.StudentDao;
import com.rt.entities.Student;
@Component
public class StudentService {
     @Autowired
	StudentDao Dao;
	
	public void AddStd(Student st) {
		
		Dao.save(st);
		
	}

}
