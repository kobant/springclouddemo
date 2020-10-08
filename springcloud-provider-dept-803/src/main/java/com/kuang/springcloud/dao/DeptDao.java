package com.kuang.springcloud.dao;

import com.kuang.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * /**
 *
 * @author 廖聪聪
 * @version 1.0
 * 创建时间 2020/10/5 23:18
 */

@Mapper
@Repository
public interface DeptDao {

	public boolean addDept(Dept dept);

	public Dept queryById(Long id);

	public List<Dept> queryAll();
}
