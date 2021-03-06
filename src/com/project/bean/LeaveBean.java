package com.project.bean;

import java.util.Date;

public class LeaveBean {
	private int id;	//id
	private int sid; // 请假学员id
	private int empid; // 核准人id
	private Date sdate; // 请假开始时间
	private Date edate; // 请假结束时间
	private String reason;// 请假事由
	private String comment; // 备注
	private String photo; //假条
	private StudentBean stuBean; //一条请假记录对应一个学生
	private TeacherBean teaBean; //一条请假记录对应一个老师
	@Override
	public String toString() {
		return "LeaveBean [id=" + id + ", sid=" + sid + ", empid=" + empid
				+ ", sdate=" + sdate + ", edate=" + edate + ", reason="
				+ reason + ", comment=" + comment + ", photo=" + photo
				+ ", stuBean=" + stuBean + ", teaBean=" + teaBean + "]";
	}
	public LeaveBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaveBean(int id, int sid, int empid, Date sdate, Date edate,
			String reason, String comment, String photo, StudentBean stuBean,
			TeacherBean teaBean) {
		super();
		this.id = id;
		this.sid = sid;
		this.empid = empid;
		this.sdate = sdate;
		this.edate = edate;
		this.reason = reason;
		this.comment = comment;
		this.photo = photo;
		this.stuBean = stuBean;
		this.teaBean = teaBean;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public StudentBean getStuBean() {
		return stuBean;
	}
	public void setStuBean(StudentBean stuBean) {
		this.stuBean = stuBean;
	}
	public TeacherBean getTeaBean() {
		return teaBean;
	}
	public void setTeaBean(TeacherBean teaBean) {
		this.teaBean = teaBean;
	}
	
	
	
}
