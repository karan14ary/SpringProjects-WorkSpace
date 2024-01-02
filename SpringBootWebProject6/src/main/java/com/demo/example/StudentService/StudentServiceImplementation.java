package com.demo.example.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.Entity.Student;
import com.demo.example.StudentRepository.StudentRepository;
@Service
public class StudentServiceImplementation implements StudentService {
	@Autowired
	StudentRepository studentrepo;
	@Override
	public List<Student> fetchAllStudent() {
		List<Student>slist=studentrepo.findAll();
		return slist;
	}

}
