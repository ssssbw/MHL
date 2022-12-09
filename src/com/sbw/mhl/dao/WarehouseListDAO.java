package com.sbw.mhl.dao;


import com.sbw.mhl.pojo.WarehouseList;

import java.util.List;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 22:56
 */
public interface WarehouseListDAO {
	List<WarehouseList> getWarehouseList();
	void addWarehouseList(WarehouseList warehouseList);
	void updateMinNum(WarehouseList warehouseList);
	void delWarehouseList(WarehouseList warehouseList);
}
