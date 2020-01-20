package com.genting.money.changer.moneychangerSpringBoot.Controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genting.money.changer.moneychangerSpringBoot.Model.Currency;
import com.genting.money.changer.moneychangerSpringBoot.Service.currencyService;

@RestController
public class CurrencyController {
	
	@Autowired
	private currencyService curServ;
	
	@GetMapping(path= "/getSGDFromUSD/{SgdAmt}")
	public Currency getSGDFromUSD(@PathVariable String SgdAmt){
		
		System.out.println("***************** in get sgd from usd");
		BigDecimal userAmt = new BigDecimal(SgdAmt);
		
		
		return curServ.retrieveExchnageAmt(userAmt);
		 
	}

}
