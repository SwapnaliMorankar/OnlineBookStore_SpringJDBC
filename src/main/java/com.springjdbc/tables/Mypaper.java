package com.springjdbc.tables;

public class Mypaper {
	
	private int ID;
	private String Name;
	private String Language;
	private String Type;
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
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Mypaper(int iD, String name, String language, String type) {
		super();
		ID = iD;
		Name = name;
		Language = language;
		Type = type;
	}
	public Mypaper() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mypaper [ID=" + ID + ", Name=" + Name + ", Language=" + Language + ", Type=" + Type + "]";
	}
	
	

}
