package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.tables.Mybook;
import com.springjdbc.tables.Mymagazine;
import com.springjdbc.tables.Mynovel;
import com.springjdbc.tables.Mypaper;

public interface AdminDao {

	public int addbook(Mybook book);
	public int deletebook(String BookName);
	public int updatebook(Mybook book);
	public List<Mybook> displaybook();
	
	public int addnovel(Mynovel novel);
	public int deletenovel(String NovelName);
	public int updatenovel(Mynovel novel);
	public List<Mynovel> displaynovel();
	
	public int addpaper(Mypaper paper);
	public int deletepaper(String Name);
	public int updatepaper(Mypaper paper);
	public List<Mypaper> displaypaper();
	
	public int addmag(Mymagazine mag);
	public int deletemag(String Name);
	public int updatemag(Mymagazine mag);
	public List<Mymagazine> displaymag();

}
