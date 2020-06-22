package com.nida;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logging 
{
	
	static Logger log = Logger.getLogger(Logging.class.getName());
	
	public static void main(String[] args) {
		
        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        log.debug("Test debug");
        log.info("Test info");
    }
  }