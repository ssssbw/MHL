package com.sbw.mhl.pojo;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 10:38
 */
public class FiscalExpenditure {
	private String date;
	private Float emp_month_expenditure;
	private Float purchase_month_expenditure;
	private Float other_expenditure;
	private Float month_total_expenditure;

	public FiscalExpenditure() {
	}

	public FiscalExpenditure(String date, Float emp_month_expenditure, Float purchase_month_expenditure, Float other_expenditure, Float month_total_expenditure) {
		this.date = date;
		this.emp_month_expenditure = emp_month_expenditure;
		this.purchase_month_expenditure = purchase_month_expenditure;
		this.other_expenditure = other_expenditure;
		this.month_total_expenditure = month_total_expenditure;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Float getEmp_month_expenditure() {
		return emp_month_expenditure;
	}

	public void setEmp_month_expenditure(Float emp_month_expenditure) {
		this.emp_month_expenditure = emp_month_expenditure;
	}

	public Float getPurchase_month_expenditure() {
		return purchase_month_expenditure;
	}

	public void setPurchase_month_expenditure(Float purchase_month_expenditure) {
		this.purchase_month_expenditure = purchase_month_expenditure;
	}

	public Float getOther_expenditure() {
		return other_expenditure;
	}

	public void setOther_expenditure(Float other_expenditure) {
		this.other_expenditure = other_expenditure;
	}

	public Float getMonth_total_expenditure() {
		return month_total_expenditure;
	}

	public void setMonth_total_expenditure(Float month_total_expenditure) {
		this.month_total_expenditure = month_total_expenditure;
	}

	@Override
	public String toString() {
		return date + "date月支出明细: " + "员工月工资支出:" + emp_month_expenditure + ", 采购月支出:" + purchase_month_expenditure + ", 其他支出=" + other_expenditure + ", 月总支出:" + month_total_expenditure;
	}
}
