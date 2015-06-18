package com.github.scompo.datalog.test.commons;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.transaction.Transactional;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.github.scompo.datalog.Application;

/**
 * An annotation to use during integration testing.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest
@Transactional
@TransactionConfiguration(defaultRollback = true)
public @interface TransactionalIntegrationTest {

}
