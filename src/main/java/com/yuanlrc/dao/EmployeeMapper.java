package com.yuanlrc.dao;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuanlrc.entity.Employee;

public interface EmployeeMapper extends BaseMapper<Employee>{

	/**
	 * 登录验证
	 * @param employeeNumber
	 * @param password
	 * @return
	 */
	Employee checkLogin(@Param("employeeNumber")Integer employeeNumber,
			@Param("password")String password);

	/**
	 * 根据employeeNumber查询信息
	 * @param employeeNumber
	 * @return
	 */
	Employee selectByNumber(Integer employeeNumber);

}
