package com.sbw.mhl.pojo;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 18:19
 */
public class Departments {
	private String department_id;
	private String department_name;
	private String location_id;

	public Departments() {
	}

	public Departments(String department_id, String department_name, String location_id) {
		this.department_id = department_id;
		this.department_name = department_name;
		this.location_id = location_id;
	}

	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getLocation_id() {
		return location_id;
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}
}
