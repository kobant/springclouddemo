package com.kuang.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * /**
 *
 * @author 廖聪聪
 * @version 1.0
 * 创建时间 2020/10/5 21:46
 */

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {//实体类


	private long deptno;//主键
	private String dname;

	//我更新提交
	//我更新提交2

	private String db_source;

	//主干添加

	//分支添加
	public Dept(String dname) {
		this.dname = dname;
	}

	/*链式写法
	Dept dept = new Dept();
	dept.setDeptNo(11).setDeptName('544');*/
}
