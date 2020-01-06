package com.fm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fm.model.FinanceOption;

@Repository
public class FinanceOptionDAOImpl implements FinanceOptionDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private String CREATE_FinanceOption_SQL = "INSERT INTO FinanceOption (id, name, startDate, endDate)VALUES (?,?,?,?)";
	private String SELECT_FinanceOption_SQL = "select id, name, startDate, endDate from FinanceOption";

	@Override
	public void createFinanceOption(FinanceOption financeOption) {

		jdbcTemplate.update(CREATE_FinanceOption_SQL, financeOption.getId(), financeOption.getName(),
				financeOption.getStartDate(), financeOption.getEndDate());

		//FinanceOption financeOptionDB = jdbcTemplate.queryForObject(CREATE_FinanceOption_SQL, FinanceOption.class);
		//return financeOptionDB;

	}

	@Override
	public List<FinanceOption> getAllFinanceOption() {
		List<FinanceOption> financeOptionList = jdbcTemplate.query(SELECT_FinanceOption_SQL, new FinanceOptionMapper());
		return financeOptionList;
	}

	@Override
	public FinanceOption getFinanceOptionById(Integer id) {
		return null;
	}

}
