package com.springjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.tables.Mypaper;

public class RowMapperPaper implements RowMapper<Mypaper>{

	@Override
	public Mypaper mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mypaper p1 = new Mypaper();
		p1.setID(rs.getInt(1));
		p1.setName(rs.getString(2));
		p1.setLanguage(rs.getString(3));
		p1.setType(rs.getString(4));
		return p1;
	}

}
