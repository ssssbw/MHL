package com.sbw.mhl.dao.impl;

import com.sbw.mhl.dao.PurchaseInfoDAO;
import com.sbw.mhl.pojo.PurchaseInfo;
import com.sbw.myssm.basedao.BaseDAO;

import java.util.List;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 23:05
 */
public class PurchaseInfoDAOImpl extends BaseDAO<PurchaseInfo> implements PurchaseInfoDAO {

	@Override
	public List<PurchaseInfo> getPurchaseInfoList() {
		return executeQuery("select * from purchase_info");
	}

	@Override
	public void addPurchaseInfo(PurchaseInfo purchaseInfo) {
		String sql = "insert into purchase_info values(?,?,?,?,?,?,?,?,?,?)";
		executeUpdate(sql, purchaseInfo.getPurchase_id(), purchaseInfo.getPurchase_date(), purchaseInfo.getProduct_name(),
				purchaseInfo.getModel(), purchaseInfo.getUnit(), purchaseInfo.getPurchase_price(), purchaseInfo.getPurchase_num(),
				purchaseInfo.getPurchase_amount(), purchaseInfo.getRecoder_id(), purchaseInfo.getBill_comment());
	}

	@Override
	public void delPurchaseInfo(PurchaseInfo purchaseInfo) {
		executeUpdate("delete from purchase_info where purchase_id=?", purchaseInfo.getPurchase_id());
	}
}
