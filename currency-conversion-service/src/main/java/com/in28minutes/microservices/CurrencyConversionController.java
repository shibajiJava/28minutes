package com.in28minutes.microservices;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExcangeServiceProxy proxy;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quentity/{quentity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quentity)
	{
		
		Map<String,String> uriVariable = new HashMap<>();
		uriVariable.put("from", from);
		uriVariable.put("to", to);
		
		ResponseEntity<CurrencyConversionBean> responseEntity = 
		new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,uriVariable);
		
		CurrencyConversionBean response = responseEntity.getBody();
		
		System.out.println("======================================");
		System.out.println("======================================"+response.getConversionMultiple());
		System.out.println("======================================"+quentity);
		System.out.println("======================================");
		
		BigDecimal totValue  = quentity.multiply(response.getConversionMultiple());
		logger.info("{}",response);
		return new CurrencyConversionBean(100L,from,to,response.getConversionMultiple(),quentity,totValue,response.getPort());
				
	}
	
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quentity/{quentity}")
	public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quentity)
	{
		
		CurrencyConversionBean response = proxy.retriveExchangeValue(from, to);
		
		System.out.println("======================================");
		System.out.println("======================================"+response.getConversionMultiple());
		System.out.println("======================================"+quentity);
		System.out.println("======================================");
		
		BigDecimal totValue  = quentity.multiply(response.getConversionMultiple());
		logger.info("{}",response);
		return new CurrencyConversionBean(100L,from,to,response.getConversionMultiple(),quentity,totValue,response.getPort());
				
	}

}
