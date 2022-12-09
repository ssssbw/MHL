package com.sbw.mhl.pojo;

public class PersonnelFile {
    private String employee_id;
    private String department_id;
    private String password;
    private String emp_comment;
    private String emp_name;
    private String gender;
    private String address;
    private String birth_date;
    private String identity_id;
    private String edu_background;
    private String is_married;
    private String landline_number;
    private String cellphone_number;
    private String email;
    private String hiredate;
    private Float salary;

    public PersonnelFile() {
    }

    public PersonnelFile(String employee_id, String department_id, String password, String emp_comment, String emp_name, String gender, String address, String birth_date, String identity_id, String edu_background, String is_married, String landline_number, String cellphone_number, String email, String hiredate, Float salary) {
        this.employee_id = employee_id;
        this.department_id = department_id;
        this.password = password;
        this.emp_comment = emp_comment;
        this.emp_name = emp_name;
        this.gender = gender;
        this.address = address;
        this.birth_date = birth_date;
        this.identity_id = identity_id;
        this.edu_background = edu_background;
        this.is_married = is_married;
        this.landline_number = landline_number;
        this.cellphone_number = cellphone_number;
        this.email = email;
        this.hiredate = hiredate;
        this.salary = salary;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmp_comment() {
        return emp_comment;
    }

    public void setEmp_comment(String emp_comment) {
        this.emp_comment = emp_comment;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getIdentity_id() {
        return identity_id;
    }

    public void setIdentity_id(String identity_id) {
        this.identity_id = identity_id;
    }

    public String getEdu_background() {
        return edu_background;
    }

    public void setEdu_background(String edu_background) {
        this.edu_background = edu_background;
    }

    public String getIs_married() {
        return is_married;
    }

    public void setIs_married(String is_married) {
        this.is_married = is_married;
    }

    public String getLandline_number() {
        return landline_number;
    }

    public void setLandline_number(String landline_number) {
        this.landline_number = landline_number;
    }

    public String getCellphone_number() {
        return cellphone_number;
    }

    public void setCellphone_number(String cellphone_number) {
        this.cellphone_number = cellphone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "员工ID:" + employee_id + '\'' +
                "员工密码" + password + '\'' +
                '}';
    }
}