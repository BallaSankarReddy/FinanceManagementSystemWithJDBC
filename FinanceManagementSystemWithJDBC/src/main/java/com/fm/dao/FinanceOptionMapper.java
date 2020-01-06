package com.fm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.fm.model.FinanceOption;

public class FinanceOptionMapper implements RowMapper<FinanceOption>{

	@Override
	public FinanceOption mapRow(ResultSet rs, int rowNum) throws SQLException {
		FinanceOption financeOption = new FinanceOption();
		financeOption.setId(rs.getInt(1));
		financeOption.setName(rs.getString(2));
		financeOption.setStartDate(rs.getString(3));
		financeOption.setEndDate(rs.getString(3));
		return financeOption;
	}

}
