package com.bluehorn.common;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String secretCode = "ADAAFAF444RET3RDSF";
	private String secretKey = "PROTECTED";
	
	private String title;
	private String firstName = "First name";
	private String lastName = "Last name";
	private String pwd;
	private String gender;
	private int age;
	private Date dob;
	private String city;
	private double salary;
	private String note;
	private String[] vehicles;
	private String[] pets; 
	private String language;
	private String[] food;
	
	public void secretListener(ValueChangeEvent event) {
		
		secretKey = (String)event.getComponent().getAttributes().get("secretKey");
		System.out.println("secretKey : " + secretKey);
	}
	
	public String getSecretCode() {
		return secretCode;
	}

	public void setSecretCode(String secretCode) {
		this.secretCode = secretCode;
	}
	
	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	
	public String[] getVehicles() {
		return vehicles;
	}
	
	public void setVehicles(String[] vehicles) {
		this.vehicles = vehicles;
	}

	public String getVehiclesAsString() {
		return Arrays.toString(vehicles);
	}
	
	public String[] getPets() {
		return pets;
	}

	public void setPets(String[] pets) {
		this.pets = pets;
	}

	public String[] getPetsValues() {
		
		pets = new String[5];
		pets[0] = "Cat";
		pets[1] = "Dog";
		pets[2] = "Hen";
		pets[3] = "Pig";
		pets[4] = "Parrot";
		
		return pets;
	}

	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getlanguageValue() {
		
		String[] lan = new String[4];
		lan[0] = "English";
		lan[1] = "Hindi";
		lan[2] = "Japanis";
		lan[3] = "French";
		
		return lan;
	}
	
	public String[] getFood() {
		return food;
	}

	public void setFood(String[] food) {
		this.food = food;
	}

	
	public String[] getFoodValue() {
		String[] availableFoods = new String[5];
		
		availableFoods[0] = "English";
		availableFoods[1] = "Thai";
		availableFoods[2] = "Indian";
		availableFoods[3] = "Chines";
		availableFoods[4] = "Italian";
		
		return availableFoods;
	}
	
	public String process() {

		
		String view = null;
		
		System.out.println("title : " + title);
		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		System.out.println("pwd : " + pwd);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("dob : " + dob);
		System.out.println("city : " + city);
		System.out.println("salary : " + salary);
		System.out.println("note : " + note);
		
		boolean result = true;
		
		if(result) {
			view = "welcome";
		} else {
			view = "errorpage";
		}
		
		return view;
	}
	
}