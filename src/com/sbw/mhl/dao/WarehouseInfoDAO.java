package com.sbw.mhl.dao;

import com.sbw.mhl.pojo.WarehouseInfo;

import java.util.List;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 22:56
 */
public interface WarehouseInfoDAO {
	List<WarehouseInfo> getWarehouseInfo();
	void addWarehouseInfo(WarehouseInfo warehouseInfo);
	void updateWarehouseInfo(WarehouseInfo warehouseInfo);
	void delWarehouseInfo(WarehouseInfo warehouseInfo);
}
