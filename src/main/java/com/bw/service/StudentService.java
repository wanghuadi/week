package com.bw.service;

import java.util.*;

import com.bw.bean.Classes;
import com.bw.bean.Student;

public interface StudentService {

	//列表查询
	public List<Student> queryAll(Map<String,Object> map);

	public List<Classes> queryClasses();
	
	public void addStudent(Student stu);
	
	public Student findById(Integer sid);
}
