package com.springjdbc.entities;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.entities.admin.Book;
import com.springjdbc.entities.admin.Magazine;
import com.springjdbc.entities.admin.Newspaper;
import com.springjdbc.entities.admin.Novel;

public class Admin {
	
	private Book b1;
	private Novel n1;
	private Newspaper p1;
	private Magazine m1;
	

	public Book getB1() {
		return b1;
	}


	public void setB1(Book b1) {
		this.b1 = b1;
	}


	public Novel getN1() {
		return n1;
	}


	public void setN1(Novel n1) {
		this.n1 = n1;
	}


	public Newspaper getP1() {
		return p1;
	}


	public void setP1(Newspaper p1) {
		this.p1 = p1;
	}


	public Magazine getM1() {
		return m1;
	}


	public void setM1(Magazine m1) {
		this.m1 = m1;
	}


	public void admin() {
		
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Which section would you like to enter?");
		System.out.println("1. Books");
		System.out.println("2. Novels");
		System.out.println("3. Newspaper");
		System.out.println("4. Magazine");
		System.out.println("Enter you choice: ");
		int ch = sc.nextInt();
		
		switch(ch) {
		
			case 1:
				System.out.println( "Entering into Books Section ");
	    		b1.booka();
	    		break;
	    		
			case 2:
				System.out.println( "Entering into Novels Section ");
	    		n1.novela();
	    		break;
	    		
			case 3:
				System.out.println( "Entering into Newspaper Section ");
	    		p1.papera();
	    		break;
	    		
			case 4:
				System.out.println( "Entering into Magazines Section ");
	    		m1.magazinea();
	    		break;
	    		
			default:
	    		System.out.println( "Wrong Choice! Exiting..." );
	    		break;
		}
		
	}
}

