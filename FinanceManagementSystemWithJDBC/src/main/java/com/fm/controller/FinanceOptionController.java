package com.fm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fm.dao.FinanceOptionDAOImpl;
import com.fm.model.FinanceOption;

@RestController
@RequestMapping(path = "/finance-option")
public class FinanceOptionController {

	@Autowired
	private FinanceOptionDAOImpl financeOptionDAOImpl;
	public String check() {
		return "Welcome to Spingboot with JDBC";
	}
	@GetMapping("/getAllfinanceOptions")
	public List<FinanceOption> getAllFinanceOption(){
		List<FinanceOption> financeOptionsList =financeOptionDAOImpl.getAllFinanceOption();
		return financeOptionsList;
	}
	@PostMapping("/create/financeOptions")
	public void createFinanceOption(@RequestBody FinanceOption financeOption){
		financeOptionDAOImpl.createFinanceOption(financeOption);
		//return financeOptionsList;
	}
	
}
