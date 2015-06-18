package com.github.scompo.datalog.test.hello;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.github.scompo.datalog.api.hello.HelloController;
import com.github.scompo.datalog.test.commons.TransactionalIntegrationTest;

@RunWith(SpringJUnit4ClassRunner.class)
@TransactionalIntegrationTest
public class HelloControllerTest {
	
	private RestTemplate restTemplate;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {

		restTemplate = new RestTemplate();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {

		String result = null;
		
		result = restTemplate.getForObject("http://localhost:8080/hello", String.class);
		
		assertEquals(HelloController.HELLO, result);
	}

}
