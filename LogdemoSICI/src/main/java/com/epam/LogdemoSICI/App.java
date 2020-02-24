package com.epam.LogdemoSICI;

import java.util.Scanner;

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
    	@SuppressWarnings("resource")
		Scanner sc = new  Scanner(System.in);
    	Double PrincipalAmount;
    	Double Time;
    	Double Rate;
    	LOGGER.info("Enter PrincipalAmount\n");
    	PrincipalAmount=sc.nextDouble();
    	LOGGER.info("Enter Time\n");
    	Time=sc.nextDouble();
        LOGGER.info("Enter Rate\n");
    	Rate=sc.nextDouble();
    	Double SimpleInterest;
    	SimpleInterest=((PrincipalAmount*Time*Rate)/100);
        LOGGER.info("Simple Interest is "+SimpleInterest);
    	LOGGER.info("\n");
    	Double CompoundInterest;
    	CompoundInterest=PrincipalAmount*(Math.pow((1+Rate/100),Time));
    	LOGGER.info("CompoundInterst is "+CompoundInterest);
    	System.exit(0);
    	}
    }

