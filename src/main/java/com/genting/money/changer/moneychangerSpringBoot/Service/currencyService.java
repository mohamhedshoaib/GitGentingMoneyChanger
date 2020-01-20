package com.genting.money.changer.moneychangerSpringBoot.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.genting.money.changer.moneychangerSpringBoot.Model.Currency;


@Component
public class currencyService {
	
	
	private static List<Currency> currencies = new ArrayList<>();
	
	static {
		Currency question1 = new Currency(1,"SGDtoUSD", new BigDecimal(0.742164), null);
		Currency question2 = new Currency(2,"USDtoSGD", new BigDecimal(1.34782), null);

		List<Currency> questions = new ArrayList<>(Arrays.asList(question1,
				question2));
	}

	
	
	public Currency retrieveExchnageAmt(BigDecimal userAmt) {
		
		System.out.println("here in service ");

		BigDecimal sgdToUsdVal = new BigDecimal(0.742164); 
		
		BigDecimal retVal = userAmt.multiply(sgdToUsdVal);
		System.out.println("retval is "+retVal);
		retVal= retVal.setScale(2,BigDecimal.ROUND_UP);
		System.out.println("retval is roundede "+retVal);
		Currency currency = new Currency();
		
		try {
			
			
			currency.setId(1);
			currency.setName("SgdToUSD");
			currency.setExchangeRate(sgdToUsdVal);
			currency.setExchangeAmount(retVal);
			
		} catch(Exception e){
			
			System.out.println("here in EXCEPTION ");
		}

		return currency;

	}
}
