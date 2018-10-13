package com.in28minutes.microservices;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private Long id; 
	private String from;
	private String to; 
	private BigDecimal conversionMultiple;
	                   
	private BigDecimal quentity;
	private BigDecimal totalCalculatedAmount;
	private int port;
	
	
	public CurrencyConversionBean() {
		
	}
	
	
	
	
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quentity,
			BigDecimal totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quentity = quentity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}




	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getQuentity() {
		return quentity;
	}
	public void setQuentity(BigDecimal quentity) {
		this.quentity = quentity;
	}
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
}
