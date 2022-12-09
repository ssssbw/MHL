package com.sbw.mhl.pojo;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 11:15
 */
public class WarehouseList {
	private String product_id;
	private String purchase_id;
	private String product_name;
	private String warehouse_location;
	private String in_date;
	private Integer in_num;
	private Integer remain_num;
	private Integer min_num;

	public WarehouseList() {
	}

	public WarehouseList(String product_id, String purchase_id, String product_name, String warehouse_location, String in_date, Integer in_num, Integer remain_num, Integer min_num) {
		this.product_id = product_id;
		this.purchase_id = purchase_id;
		this.product_name = product_name;
		this.warehouse_location = warehouse_location;
		this.in_date = in_date;
		this.in_num = in_num;
		this.remain_num = remain_num;
		this.min_num = min_num;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(String purchase_id) {
		this.purchase_id = purchase_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getWarehouse_location() {
		return warehouse_location;
	}

	public void setWarehouse_location(String warehouse_location) {
		this.warehouse_location = warehouse_location;
	}

	public String getIn_date() {
		return in_date;
	}

	public void setIn_date(String in_date) {
		this.in_date = in_date;
	}

	public Integer getIn_num() {
		return in_num;
	}

	public void setIn_num(Integer in_num) {
		this.in_num = in_num;
	}

	public Integer getRemain_num() {
		return remain_num;
	}

	public void setRemain_num(Integer remain_num) {
		this.remain_num = remain_num;
	}

	public Integer getMin_num() {
		return min_num;
	}

	public void setMin_num(Integer min_num) {
		this.min_num = min_num;
	}
}
