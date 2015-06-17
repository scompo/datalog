package com.github.scompo.datalog.test.hello;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;

import com.github.scompo.datalog.Application;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest
public @interface TransactionalIntegrationTest {

}
