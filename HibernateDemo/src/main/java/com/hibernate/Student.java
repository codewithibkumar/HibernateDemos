package com.hibernate;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//annotation
@Entity
@Table(name="StudentRecord")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int roll;
  @Column(name="studentName")
  private String name;
  //@Temporal(TemporalType.DATE)
  private LocalDate dob;
  //@Transient
  private int age;
  @Column(name="contacts")
  private long mobile;
  
public Student(int roll, String name, LocalDate dob, int age, long mobile) {
	super();
	this.roll = roll;
	this.name = name;
	this.dob = dob;
	this.age = age;
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", dob=" + dob + ", age=" + age + ", mobile=" + mobile + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public int getAge() {
	return Period.between(getDob(), LocalDate.now()).getYears();
}
public void setAge(int age) {
	this.age = age;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
  
  
}
