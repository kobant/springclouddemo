package com.kuang.springcloud.service;

import com.kuang.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * /**
 *
 * @author 廖聪聪
 * @version 1.0
 * 创建时间 2020/10/7 12:49
 */

//熔断降级
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
	@Override
	public DeptClientService create(Throwable throwable) {
		return new DeptClientService() {
			@Override
			public Dept queryById(Long id) {
				return new Dept().setDeptno(id)
						.setDname("id=>"+id+"没有对应的信息，客户端提供了降级信息，这个服务现在已经关闭了")
						.setDb_source("没有数据~");
			}

			@Override
			public boolean addDept(Dept dept) {
				return false;
			}

			@Override
			public List<Dept> queryAll() {
				return null;
			}
		};
	}
}
