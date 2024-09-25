package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.tables.Mybook;
import com.springjdbc.tables.Mymagazine;
import com.springjdbc.tables.Mynovel;
import com.springjdbc.tables.Mypaper;

public interface ReaderDao {
	
	public List<Mybook> comedy();
	public List<Mybook> romantic();
	public List<Mybook> suspense();
	public List<Mybook> horror();
	
	public List<Mynovel> fiction();
	public List<Mynovel> romantic1();
	public List<Mynovel> historical();
	public List<Mynovel> fantasy();
	
	public List<Mypaper> english();
	public List<Mypaper> hindi();
	public List<Mypaper> marathi();
	public List<Mypaper> urdu();
	
	public List<Mymagazine> fashion();
	public List<Mymagazine> lifestyle();
	public List<Mymagazine> entertainment();
	public List<Mymagazine> affairs();

}
