package com.qhit.lh.gr3b.t7.service;

import java.util.List;

import com.qhit.lh.gr3b.t7.bean.User;



public interface BaseService {
	/**
	 * @param obj
	 * 增
	 */
	public void add(Object obj);
	
	/**
	 * @param obj
	 * 删
	 */
	public void delete(Object obj);
	
	/**
	 * @param obj
	 * 改
	 */
	public void update(Object obj);
	
	/**
	 * 查
	 */
	public List<Object> getAll(String fromObject);
	
	public Object getObjectById(Object obj, int id);
	
	public List<User> getEmpByName(String name);
}