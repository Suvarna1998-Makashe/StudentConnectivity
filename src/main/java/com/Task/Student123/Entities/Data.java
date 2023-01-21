package com.Task.Student123.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Data")
public class Data {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="State")
	private String state;
	@Column(name="Country")
	private String country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + ", state=" + state + ", country=" + country + "]";
	}
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Data(int id, String name, String state, String country) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.country = country;
	}
	

}
