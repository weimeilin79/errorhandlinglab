package org.blogdemo.errordemo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class RandomProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		int random = (int )(Math.random() * 100 + 1);
		
		if(random< 30){
			System.out.println("random number:["+random+"] IOExceotion");
			throw new IOException();
		}else if(random< 90){
			System.out.println("random number:["+random+"] FileNotFoundException");
			throw new FileNotFoundException();
		}else{
			System.out.println("random number:["+random+"] PASS");
		}
	}

}
