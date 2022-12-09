package com.sbw.mhl.dao.impl;

import com.sbw.mhl.dao.PersonnelFileDAO;
import com.sbw.mhl.pojo.PersonnelFile;
import com.sbw.myssm.basedao.BaseDAO;

import java.util.List;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 23:04
 */
public class PersonnelFileDAOImpl extends BaseDAO<PersonnelFile> implements PersonnelFileDAO {
	@Override
	public List<PersonnelFile> getPersonnelFile() {
		return executeQuery("select * from personnel_file");
	}

	@Override
	public PersonnelFile getPersonnelFile(String employee_id, String password) {
		return load("select * from t_user where uname=? and pwd=? " , employee_id , password);
	}

	@Override
	public void addPersonnelInfo(PersonnelFile personnelFile) {
		String sql = "insert into personnel_file values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		executeUpdate(sql, personnelFile.getEmployee_id(), personnelFile.getDepartment_id(), personnelFile.getPassword(),
				personnelFile.getEmp_comment(), personnelFile.getEmp_name(), personnelFile.getGender(), personnelFile.getAddress(),
				personnelFile.getBirth_date(), personnelFile.getIdentity_id(), personnelFile.getEdu_background(),
				personnelFile.getIs_married(), personnelFile.getLandline_number(), personnelFile.getCellphone_number(),
				personnelFile.getEmail(), personnelFile.getHiredate(), personnelFile.getSalary());
	}

	@Override
	public void updatePassword(String employee_id, String password) {
		executeUpdate("update personnel_file set password=? where employee_id=?", password, employee_id);
	}

	@Override
	public void updatePersonnelInfo(PersonnelFile personnelFile) {
		String sql = "update personnel_file set Department_id=?,Password=?,Emp_comment=?,Emp_name=?," +
				"Gender=?,Address=?,Birth_date=?,Identity_id=?,Edu_background=?,Is_married=?,Landline_number=?," +
				"Cellphone_number=?,Email=?,hiredate=?,Salary=? where employee_id=?";
		executeUpdate(sql, personnelFile.getDepartment_id(), personnelFile.getPassword(),
				personnelFile.getEmp_comment(), personnelFile.getEmp_name(), personnelFile.getGender(), personnelFile.getAddress(),
				personnelFile.getBirth_date(), personnelFile.getIdentity_id(), personnelFile.getEdu_background(),
				personnelFile.getIs_married(), personnelFile.getLandline_number(), personnelFile.getCellphone_number(),
				personnelFile.getEmail(), personnelFile.getHiredate(), personnelFile.getSalary(),personnelFile.getEmployee_id());
	}

	@Override
	public void delPersonnelInfo(PersonnelFile personnelFile) {
		executeUpdate("delete from personnel_file where employee_id=?", personnelFile.getEmployee_id());
	}
}
