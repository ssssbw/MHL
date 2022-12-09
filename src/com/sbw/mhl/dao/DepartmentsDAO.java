package com.sbw.mhl.dao;

import com.sbw.mhl.pojo.Departments;

import java.util.List;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 22:54
 */
public interface DepartmentsDAO {
	List<Departments> getDepartmentsList();
	void addDepartment(Departments departments);
	void updateDepartment(Departments departments);
}
