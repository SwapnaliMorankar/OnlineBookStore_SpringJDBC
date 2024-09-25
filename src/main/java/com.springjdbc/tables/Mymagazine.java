package com.springjdbc.tables;

public class Mymagazine {
	
	private int ID;
	private String Name;
	private String Genre;
	private String Language;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
	public Mymagazine(int iD, String name, String genre, String language) {
		super();
		ID = iD;
		Name = name;
		Genre = genre;
		Language = language;
	}
	public Mymagazine() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mymagazine [ID=" + ID + ", Name=" + Name + ", Genre=" + Genre + ", Language=" + Language + "]";
	}
	
	

}
