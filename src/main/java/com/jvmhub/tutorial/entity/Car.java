package com.jvmhub.tutorial.entity;
 
import java.io.Serializable;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="tupps.cars")
public class Car implements Serializable {
 
	public Car() {
 
	};
 
	public Car(String name) {
		this.name = name;
 
	};
 
	@Id
	private int code;
 
	private String name;
 
	public int getCode() {
		return code;
	}
 
	public void setCode(int code) {
		this.code = code;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
}