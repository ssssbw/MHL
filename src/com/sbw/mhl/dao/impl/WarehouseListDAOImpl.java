package com.sbw.mhl.dao.impl;

import com.sbw.mhl.dao.WarehouseListDAO;
import com.sbw.mhl.pojo.WarehouseList;
import com.sbw.myssm.basedao.BaseDAO;

import java.util.List;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 23:02
 */
public class WarehouseListDAOImpl extends BaseDAO<WarehouseList> implements WarehouseListDAO {
	@Override
	public List<WarehouseList> getWarehouseList() {
		return executeQuery("select * from warehouse_list");
	}

	@Override
	public void addWarehouseList(WarehouseList warehouseList) {
		String sql = "insert into warehouse_info values(?,?,?,?,?,?,?,?)";
		executeUpdate(sql, warehouseList.getProduct_id(), warehouseList.getPurchase_id(), warehouseList.getProduct_name(),
				warehouseList.getWarehouse_location(), warehouseList.getIn_date(), warehouseList.getIn_num(),
				warehouseList.getRemain_num(), warehouseList.getMin_num());
	}

	@Override
	public void updateMinNum(WarehouseList warehouseList) {
		String sql = "update warehouse_info set Min_num=?, where Product_id=?";
		executeUpdate(sql,warehouseList.getMin_num(),warehouseList.getProduct_id());
	}

	@Override
	public void delWarehouseList(WarehouseList warehouseList) {
		executeUpdate("delete from warehouse_list where purchase_id=?",warehouseList.getPurchase_id());
	}
}
