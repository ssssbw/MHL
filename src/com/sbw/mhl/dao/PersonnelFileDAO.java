package com.sbw.mhl.dao;

import com.sbw.mhl.pojo.PersonnelFile;

import java.util.List;

/**
 * @author sbw
 * @version 1.0
 * @description TODO
 * @create 2022-12-09 22:55
 */
public interface PersonnelFileDAO {
	List<PersonnelFile> getPersonnelFile();
	public PersonnelFile getPersonnelFile(String employee_id, String password);
	void addPersonnelInfo(PersonnelFile personnelFile);
	void updatePassword(String employee_id, String password);
	void updatePersonnelInfo(PersonnelFile personnelFile);
	void delPersonnelInfo(PersonnelFile personnelFile);
}
