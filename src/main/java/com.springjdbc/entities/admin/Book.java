package com.springjdbc.entities.admin;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.AdminDaoImple;
import com.springjdbc.dao.ReaderDaoImple;
import com.springjdbc.tables.Mybook;

public class Book {
	
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

	public void booka() {
		
		System.out.println( "What operation would you like to perform?" );
		System.out.println( "1. Read a book" );
		System.out.println( "2. Add a new book" );
		System.out.println( "3. Delete a book" );
		System.out.println( "4. Update a book" );
		System.out.println( "5. See all books" );
		System.out.println("Enter you choice: ");
		int res = sc.nextInt();
		
		switch(res) {
		
			case 1:
	    		this.bookr();
	    		break;
	    		
			case 2:
				System.out.println( "Enter the details of book to be added: ");
				Mybook b1 = new Mybook();
				System.out.println( "Enter Book ID:  ");
				int id1 = sc.nextInt();
				b1.setID(id1);
				System.out.println( "Enter Book Name:  ");
				sc.nextLine();
				String name1 =sc.nextLine();
				b1.setBookName(name1);
				System.out.println( "Enter Book Genre:  ");
				String genre1 = sc.nextLine();
				b1.setGenre(genre1);
				System.out.println( "Enter Book Language:  ");
				String lang1 =sc.nextLine();
				b1.setLanguage(lang1);
				int output = admin.addbook(b1);
				System.out.println( output);
				System.out.println( "Book Added Successfully!");
	    		break;
	    		
			case 3:
				System.out.println( "Enter the Name of book to be deleted: ");
				sc.nextLine();
				String name2 =sc.nextLine();
				admin.deletebook(name2);
				System.out.println( "Book Deleted Successfully!");
	    		break;
	    		
			case 4:
				Mybook b3 = new Mybook();
				System.out.println( "Take a note: You can only update genre and language");
				System.out.println( "Enter the Name of book to be updated: ");
				String name3 =sc.nextLine();
				b3.setBookName(name3);
				System.out.println( "Enter updated genre: ");
				String genre3 =sc.nextLine();
				b3.setGenre(genre3);
				System.out.println( "Enter updated language: ");
				String lang3 =sc.nextLine();
				b3.setLanguage(lang3);
				admin.updatebook(b3);
				System.out.println( "Book Updated Successfully!");
	    		break;
	    		
			case 5:
				System.out.println("Details of All Books are as follows: ");
				List<Mybook> mybook =  admin.displaybook();
				for(Mybook x:mybook) {
					System.out.println("Book Id: " + x.getID()+ "  "+ "Book Name: "+ x.getBookName()+
					"  "+ "Genre: "+ x.getGenre()+ "  "+ "Language: "+x.getLanguage());
				}
	    		break;
	    		
			default:
	    		System.out.println( "Wrong Choice! Exiting..." );
	    		break;
		
		}
		
		
	}
	
		
	public void bookr() {
		
		System.out.println( "What genre of book would you like to read? " );
		System.out.println( "1. Comedy" );
		System.out.println( "2. Romantic" );
		System.out.println( "3. Suspense" );
		System.out.println( "4. Horror" );
		System.out.println("Enter you choice: ");
		int res = sc.nextInt();
		
		switch(res) {
		
		case 1:
			System.out.println( "These are the available books in Comedy section");
			List<Mybook> b1 = reader.comedy();
			for (Mybook x:b1) {
				System.out.println("BookName: " + x.getBookName() + "   " + "Language: " + x.getLanguage() + 
						"   " + "Genre: "+ x.getGenre());
			}
    		break;
    		
		case 2:
			System.out.println( "These are the available books in Romantic section");
			List<Mybook> b2 = reader.romantic();
			for (Mybook x:b2) {
				System.out.println("BookName: " + x.getBookName() + "   " + "Language: " + x.getLanguage()+ 
						"   " + "Genre: "+ x.getGenre());
			}
    		break;
    		
		case 3:
			System.out.println( "These are the available books in Suspense section");
			List<Mybook> b3 = reader.suspense();
			for (Mybook x:b3) {
				System.out.println("BookName: " + x.getBookName() + "   " + "Language: " + x.getLanguage()+ 
						"   " + "Genre: "+ x.getGenre());
			}
    		break;
    		
		case 4:
			System.out.println( "These are the available books in Horror section");
			List<Mybook> b4 = reader.horror();
			for (Mybook x:b4) {
				System.out.println("BookName: " + x.getBookName() + "   " + "Language: " + x.getLanguage()+ 
						"   " + "Genre: "+ x.getGenre());
			}
    		break;
    		
		default:
    		System.out.println( "Wrong Choice! Exiting..." );
    		break;
	
	}
		
	}

}
