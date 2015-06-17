/**
 * 
 */
package com.github.scompo.datalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Application main class.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

	/**
	 * Main entry point.
	 * 
	 * @param args
	 *            command line arguments.
	 */
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
