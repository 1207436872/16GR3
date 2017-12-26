/**
 * 
 */
package com.qhit.lh.gr3b.t7;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.gr3b.t7.bean.User;
import com.qhit.lh.gr3b.t7.service.BaseService;
import com.qhit.lh.gr3b.t7.service.impl.BaseServiceImpl;


/**
 * @author 霍铮铮
 *2017年12月26日下午6:07:13
 */
public class HqlTest {   
	
	private BaseService baseser = new BaseServiceImpl();
	@Test    
	public void hql(){
		List<User> list =  baseser.getEmpByName( "from User" );
			for (Object object : list) {
			User user = (User) object;
			System.out.println(user.toString());
	}

	}
}
