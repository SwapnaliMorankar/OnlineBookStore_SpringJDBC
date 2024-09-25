package com.springjdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.entities.Admin;
import com.springjdbc.entities.Reader;

public class User {
	
	private Admin ad;
	private Reader rd;
	
	public Admin getAd() {
		return ad;
	}
	public void setAd(Admin ad) {
		this.ad = ad;
	}
	public Reader getRd() {
		return rd;
	}
	public void setRd(Reader rd) {
		this.rd = rd;
	}
	
	
	Scanner sc = new Scanner(System.in);
	
	
	public void user() {
		
		System.out.println( "Before Moving ahead please let us know who you are? " );
	    System.out.println( "1. Admin!" );
	    System.out.println( "2. Reader!" );
	    int output = sc.nextInt();
	    
		    switch(output) {
		    	
		    	case 1:
		    		System.out.println( "Entering into Admin Section " );
		    		ad.admin();
		    		break;
		    		
		    	case 2:
		    		System.out.println( "Entering into Reader Section " );
		    		rd.reader();
		    		break;
		    		
		    	default:
		    		System.out.println( "Wrong Choice! Exiting..." );
		    		break;
		    }
	}
}
