package com.qhit.lh.gr3b.hzz.t3.service.impl;
import java.util.List;
import com.qhit.lh.gr3b.hzz.t3.dao.BaseDao;
import com.qhit.lh.gr3b.hzz.t3.dao.impl.BaseDaoImpl;

public class BaseServiceImpl {
	private BaseDao bd=new BaseDaoImpl();

	public Object getObject(Class clazz,Integer id) {
		// TODO Auto-generated method stub
		return bd.getObject(clazz, id);
	}


	public void add(Object object) {
		// TODO Auto-generated method stub
		bd.add(object);
	}


	public void delete(Object object) {
		// TODO Auto-generated method stub
		bd.delete(object);
	}

	
	public void update(Object object) {
		// TODO Auto-generated method stub
		bd.update(object);
	}

	public List<Object> getAll(String hql) {
		// TODO Auto-generated method stub
		return bd.getAll(hql);
	}

}
