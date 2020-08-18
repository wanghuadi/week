package com.bw.bean;

public class Student {
	private Integer sid;//	学号
	private String sname;//	姓名
	private Integer age;//	年龄
	private Integer cid;//	外键班级id
	private String gender;//	性别
	
	//临时字段
	private String cname;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Student(Integer sid, String sname, Integer age, Integer cid, String gender, String cname) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.cid = cid;
		this.gender = gender;
		this.cname = cname;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", cid=" + cid + ", gender=" + gender
				+ ", cname=" + cname + "]";
	}
	
	
}
