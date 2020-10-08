package com.kuang.springcloud.Service;

import com.kuang.springcloud.pojo.Dept;

import java.util.List;

/**
 * /**
 *
 * @author 廖聪聪
 * 创建时间 2020/10/5 23:27
 */

public interface DeptService {


	public boolean addDept(Dept dept);

	public Dept queryById(Long id);

	public List<Dept> queryAll();
}
