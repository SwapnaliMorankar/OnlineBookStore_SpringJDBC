package com.springjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.tables.Mymagazine;

public class RowMapperMagazine implements RowMapper<Mymagazine> {

	@Override
	public Mymagazine mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mymagazine m1 = new Mymagazine();
		m1.setID(rs.getInt(1));
		m1.setName(rs.getString(2));
		m1.setGenre(rs.getString(3));
		m1.setLanguage(rs.getString(4));
		return m1;
	}

}
