package com.in28minutes.microservices.limitsservice.bean;

public class LimitConfiguration {
	private int maximum;

	private int minium;
	
	public LimitConfiguration() {
		
	}
	
	
	public LimitConfiguration(int maximum, int minium) {
		super();
		this.maximum = maximum;
		this.minium = minium;
	}
	
	
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinium() {
		return minium;
	}
	public void setMinium(int minium) {
		this.minium = minium;
	} 

	
	
}
