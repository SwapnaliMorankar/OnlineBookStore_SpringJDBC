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

public class ReaderDaoImple implements ReaderDao{

	private JdbcTemplate jdbctemplate;

	@Override
	public List<Mybook> comedy() {
		String query = "Select * from book where genre='comedy'";
		RowMapper<Mybook> rowmapper  = new RowMapperBook();
		List<Mybook> book1 = this.jdbctemplate.query(query, rowmapper);
		return book1;
	}

	@Override
	public List<Mybook> romantic() {
		String query = "Select * from book where genre='romantic'";
		RowMapper<Mybook> rowmapper  = new RowMapperBook();
		List<Mybook> book2 = this.jdbctemplate.query(query, rowmapper);
		return book2;
		
	}

	@Override
	public List<Mybook> suspense() {
		String query = "Select * from book where genre='suspense'";
		RowMapper<Mybook> rowmapper  = new RowMapperBook();
		List<Mybook> book3 = this.jdbctemplate.query(query, rowmapper);
		return book3;
		
	}

	@Override
	public List<Mybook> horror() {
		String query = "Select * from book where genre='horror'";
		RowMapper<Mybook> rowmapper  = new RowMapperBook();
		List<Mybook> book4 = this.jdbctemplate.query(query, rowmapper);
		return book4;
		
	}

	@Override
	public List<Mynovel> fiction() {
		String query = "Select * from novel where genre='fiction'";
		RowMapper<Mynovel> rowmapper  = new RowMapperNovel();
		List<Mynovel> novel1 = this.jdbctemplate.query(query, rowmapper);
		return novel1;
	}

	@Override
	public List<Mynovel> romantic1() {
		String query = "Select * from novel where genre='romantic'";
		RowMapper<Mynovel> rowmapper  = new RowMapperNovel();
		List<Mynovel> novel2 = this.jdbctemplate.query(query, rowmapper);
		return novel2;
	}

	@Override
	public List<Mynovel> historical() {
		String query = "Select * from novel where genre='historical'";
		RowMapper<Mynovel> rowmapper  = new RowMapperNovel();
		List<Mynovel> novel3 = this.jdbctemplate.query(query, rowmapper);
		return novel3;
	}

	@Override
	public List<Mynovel> fantasy() {
		String query = "Select * from novel where genre='fantasy'";
		RowMapper<Mynovel> rowmapper  = new RowMapperNovel();
		List<Mynovel> novel4 = this.jdbctemplate.query(query, rowmapper);
		return novel4;
	}

	@Override
	public List<Mypaper> english() {
		String query = "Select * from newspaper where language='english'";
		RowMapper<Mypaper> rowmapper  = new RowMapperPaper();
		List<Mypaper> paper1 = this.jdbctemplate.query(query, rowmapper);
		return paper1;
	}

	@Override
	public List<Mypaper> hindi() {
		String query = "Select * from newspaper where language='hindi'";
		RowMapper<Mypaper> rowmapper  = new RowMapperPaper();
		List<Mypaper> paper2 = this.jdbctemplate.query(query, rowmapper);
		return paper2;
	}

	@Override
	public List<Mypaper> marathi() {
		String query = "Select * from newspaper where language='marathi'";
		RowMapper<Mypaper> rowmapper  = new RowMapperPaper();
		List<Mypaper> paper3 = this.jdbctemplate.query(query, rowmapper);
		return paper3;
	}

	@Override
	public List<Mypaper> urdu() {
		String query = "Select * from newspaper where language='urdu'";
		RowMapper<Mypaper> rowmapper  = new RowMapperPaper();
		List<Mypaper> paper4 = this.jdbctemplate.query(query, rowmapper);
		return paper4;
	}

	@Override
	public List<Mymagazine> fashion() {
		String query = "Select * from magazine where genre='fashion'";
		RowMapper<Mymagazine> rowmapper  = new RowMapperMagazine();
		List<Mymagazine> mag1 = this.jdbctemplate.query(query, rowmapper);
		return mag1;
	}

	@Override
	public List<Mymagazine> lifestyle() {
		String query = "Select * from magazine where genre='lifestyle'";
		RowMapper<Mymagazine> rowmapper  = new RowMapperMagazine();
		List<Mymagazine> mag2 = this.jdbctemplate.query(query, rowmapper);
		return mag2;
	}

	@Override
	public List<Mymagazine> entertainment() {
		String query = "Select * from magazine where genre='entertainment'";
		RowMapper<Mymagazine> rowmapper  = new RowMapperMagazine();
		List<Mymagazine> mag4 = this.jdbctemplate.query(query, rowmapper);
		return mag4;
	}

	@Override
	public List<Mymagazine> affairs() {
		String query = "Select * from magazine where genre='current affairs'";
		RowMapper<Mymagazine> rowmapper  = new RowMapperMagazine();
		List<Mymagazine> mag1 = this.jdbctemplate.query(query, rowmapper);
		return mag1;	}
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		System.out.println("JdbcTemplate injected: " + (jdbctemplate != null));
		this.jdbctemplate = jdbctemplate;
	}

	

}
