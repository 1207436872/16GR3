/**
 * 
 */
package com.qhit.lh.gr3b.t7;

import static org.junit.Assert.*;

import com.qhit.lh.gr3b.t7.bean.Dept;
import com.qhit.lh.gr3b.t7.bean.User;
import com.qhit.lh.gr3b.t7.service.BaseService;
import com.qhit.lh.gr3b.t7.service.impl.BaseServiceImpl;




public class Test {
	private BaseService baseser = new BaseServiceImpl();
	@org.junit.Test
	public void add() {
	
			User user = new User();
			
			user.setUname("sa");
			user.setPwd("123456");
			user.setBirthday("2013-09-07");
			user.setSex("m");
			
	User user1 = new User();
			
			user1.setUname("liu");
			user1.setPwd("123456");
			user1.setDeptid(1);
			user1.setBirthday("2013-09-07");
			user1.setSex("s");
			
			Dept dept=new Dept();
			dept.setDeptname("宣传部");
			dept.setAddress("美国");
			
			dept.getUsers().add(user1);
			dept.getUsers().add(user);
			
			baseser.add(dept);
	}

}