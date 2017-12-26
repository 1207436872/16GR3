package com.qhit.lh.gr3b.t7.service.impl;

import java.util.List;

import com.qhit.lh.gr3b.t7.bean.User;
import com.qhit.lh.gr3b.t7.dao.BaseDao;
import com.qhit.lh.gr3b.t7.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3b.t7.service.BaseService;


 
/**
 * @author 霍铮铮
 *2017年12月26日下午6:00:29
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();


	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
	}

	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}


	public List<Object> getAll(String fromObject) {
		// TODO Auto-generated method stub
		return baseDao.getAll(fromObject);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.liu.hb.servcie.BaseService#getObjectById(java.lang.Object, int)
	 */

	public Object getObjectById(Object obj, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(obj, id);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.liu.hb.servcie.BaseService#getEmpByName(java.lang.String)
	 */

	public List<User> getEmpByName(String name) {
		// TODO Auto-generated method stub
		return baseDao.getEmpByName(name);
	}

}