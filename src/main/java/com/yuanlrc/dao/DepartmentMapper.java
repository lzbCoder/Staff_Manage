package com.yuanlrc.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuanlrc.entity.Department;

public interface DepartmentMapper extends BaseMapper<Department>{

	/**
	 * 根据DepartmentNumber查询信息
	 * @param departmentNumber
	 * @return
	 */
	Department selectByNumber(Integer departmentNumber);
}
