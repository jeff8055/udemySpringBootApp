package com.example.usp;

public class Course {
	
	private long id;
	private String name;
	private String authour;
	
	public Course(long id, String name, String authour) {
		super();
		this.id = id;
		this.name = name;
		this.authour = authour;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", authour=" + authour + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthour() {
		return authour;
	}

	public void setAuthour(String authour) {
		this.authour = authour;
	}

}
