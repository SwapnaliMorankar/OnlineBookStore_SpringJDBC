package com.springjdbc.mapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.springjdbc.tables.Mybook;

public class RowMapperBook implements RowMapper<Mybook>{

	@Override
	public Mybook mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mybook b1 = new Mybook();
		b1.setID(rs.getInt(1));
		b1.setBookName(rs.getString(2));
		b1.setGenre(rs.getString(3));
		b1.setLanguage(rs.getString(4));
		return b1;
	}

}
