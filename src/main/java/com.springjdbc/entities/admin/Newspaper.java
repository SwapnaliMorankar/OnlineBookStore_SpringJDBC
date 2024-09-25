package com.springjdbc.entities.admin;

import java.util.List;
import java.util.Scanner;

import com.springjdbc.dao.AdminDaoImple;
import com.springjdbc.dao.ReaderDaoImple;
import com.springjdbc.tables.Mybook;
import com.springjdbc.tables.Mypaper;

public class Newspaper {
	
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
	
	public void papera() {
		
		System.out.println( "What operation would you like to perform?" );
		System.out.println( "1. Read a Newspaper" );
		System.out.println( "2. Add a new Newspaper" );
		System.out.println( "3. Delete a Newspaper" );
		System.out.println( "4. Update a Newspaper" );
		System.out.println( "5. See all Newspapers" );
		System.out.println("Enter you choice: ");
		int res = sc.nextInt();
		
		switch(res) {
		
			case 1:
	    		this.paperr();
	    		break;
	    		
			case 2:
				System.out.println( "Enter the details of Paper to be added: ");
				Mypaper p1 = new Mypaper();
				System.out.println( "Enter Paper ID:  ");
				int id1 = sc.nextInt();
				p1.setID(id1);
				System.out.println( "Enter Paper Name:  ");
				sc.nextLine();
				String name1 =sc.nextLine();
				p1.setName(name1);
				System.out.println( "Enter Paper Language:  ");
				String lang1 =sc.nextLine();
				p1.setLanguage(lang1);
				System.out.println( "Enter Paper Type:  ");
				String type1 = sc.nextLine();
				p1.setType(type1);
				int output = admin.addpaper(p1);
				System.out.println( output);
				System.out.println( "Paper Added Successfully!");
	    		break;
	    		
			case 3:
				System.out.println( "Enter the Name of Paper to be deleted: ");
				sc.nextLine();
				String name2 =sc.nextLine();
				admin.deletepaper(name2);
				System.out.println( "Paper Deleted Successfully!");
	    		break;
	    		
			case 4:
				Mypaper p3 = new Mypaper();
				System.out.println( "Take a note: You can only update type and language");
				System.out.println( "Enter the Name of Paper to be updated: ");
				String name3 =sc.nextLine();
				p3.setName(name3);
				System.out.println( "Enter updated language: ");
				String lang3 =sc.nextLine();
				p3.setLanguage(lang3);
				System.out.println( "Enter updated type: ");
				String type3 =sc.nextLine();
				p3.setType(type3);
				admin.updatepaper(p3);
				System.out.println( "Paper Updated Successfully!");
	    		break;
	    		
			case 5:
				System.out.println("Details of All Books are as follows: ");
				List<Mypaper> mypaper =  admin.displaypaper();
				for(Mypaper x:mypaper) {
					System.out.println("Paper Id: " + x.getID()+ "  "+ "Paper Name: "+ x.getName()+
					"  "+ "Language: "+x.getLanguage()+ "  "+ "Type: "+ x.getType());
				}
	    		break;
	    		
			default:
	    		System.out.println( "Wrong Choice! Exiting..." );
	    		break;
		
		}
	}
	
	public void paperr() {
		
		System.out.println( "What Language Newspaper would you like to read? " );
		System.out.println( "1. English" );
		System.out.println( "2. Hindi" );
		System.out.println( "3. Marathi" );
		System.out.println( "4. Urdu" );
		System.out.println("Enter you choice: ");
		int res = sc.nextInt();
		
		switch(res) {
		
			case 1:
				System.out.println( "These are the available Newspapers in English section");
				List<Mypaper> b1 = reader.english();
				for (Mypaper x:b1) {
					System.out.println("BookName: " + x.getName() + "   " + "Language: " + x.getLanguage()+ 
							"   " +"Type: " + x.getType());
				}
	    		break;
	    		
			case 2:
				System.out.println( "These are the available Newspapers in Hindi section");
				List<Mypaper> b2 = reader.hindi();
				for (Mypaper x:b2) {
					System.out.println("BookName: " + x.getName() + "   " + "Language: " + x.getLanguage() + 
							"   " + "Type: " + x.getType());
				}
	    		break;
	    		
			case 3:
				System.out.println( "These are the available Newspapers in Marathi section");
				List<Mypaper> b3 = reader.marathi();
				for (Mypaper x:b3) {
					System.out.println("BookName: " + x.getName() + "   " + "Language: " + x.getLanguage()+ 
							"   " + "Type: " + x.getType());
				}
	    		break;
	    		
			case 4:
				System.out.println( "These are the available Newspapers in Urdu section");
				List<Mypaper> b4 = reader.urdu();
				for (Mypaper x:b4) {
					System.out.println("BookName: " + x.getName() + "   " + "Language: " + x.getLanguage()+ 
							"   " + "Type: " + x.getType());
				}
	    		break;
	    		
			default:
	    		System.out.println( "Wrong Choice! Exiting..." );
	    		break;
		
		}
	}
		

}
