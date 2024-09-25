package com.springjdbc.tables;

public class Mybook {
	
	private int ID;
	private String BookName;
	private String Genre;
	private String Language;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public Mybook(int iD, String bookName, String genre, String language) {
		super();
		ID = iD;
		BookName = bookName;
		Genre = genre;
		Language = language;
	}
	public Mybook() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mybook [ID=" + ID + ", BookName=" + BookName + ", Genre=" + Genre + ", Language=" + Language + "]";
	}
	
	

}
