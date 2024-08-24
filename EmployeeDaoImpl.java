package com.nit.dao;

import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.nit.model.Employee;
import static com.nit.constant.Constant.*;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao{

	private RowMapper<Employee> rowMapper = null;
	
	public void setRowMapper(RowMapper<Employee> rowMapper) {
		this.rowMapper = rowMapper;
	}
	@Override
	public List<Employee> getAllEmployees() {
		return getJdbcTemplate().query(GET_ALL, rowMapper);
	}

	@Override
	public Employee getEmployee(Long id) {
		List<Employee> emps = getJdbcTemplate().query(GET_ONE, rowMapper, id);
		return emps.get(0);
	}

	@Override
	public void saveEmployee(Employee emp) {
		getJdbcTemplate().update(INSERT,emp.getName(),emp.getAddress(),emp.getSalary());
	}

	@Override
	public void updateEmployee(Employee emp) {
		getJdbcTemplate().update(UPDATE,emp.getName(),emp.getAddress(),emp.getSalary(),emp.getId());
	}

	@Override
	public void deleteEmployee(Long id) {
		getJdbcTemplate().update(DELETE,id);
	}

}
