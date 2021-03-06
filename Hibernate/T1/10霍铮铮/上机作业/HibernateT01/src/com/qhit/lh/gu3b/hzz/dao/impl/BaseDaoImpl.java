package com.qhit.lh.gu3b.hzz.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gu3b.hzz.dao.BaseDao;
import com.qhit.lh.gu3b.hzz.utils.HibernateSessionFactory;

/**
 * @author 霍铮铮
 *TODO
 *2017年12月11日上午10:16:34
 */
public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		//1.获取session对象
		  Session session = HibernateSessionFactory.getSession();
		//2.开启事务
		  Transaction ts = session.beginTransaction();
		//3.执行
		  session.save(obj);
        //4.提交事务
		  ts.commit();
		 //5.释放资源
		  HibernateSessionFactory.closeSession();
  
	}

	@Override
	public void del(Object obj) {
		//1.获取session对象
		  Session session = HibernateSessionFactory.getSession();
		//2.开启事务
		  Transaction ts = session.beginTransaction();
		//3.执行
		  session.save(obj);
      //4.提交事务
		  ts.commit();
		 //5.释放资源
		  HibernateSessionFactory.closeSession();

	}

	@Override
	public void upd(Object obj) {
		//1.获取session对象
		  Session session = HibernateSessionFactory.getSession();
		//2.开启事务
		  Transaction ts = session.beginTransaction();
		//3.执行
		  session.save(obj);
      //4.提交事务
		  ts.commit();
		 //5.释放资源
		  HibernateSessionFactory.closeSession();

	}

	@Override
	public List<Object> getALl(String fromObject) {
		//1.获取session对象
		  Session session = HibernateSessionFactory.getSession();
		//2.开启事务
		  Transaction ts = session.beginTransaction();
		//3.执行
		Query query  =session.createQuery(fromObject);
		query.list();
        //4.提交事务
		  ts.commit();
		 //5.释放资源
		  HibernateSessionFactory.closeSession();

		
		return null;
	}

}
