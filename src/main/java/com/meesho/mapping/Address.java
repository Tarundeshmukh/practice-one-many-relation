package com.meesho.mapping;

import javax.persistence.*;


@Entity
//adding the table
@Table(name="Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cityname;
	@ManyToOne
	@JoinColumn(name="Student_id")
	StudentInformation ob;
	Address(){}
	public Address(int id, String cityname, StudentInformation ob1) {
		this.id=id;
		this.cityname=cityname;
		this.ob=ob1;
	}
}
