package com.sbw.mhl.pojo;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 18:18
 */
public class PurchaseInfo {
	private String purchase_id;
	private String purchase_date;
	private String product_name;
	private String model;
	private String unit;
	private Float purchase_price;
	private Integer purchase_num;
	private Float purchase_amount;
	private String recoder_id;
	private String bill_comment;

	public PurchaseInfo() {
	}

	public PurchaseInfo(String purchase_id, String purchase_date, String product_name, String model, String unit, Float purchase_price, Integer purchase_num, Float purchase_amount, String recoder_id, String bill_comment) {
		this.purchase_id = purchase_id;
		this.purchase_date = purchase_date;
		this.product_name = product_name;
		this.model = model;
		this.unit = unit;
		this.purchase_price = purchase_price;
		this.purchase_num = purchase_num;
		this.purchase_amount = purchase_amount;
		this.recoder_id = recoder_id;
		this.bill_comment = bill_comment;
	}

	public String getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(String purchase_id) {
		this.purchase_id = purchase_id;
	}

	public String getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Float getPurchase_price() {
		return purchase_price;
	}

	public void setPurchase_price(Float purchase_price) {
		this.purchase_price = purchase_price;
	}

	public Integer getPurchase_num() {
		return purchase_num;
	}

	public void setPurchase_num(Integer purchase_num) {
		this.purchase_num = purchase_num;
	}

	public Float getPurchase_amount() {
		return purchase_amount;
	}

	public void setPurchase_amount(Float purchase_amount) {
		this.purchase_amount = purchase_amount;
	}

	public String getRecoder_id() {
		return recoder_id;
	}

	public void setRecoder_id(String recoder_id) {
		this.recoder_id = recoder_id;
	}

	public String getBill_comment() {
		return bill_comment;
	}

	public void setBill_comment(String bill_comment) {
		this.bill_comment = bill_comment;
	}
}
