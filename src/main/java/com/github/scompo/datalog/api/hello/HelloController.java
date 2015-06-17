package com.github.scompo.datalog.api.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world controller.
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	private static final Logger logger = LoggerFactory
			.getLogger(HelloController.class);

	public static final String HELLO = "hello";

	/**
	 * Says hello.
	 * 
	 * @return hello.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String hello() {

		logger.info("called hello");

		return HELLO;
	}
}
