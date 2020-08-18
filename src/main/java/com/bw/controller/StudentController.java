package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.Classes;
import com.bw.bean.Student;
import com.bw.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class StudentController {
	
	@Resource
	private StudentService studentService;

	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1")Integer pageNum,Model model,String sname){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sname", sname);
		
		//分页插件
		PageHelper.startPage(pageNum, 3);
		
		
		//列表查询
		List<Student> list = studentService.queryAll(map );
		
		//分页工具类   分页信息
		PageInfo<Student> page = new PageInfo<Student>(list);
		
		model.addAttribute("page", page);
		
		return "list";
	}
	@RequestMapping("queryClasses")
	@ResponseBody
	public List<Classes> queryClasses(){
		List<Classes> list = studentService.queryClasses();
		return list;
	}

	@RequestMapping("add")
	@ResponseBody
	public boolean add(Student stu){
		try {
			studentService.addStudent(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@RequestMapping("findById")
	public String findById(Integer sid,Model model){
		Student student = studentService.findById(sid);
		model.addAttribute("student", student);
		return "show";
	}
	
}
