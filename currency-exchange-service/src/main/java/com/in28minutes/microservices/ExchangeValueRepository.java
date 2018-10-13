package com.in28minutes.microservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.microservices.bean.ExcahngeValue;

public interface ExchangeValueRepository extends JpaRepository<ExcahngeValue, Long>{
	
	ExcahngeValue findByFromAndTo(String from, String to);
}
