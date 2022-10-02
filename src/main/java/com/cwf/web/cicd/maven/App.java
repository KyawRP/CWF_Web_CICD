package com.cwf.web.cicd.maven;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */

public class App 
{
	static Logger log = Logger.getLogger(App.class.getName()); 
	
    public static void main( String[] args )
    {
        log.log(null, "My Message");
    }
}
