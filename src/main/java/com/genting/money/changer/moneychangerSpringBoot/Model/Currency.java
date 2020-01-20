package com.genting.money.changer.moneychangerSpringBoot.Model;

import java.math.BigDecimal;

public  class Currency {

	private int id;
	private String name;
	private BigDecimal exchangeAmount;
	private BigDecimal exchangeRate;
	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Currency(int id, String name, BigDecimal exchangeAmount, BigDecimal exchangeRate) {
		super();
		this.id = id;
		this.name = name;
		this.exchangeAmount = exchangeAmount;
		this.exchangeRate = exchangeRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getExchangeAmount() {
		return exchangeAmount;
	}
	public void setExchangeAmount(BigDecimal exchangeAmount) {
		this.exchangeAmount = exchangeAmount;
	}
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	@Override
	public String toString() {
		return "Currency [id=" + id + ", name=" + name + ", exchangeAmount=" + exchangeAmount + ", exchangeRate="
				+ exchangeRate + "]";
	}
	
	
	
}
