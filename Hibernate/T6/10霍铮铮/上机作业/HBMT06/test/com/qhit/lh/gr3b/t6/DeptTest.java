package com.qhit.lh.gr3b.t6;

import org.junit.Test;

import com.qhit.lh.gr3b.t6.bean.Dept;
import com.qhit.lh.gr3b.t6.bean.Emp;
import com.qhit.lh.gr3b.t6.bean.User;
import com.qhit.lh.gr3b.t6.service.BaseService;
import com.qhit.lh.gr3b.t6.service.impl.BaseServiceImpl;


public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add(){
		Dept dept = new Dept();
		dept.setDeptName("生活部");
		dept.setAddress("北京");
		
		Emp emp = new Emp();
		emp.setEmpName("小明");
		emp.setEmpSex("M");
		emp.setBirthday("2017-12-16");
		
		User user = new User();
		user.setUserName("xiaoming");
		user.setPassword("123456");
		
		//1-1
		emp.setUser(user);
		user.setEmp(emp);
		//1-n
		dept.getEmps().add(emp);
		//
		emp.setDept(dept);
		
		baseService.add(dept);
		
	}
}
