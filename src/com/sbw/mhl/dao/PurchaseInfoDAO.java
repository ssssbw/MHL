package com.sbw.mhl.dao;

import com.sbw.mhl.pojo.PurchaseInfo;

import java.util.List;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 22:55
 */
public interface PurchaseInfoDAO {
	List<PurchaseInfo> getPurchaseInfoList();
	void addPurchaseInfo(PurchaseInfo purchaseInfo);
	void delPurchaseInfo(PurchaseInfo purchaseInfo);
}
