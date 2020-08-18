package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.bean.Classes;
import com.bw.bean.Student;
import com.bw.mapper.StudentMapper;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Resource
	private StudentMapper studentMapper;

	public List<Student> queryAll(Map<String, Object> map) {
		return studentMapper.queryAll(map);
	}

	public List<Classes> queryClasses() {
		return studentMapper.queryClasses();
	}

	public void addStudent(Student stu) {
		studentMapper.addStudent(stu);
	}

	public Student findById(Integer sid) {
		return studentMapper.findById(sid);
	}

}
