package com.bw.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.bean.Student;
import com.bw.service.StudentService;

public class MyBatisTest {
	
	
	@Test
	public void test1() throws ParseException{
		//获取容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		StudentService service = ac.getBean(StudentService.class);
		
		/*Map<String, Object> map = new HashMap<String, Object>();
		List<Student> list = service.queryAll(map );
		
		for (Student student : list) {
			System.out.println(student);
		}*/
		
		
		Student stu = new Student(null, "test", 17, 2, "女", null);
		service.addStudent(stu );
		
		
		//JDK 1.8
//		list.forEach(str -> System.out.println(str));
		
		
		
		String b = "1998-08-10";
		String l = "1998-09-10";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date b1 = sdf.parse(b);
		Date l1 = sdf.parse(l);
		
		//生日
		Calendar c1 = Calendar.getInstance();
		c1.setTime(b1);
		
		//离世
		Calendar c2 = Calendar.getInstance();
		c2.setTime(l1);
		
		
		
		int year = c1.get(Calendar.YEAR);
		int m = c1.get(Calendar.MONTH);
		int year2 = c2.get(Calendar.YEAR);
		int m2 = c2.get(Calendar.MONTH);
		
		String str = "";
		if((year2 - year ==1 && m2-m >0) || (year2 - year >1 )){
			str = (year2 - year)+"年";
		}else{
			str = (m2-m)+"月";
		}
		System.out.println(str);
		
		/*
		
		
		long time = b1.getTime();
		
		long time2 = l1.getTime();
		
		int day = (time2-time)/1000/60/60/24/;*/
		
		
	}
	
}
