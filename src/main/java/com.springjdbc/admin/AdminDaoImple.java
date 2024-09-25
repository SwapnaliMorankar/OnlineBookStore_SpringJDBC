package com.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.mapper.RowMapperBook;
import com.springjdbc.mapper.RowMapperMagazine;
import com.springjdbc.mapper.RowMapperNovel;
import com.springjdbc.mapper.RowMapperPaper;
import com.springjdbc.tables.Mybook;
import com.springjdbc.tables.Mymagazine;
import com.springjdbc.tables.Mynovel;
import com.springjdbc.tables.Mypaper;

public class AdminDaoImple implements AdminDao {
	
	private JdbcTemplate jdbc;

	@Override
	public int addbook(Mybook book) {
		String query = "insert into book(ID, BookName, Genre, Language) values(?,?,?,?)";
		int res = this.jdbc.update(query, book.getID(),  book.getBookName(), book.getGenre(), 
				book.getLanguage());
		return res;
	}

	@Override
	public int deletebook(String BookName) {
		String query = "delete from book where BookName = ?";
		int res = this.jdbc.update(query, BookName);
		return res;
	}

	@Override
	public int updatebook(Mybook book) {
		String query = "update book set Genre=?, Language=? where BookName=? ";
		int res = this.jdbc.update(query, book.getGenre(), book.getLanguage(), book.getBookName());
		return 0;
	}

	@Override
	public List<Mybook> displaybook() {
		String query = "select * from book";
		RowMapper<Mybook> rowmapper  = new RowMapperBook();
		List<Mybook> res = this.jdbc.query(query, rowmapper);
		return res;
	}

	@Override
	public int addnovel(Mynovel novel) {
		String query = "insert into novel(ID, NovelName, Genre, Language) values(?,?,?,?)";
		int res = this.jdbc.update(query, novel.getID(),  novel.getNovelName(), novel.getGenre(), 
				novel.getLanguage());
		return res;
	}

	@Override
	public int deletenovel(String NovelName) {
		String query = "delete from novel where NovelName = ?";
		int res = this.jdbc.update(query, NovelName);
		return res;
	}

	@Override
	public int updatenovel(Mynovel novel) {
		String query = "update novel set Genre=?, Language=? where NovelName=? ";
		int res = this.jdbc.update(query, novel.getGenre(), novel.getLanguage(), novel.getNovelName());
		return res;
	}

	@Override
	public List<Mynovel> displaynovel() {
		String query = "select * from novel";
		RowMapper<Mynovel> rowmapper  = new RowMapperNovel();
		List<Mynovel> res = this.jdbc.query(query, rowmapper);
		return res;
	}

	@Override
	public int addpaper(Mypaper paper) {
		String query = "insert into newspaper(ID, Name, Language, Type) values(?,?,?,?)";
		int res = this.jdbc.update(query, paper.getID(),  paper.getName(), paper.getLanguage()
				, paper.getType());
		return res;
	}

	@Override
	public int deletepaper(String Name) {
		String query = "delete from newspaper where Name = ?";
		int res = this.jdbc.update(query, Name);
		return res;
	}

	@Override
	public int updatepaper(Mypaper paper) {
		String query = "update newspaper set Language=?, Type = ? where BookName=? ";
		int res = this.jdbc.update(query, paper.getLanguage(),paper.getType(), paper.getName());
		return 0;
	}

	@Override
	public List<Mypaper> displaypaper() {
		String query = "select * from novel";
		RowMapper<Mypaper> rowmapper  = new RowMapperPaper();
		List<Mypaper> res = this.jdbc.query(query, rowmapper);
		return res;
	}

	@Override
	public int addmag(Mymagazine mag) {
		String query = "insert into magazine(ID, Name, Genre, Language) values(?,?,?,?)";
		int res = this.jdbc.update(query, mag.getID(),  mag.getName(), mag.getGenre(), 
				mag.getLanguage());
		return res;
	}

	@Override
	public int deletemag(String Name) {
		String query = "delete from magazine where Name = ?";
		int res = this.jdbc.update(query, Name);
		return res;
	}

	@Override
	public int updatemag(Mymagazine mag) {
		String query = "update magazine set Genre=?, Language=? where Name=? ";
		int res = this.jdbc.update(query, mag.getGenre(), mag.getLanguage(), mag.getName());
		return 0;
	}

	@Override
	public List<Mymagazine> displaymag() {
		String query = "select * from novel";
		RowMapper<Mymagazine> rowmapper  = new RowMapperMagazine();
		List<Mymagazine> res = this.jdbc.query(query, rowmapper);
		return res;
	}

	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	

}
