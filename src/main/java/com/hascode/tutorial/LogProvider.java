package com.hascode.tutorial;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LogProvider {
	@Produces
	public Logger createLogger(InjectionPoint ip) {
		return Logger.getLogger(ip.getClass().getName());
	}
}
