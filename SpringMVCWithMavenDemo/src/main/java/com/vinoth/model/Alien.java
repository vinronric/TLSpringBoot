package com.vinoth.model;

public class Alien {

	private int alienId;
	private String alienName;
	private int alienAge;
	
	public int getAlienId() {
		return alienId;
	}
	public void setAlienId(int alienId) {
		this.alienId = alienId;
	}
	
	public String getAlienName() {
		return alienName;
	}
	public void setAlienName(String alienName) {
		this.alienName = alienName;
	}
	public int getAlienAge() {
		return alienAge;
	}
	public void setAlienAge(int alienAge) {
		this.alienAge = alienAge;
	}
	
	@Override
	public String toString() {
		return "Alien [alienId=" + alienId + ", alienName=" + alienName + ", alienAge=" + alienAge + "]";
	}
	
	
}
