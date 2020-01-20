package com.genting.money.changer.moneychangerSpringBoot;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.genting.money.changer.moneychangerSpringBoot.Model.Currency;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MoneyChangerSpringBootApplication.class,webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestCurrency {

	
	@org.springframework.boot.web.server.LocalServerPort
	private int port;
	
	public String BaseUrl = "http://localhost:"+port;
	
	TestRestTemplate testRestTemp = new TestRestTemplate();
	HttpHeaders httpHeader = new HttpHeaders();
	
	
	@Test
	public void testAddQuestionForSurvey() {
		
		String url = BaseUrl + "/getSGDFromUSD/19000";

		System.out.println("u*******rl : "+url);
		
		TestRestTemplate restTemplate = new TestRestTemplate();

		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		Currency question = new Currency(1, "SGD",new BigDecimal(19000),null);

		HttpEntity<Currency> entity = new HttpEntity<Currency>(question, headers);

		ResponseEntity<Currency> response = restTemplate.exchange(url,
				HttpMethod.GET, entity, Currency.class);

		System.out.println("actual calling" );
		//String actual = response.getHeaders().get(HttpHeaders.LOCATION).get(0);
		System.out.println("*************************** response " + response);
		
//		assertTrue(actual.contains("/surveys/Survey1/questions/"));	
}

}
