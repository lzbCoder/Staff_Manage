package com.yuanlrc.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yuanlrc.entity.Department;
import com.yuanlrc.dao.DepartmentMapper;
import com.yuanlrc.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
	implements DepartmentService{

	@Override
	public Department selectByNumber(Integer departmentNumber) {
		return baseMapper.selectByNumber(departmentNumber);
	}

	@Override
	public Page<Department> selectListByPage(int pageNo) {
		Page<Department> page = new Page<Department>(pageNo, 10, "id");
		//是否为升序 ASC（ 默认： true ）
		page.setAsc(false);
		page.setRecords(baseMapper.selectPage(page, null));
		return page;
	}

}
