package com.springjdbc.entities.admin;

import java.util.List;
import java.util.Scanner;

import com.springjdbc.dao.AdminDaoImple;
import com.springjdbc.dao.ReaderDaoImple;
import com.springjdbc.tables.Mybook;
import com.springjdbc.tables.Mymagazine;


public class Magazine {
	
	private ReaderDaoImple reader;
	private AdminDaoImple admin;
	
	public AdminDaoImple getAdmin() {
		return admin;
	}


	public void setAdmin(AdminDaoImple admin) {
		this.admin = admin;
	}
	
	public ReaderDaoImple getReader() {
		return reader;
	}

	public void setReader(ReaderDaoImple reader) {
		this.reader = reader;
	}

	Scanner sc  = new Scanner(System.in);
	
	public void magazinea() {
		
		System.out.println( "What operation would you like to perform?" );
		System.out.println( "1. Read a Magazine" );
		System.out.println( "2. Add a new Magazine" );
		System.out.println( "3. Delete a Magazine" );
		System.out.println( "4. Update a Magazine" );
		System.out.println( "5. See all Magazines" );
		System.out.println("Enter you choice: ");
		int res = sc.nextInt();
		
		switch(res) {
		
			case 1:
	    		this.magaziner();
	    		break;
	    		
			case 2:
				System.out.println( "Enter the details of Magazine to be added: ");
				Mymagazine m1 = new Mymagazine();
				System.out.println( "Enter Magazine ID:  ");
				int id1 = sc.nextInt();
				m1.setID(id1);
				System.out.println( "Enter Magazine Name:  ");
				sc.nextLine();
				String name1 =sc.nextLine();
				m1.setName(name1);
				System.out.println( "Enter Magazine Genre:  ");
				String genre1 = sc.nextLine();
				m1.setGenre(genre1);
				System.out.println( "Enter Magazine Language:  ");
				String lang1 =sc.nextLine();
				m1.setLanguage(lang1);
				int output = admin.addmag(m1);
				System.out.println( output);
				System.out.println( "Magazine Added Successfully!");
	    		break;
	    		
			case 3:
				System.out.println( "Enter the Name of Magazine to be deleted: ");
				sc.nextLine();
				String name2 =sc.nextLine();
				admin.deletemag(name2);
				System.out.println( "Magazine Deleted Successfully!");
	    		break;
	    		
			case 4:
				Mymagazine m3 = new Mymagazine();
				System.out.println( "Take a note: You can only update genre and language");
				System.out.println( "Enter the Name of Magazine to be updated: ");
				String name3 =sc.nextLine();
				m3.setName(name3);
				System.out.println( "Enter updated genre: ");
				String genre3 =sc.nextLine();
				m3.setGenre(genre3);
				System.out.println( "Enter updated language: ");
				String lang3 =sc.nextLine();
				m3.setLanguage(lang3);
				admin.updatemag(m3);
				System.out.println( "Magazine Updated Successfully!");
	    		break;
	    		
			case 5:
				System.out.println("Details of All Magazines are as follows: ");
				List<Mymagazine> mymagazine =  admin.displaymag();
				for(Mymagazine x:mymagazine) {
					System.out.println("Magazine Id: " + x.getID()+ "  "+ "Magazine Name: "+ x.getName()+
					"  "+ "Genre: "+ x.getGenre()+ "  "+ "Language: "+x.getLanguage());
				}
	    		break;
	    		
			default:
	    		System.out.println( "Wrong Choice! Exiting..." );
	    		break;
		
		}
	}
	
	public void magaziner() {
		
		System.out.println( "What genre of magazine would you like to read? " );
		System.out.println( "1. Fashion" );
		System.out.println( "2. Lifestyle" );
		System.out.println( "3. Entertainment" );
		System.out.println( "4. Current Affairs" );
		System.out.println("Enter you choice: ");
		int res = sc.nextInt();
		
		switch(res) {
		
			case 1:
				System.out.println( "These are the available magazines in Fashion section");
				List<Mymagazine> b1 = reader.fashion();
				for (Mymagazine x:b1) {
					System.out.println("BookName: " + x.getName() + "   " + "Language: " + x.getLanguage() + 
							"   " + "Genre" + x.getGenre());
				}
	    		break;
	    		
			case 2:
				System.out.println( "These are the available magazines in Lifestyle section");
				List<Mymagazine> b2 = reader.lifestyle();
				for (Mymagazine x:b2) {
					System.out.println("BookName: " + x.getName() + "   " + "Language: " + x.getLanguage()+ 
							"   " + "Genre" + x.getGenre());
				}
	    		break;
	    		
			case 3:
				System.out.println( "These are the available magazines in Entertainment section");
				List<Mymagazine> b3 = reader.entertainment();
				for (Mymagazine x:b3) {
					System.out.println("BookName: " + x.getName() + "   " + "Language: " + x.getLanguage()+ 
							"   " + "Genre" + x.getGenre());
				}
	    		break;
	    		
			case 4:
				System.out.println( "These are the available magazines in Current Affairs section");
				List<Mymagazine> b4 = reader.affairs();
				for (Mymagazine x:b4) {
					System.out.println("BookName: " + x.getName() + "   " + "Language: " + x.getLanguage()+ 
							"   " + "Genre" + x.getGenre());
				}
	    		break;
	    		
			default:
	    		System.out.println( "Wrong Choice! Exiting..." );
	    		break;
		
		}
	}

}
