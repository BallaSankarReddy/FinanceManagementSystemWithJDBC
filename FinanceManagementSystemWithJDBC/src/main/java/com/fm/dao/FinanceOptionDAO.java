package com.fm.dao;

import java.util.List;

import com.fm.model.FinanceOption;

public interface FinanceOptionDAO {
	
	public void createFinanceOption(FinanceOption financeOption);
	
	public List<FinanceOption> getAllFinanceOption();
	
	public FinanceOption getFinanceOptionById(Integer id);

	/*
	 * FinanceTerms createFinanceTerms(FinanceTerms financeTerms); FinanceTerms
	 * getFinanceTermsDetails(Integer FinanceTermsId);
	 * 
	 * public FinanceOptionDTO getfinanceOptionsWithDownPaymentDetails(Integer
	 * financeOptionId); public FinanceOptionDTO
	 * getfinanceOptionsWitFinanceTerms(Integer financeOptionId,Integer
	 * FinanceTermsId);
	 * 
	 */
}
