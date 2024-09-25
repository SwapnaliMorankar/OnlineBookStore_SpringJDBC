package com.springjdbc.tables;

public class Mynovel {
	
	private int ID;
	private String NovelName;
	private String Genre;
	private String Language;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNovelName() {
		return NovelName;
	}
	public void setNovelName(String novelName) {
		NovelName = novelName;
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
	public Mynovel(int iD, String novelName, String genre, String language) {
		super();
		ID = iD;
		NovelName = novelName;
		Genre = genre;
		Language = language;
	}
	public Mynovel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mynovel [ID=" + ID + ", NovelName=" + NovelName + ", Genre=" + Genre + ", Language=" + Language + "]";
	}
	
	

}
