package com.sbw.mhl.pojo;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 11:02
 */
public class WarehouseInfo {
	private String warehouse_id;
	private String warehouse_name;
	private String warehouse_location;

	public WarehouseInfo() {
	}

	public WarehouseInfo(String warehouse_id, String warehouse_name, String warehouse_location) {
		this.warehouse_id = warehouse_id;
		this.warehouse_name = warehouse_name;
		this.warehouse_location = warehouse_location;
	}

	public String getWarehouse_id() {
		return warehouse_id;
	}

	public void setWarehouse_id(String warehouse_id) {
		this.warehouse_id = warehouse_id;
	}

	public String getWarehouse_name() {
		return warehouse_name;
	}

	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
	}

	public String getWarehouse_location() {
		return warehouse_location;
	}

	public void setWarehouse_location(String warehouse_location) {
		this.warehouse_location = warehouse_location;
	}
}
