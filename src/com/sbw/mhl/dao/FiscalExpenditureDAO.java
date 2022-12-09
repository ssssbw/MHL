package com.sbw.mhl.dao;

import com.sbw.mhl.pojo.FiscalExpenditure;

import java.sql.SQLException;
import java.util.List;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 11:04
 */
public interface FiscalExpenditureDAO {
	List<FiscalExpenditure> getFiscalExpenditureList() throws SQLException;
	void callCalculateMonthPurchaseExpenditure(String month);
	void callCallCalculateMonthPurchaseExpenditure();
}
