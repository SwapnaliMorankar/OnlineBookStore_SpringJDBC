package com.springjdbc.entities.admin;

import java.util.List;
import java.util.Scanner;

import com.springjdbc.dao.AdminDaoImple;
import com.springjdbc.dao.ReaderDaoImple;
import com.springjdbc.tables.Mybook;
import com.springjdbc.tables.Mynovel;

public class Novel {
	
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
	
	public void novela() {
	
		
		System.out.println( "What operation would you like to perform?" );
		System.out.println( "1. Read a Novel" );
		System.out.println( "2. Add a new Novel" );
		System.out.println( "3. Delete a Novel" );
		System.out.println( "4. Update a Novel" );
		System.out.println( "5. See all Novels" );
		System.out.println("Enter you choice: ");
		int res = sc.nextInt();
		
		switch(res) {
		
			case 1:
	    		this.novelr();
	    		break;
	    		
			case 2:
				System.out.println( "Enter the details of novel to be added: ");
				Mynovel n1 = new Mynovel();
				System.out.println( "Enter Novel ID:  ");
				int id1 = sc.nextInt();
				n1.setID(id1);
				System.out.println( "Enter Novel Name:  ");
				sc.nextLine();
				String name1 =sc.nextLine();
				n1.setNovelName(name1);
				System.out.println( "Enter Novel Genre:  ");
				String genre1 = sc.nextLine();
				n1.setGenre(genre1);
				System.out.println( "Enter Novel Language:  ");
				String lang1 =sc.nextLine();
				n1.setLanguage(lang1);
				int output = admin.addnovel(n1);
				System.out.println( "Novel Added Successfully!");
	    		break;
	    		
			case 3:
				System.out.println( "Enter the Name of Novel to be deleted: ");
				sc.nextLine();
				String name2 =sc.nextLine();
				admin.deletenovel(name2);
				System.out.println( "Novel Deleted Successfully!");
	    		break;
	    		
			case 4:
				Mynovel n3 = new Mynovel();
				System.out.println( "Take a note: You can only update genre and language");
				System.out.println( "Enter the Name of Novel to be updated: ");
				String name3 =sc.nextLine();
				n3.setNovelName(name3);
				System.out.println( "Enter updated genre: ");
				String genre3 =sc.nextLine();
				n3.setGenre(genre3);
				System.out.println( "Enter updated language: ");
				String lang3 =sc.nextLine();
				n3.setLanguage(lang3);
				admin.updatenovel(n3);
				System.out.println( "Novel Updated Successfully!");
	    		break;
	    		
			case 5:
				System.out.println("Details of All Novel are as follows: ");
				List<Mynovel> mynovel =  admin.displaynovel();
				for(Mynovel x:mynovel) {
					System.out.println("Novel Id: " + x.getID()+ "  "+ "Novel Name: "+ x.getNovelName()+
					"  "+ "Genre: "+ x.getGenre()+ "  "+ "Language: "+x.getLanguage());
				}
	    		break;
	    		
			default:
	    		System.out.println( "Wrong Choice! Exiting..." );
	    		break;
		
		}
	
	}
	
	public void novelr() {
		
		System.out.println( "What genre of novel would you like to read? " );
		System.out.println( "1. Fiction" );
		System.out.println( "2. Romantic" );
		System.out.println( "3. Historical" );
		System.out.println( "4. Fantasy" );
		System.out.println("Enter you choice: ");
		int res = sc.nextInt();
		
		switch(res) {
		
			case 1:
				System.out.println( "These are the available novels in Fiction section");
				List<Mynovel> b1 = reader.fiction();
				for (Mynovel x:b1) {
					System.out.println("BookName: " + x.getNovelName() + "   " + "Language: " + x.getLanguage() +
							"   " + "Genre" + x.getGenre());
				}
	    		break;
	    		
			case 2:
				System.out.println( "These are the available novels in Romantic section");
				List<Mynovel> b2 = reader.romantic1();
				for (Mynovel x:b2) {
					System.out.println("BookName: " + x.getNovelName() + "   " + "Language: " + x.getLanguage()+
							"   " + "Genre" + x.getGenre());
				}
	    		break;
	    		
			case 3:
				System.out.println( "These are the available novels in Historical section");
				List<Mynovel> b3 = reader.historical();
				for (Mynovel x:b3) {
					System.out.println("BookName: " + x.getNovelName() + "   " + "Language: " + x.getLanguage()+
							"   " + "Genre" + x.getGenre());
				}
	    		break;
	    		
			case 4:
				System.out.println( "These are the available novels in Fantasy section");
				List<Mynovel> b4 = reader.fantasy();
				for (Mynovel x:b4) {
					System.out.println("BookName: " + x.getNovelName() + "   " + "Language: " + x.getLanguage() +
							"   " + "Genre" + x.getGenre());
				}
	    		break;
	    		
			default:
	    		System.out.println( "Wrong Choice! Exiting..." );
	    		break;
		
		}

		}

}
