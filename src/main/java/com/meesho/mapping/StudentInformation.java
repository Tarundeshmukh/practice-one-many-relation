package com.meesho.mapping;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Student")
public class StudentInformation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollno;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Address> ob;
	public int getRollno() {return rollno;}
	public StudentInformation() {}
	public StudentInformation(int rollno, String name) {
		this.name=name;
		this.rollno=rollno;
	}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
}
