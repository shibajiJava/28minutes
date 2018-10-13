package com.in28minutes.microservices;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.bean.ExcahngeValue;

@RestController
public class CurrencyExchangeController {

	
	
	@Autowired
	private Environment env ;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ExchangeValueRepository repository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExcahngeValue retriveExchangeValue(@PathVariable String from,@PathVariable String to)
	{
		ExcahngeValue excahngeValue = repository.findByFromAndTo(from, to);
		
		excahngeValue.setPort(Integer.valueOf(env.getProperty("local.server.port")));
		
		logger.info("{}",excahngeValue);
		
		return excahngeValue;
		
	}
}
