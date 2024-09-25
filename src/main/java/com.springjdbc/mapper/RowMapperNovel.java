package com.springjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.tables.Mynovel;

public class RowMapperNovel implements RowMapper<Mynovel> {

	@Override
	public Mynovel mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mynovel n1 = new Mynovel();
		n1.setID(rs.getInt(1));
		n1.setNovelName(rs.getString(2));
		n1.setGenre(rs.getString(3));
		n1.setLanguage(rs.getString(4));
		return n1;
	}

}
