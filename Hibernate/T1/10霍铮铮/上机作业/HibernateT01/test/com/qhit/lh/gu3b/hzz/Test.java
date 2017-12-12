package com.qhit.lh.gu3b.hzz;

import com.qhit.lh.gu3b.hzz.bean.User;
import com.qhit.lh.gu3b.hzz.service.BaseService;
import com.qhit.lh.gu3b.hzz.service.impl.BaseServiceImpl;



public class Test {
    private BaseService baseService = new BaseServiceImpl();
@org.junit.Test    
     public void addUser(){
    	 //声明并实例化对象
    	 User user = new User();
    	 user.setUname("tom");
    	 user.setPwd("545");
    	 user.setSex("m");
    	 //数据操作
    	 baseService.add(user);
    	 
     }
    
    
}
