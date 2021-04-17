package com.yuanlrc.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yuanlrc.entity.Attendance;

public interface AttendanceMapper extends BaseMapper<Attendance>{

	/**
	 * 根据employeeNumber和day查询记录
	 * @param employeeNumber
	 * @return
	 */
	Attendance selectByNumber(@Param("employeeNumber")Integer employeeNumber,
			@Param("day")Date day, @Param("timeType")String timeType);
}
