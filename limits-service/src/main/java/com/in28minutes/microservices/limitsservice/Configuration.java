package com.in28minutes.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {

	private int minimum;
	private int maxium;
	
	
	
	
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaxium() {
		return maxium;
	}
	public void setMaxium(int maxium) {
		this.maxium = maxium;
	}
	
	
	
}
