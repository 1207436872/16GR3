package com.qhit.lh.gr3b.t7;
import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3b.t7.bean.Dept;
import com.qhit.lh.gr3b.t7.bean.User;
import com.qhit.lh.gr3b.t7.service.BaseService;
import com.qhit.lh.gr3b.t7.service.impl.BaseServiceImpl;


/**
 * @author 霍铮铮
 *2017年12月26日下午6:07:24
 */
public class DeptTest {
	private BaseService baseser = new BaseServiceImpl();
	@Test
	public void delete() {
		Dept dept = new Dept();
		dept	= (Dept) baseser.getObjectById(dept, 2);
		baseser.delete(dept);
	}
	@Test
	public void deleteuser(){
		User user = new User();
		user = (User) baseser.getObjectById(user,1010);
		baseser.delete(user);
	}

}