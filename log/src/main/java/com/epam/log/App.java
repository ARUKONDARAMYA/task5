package com.epam.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
      LOGGER.debug("hai");
      LOGGER.info("HELLO World"); 
      LOGGER.warn("HELLO World"); 
      LOGGER.error("HELLO World"); 
      LOGGER.fatal("HELLO Worlhdd"); 
    }
}
