package com.sbw.mhl.dao.impl;

import com.sbw.mhl.dao.WarehouseInfoDAO;
import com.sbw.mhl.pojo.WarehouseInfo;
import com.sbw.myssm.basedao.BaseDAO;

import java.util.List;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 23:01
 */
public class WarehouseInfoDAOImpl extends BaseDAO<WarehouseInfo> implements WarehouseInfoDAO {
	@Override
	public List<WarehouseInfo> getWarehouseInfo() {
		return executeQuery("select * from warehouse_info");
	}

	@Override
	public void addWarehouseInfo(WarehouseInfo warehouseInfo) {
		executeUpdate("insert into warehouse_info values(?,?,?)",warehouseInfo.getWarehouse_id(),warehouseInfo.getWarehouse_name(),warehouseInfo.getWarehouse_location());
	}

	@Override
	public void updateWarehouseInfo(WarehouseInfo warehouseInfo) {
		executeUpdate("update warehouse_info set Warehouse_name=?,Warehouse_location=? where Warehouse_id=?",warehouseInfo.getWarehouse_name(), warehouseInfo.getWarehouse_location(), warehouseInfo.getWarehouse_id());
	}

	@Override
	public void delWarehouseInfo(WarehouseInfo warehouseInfo) {
		executeUpdate("delete from warehouse_info where warehouse_id=?", warehouseInfo.getWarehouse_id());
	}
}
