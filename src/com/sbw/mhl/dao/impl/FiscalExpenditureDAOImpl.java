package com.sbw.mhl.dao.impl;

import com.sbw.mhl.dao.FiscalExpenditureDAO;
import com.sbw.mhl.pojo.FiscalExpenditure;
import com.sbw.myssm.basedao.BaseDAO;

import java.sql.SQLException;
import java.util.List;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 11:05
 */
public class FiscalExpenditureDAOImpl extends BaseDAO<FiscalExpenditure> implements FiscalExpenditureDAO {
	@Override
	public List<FiscalExpenditure> getFiscalExpenditureList() throws SQLException {
		return super.executeQuery("select * from fiscal_expenditure");
	}

	@Override
	public void callCalculateMonthPurchaseExpenditure(String month) {
	}

	@Override
	public void callCallCalculateMonthPurchaseExpenditure() {

	}
}
