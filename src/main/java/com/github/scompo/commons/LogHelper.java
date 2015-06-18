package com.github.scompo.commons;

import org.slf4j.Logger;

public abstract class LogHelper {

	public static <T> void logReturn(Logger logger, T obj) {

		logger.debug("returning: {}", obj);
	}
}
