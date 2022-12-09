package com.sbw.mhl.service;

import com.sbw.mhl.dao.FiscalExpenditureDAO;
import com.sbw.mhl.dao.impl.FiscalExpenditureDAOImpl;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class Client {
	public static <FiscalExpenditure> void showFiscalExpenditureList() throws SQLException {
		FiscalExpenditureDAO fiscalExpenditureDAO = new FiscalExpenditureDAOImpl();
		List<FiscalExpenditure> fiscalExpenditureList = (List<FiscalExpenditure>) fiscalExpenditureDAO.getFiscalExpenditureList();
		System.out.println("------------------------------------------------------");
		System.out.println("编号\t\t名称\t\t单价\t\t库存\t\t备注");
		if(fiscalExpenditureList==null || fiscalExpenditureList.size()<=0){
			System.out.println("对不起，库存为空！");
		}else{
			for (int i = 0; i < fiscalExpenditureList.size(); i++) {
				FiscalExpenditure fruit = fiscalExpenditureList.get(i);
				System.out.println(fruit);
			}
		}
		System.out.println("------------------------------------------------------");
	}

    @Test
    public  void test() throws SQLException {
	    showFiscalExpenditureList();
    }
}
