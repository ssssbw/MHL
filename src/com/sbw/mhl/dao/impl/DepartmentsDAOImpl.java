package com.sbw.mhl.dao.impl;

import com.sbw.mhl.dao.DepartmentsDAO;
import com.sbw.mhl.pojo.Departments;
import com.sbw.myssm.basedao.BaseDAO;

import java.util.List;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 23:02
 */
public class DepartmentsDAOImpl extends BaseDAO<Departments> implements DepartmentsDAO {
	@Override
	public List<Departments> getDepartmentsList() {
		return executeQuery("select * from departments");
	}

	@Override
	public void addDepartment(Departments departments) {
		executeUpdate("insert into departments values(?,?,?)", departments.getDepartment_id(), departments.getDepartment_name(), departments.getLocation_id());
	}

	@Override
	public void updateDepartment(Departments departments) {
		executeUpdate("update departments set department_id=?,department_name=? where location_id=?", departments.getDepartment_id(),departments.getDepartment_name(),departments.getLocation_id());
	}
}
