package com.qhit.lh.gr3b.hzz.t8.user.service;

import java.util.List;

import com.qhit.lh.grsb.wyl.t8.user.bean.User;

public interface UserService {
		
		/**
		 * @param userName
		 * @param userPassword
		 * ��¼ҵ��
		 * @throws Exception
		 */
		public User doLogin(String userName,String userPassword) throws Exception;
		
		/**
		 * @return
		 * @throws Exception
		 * ��ȡ�����û�����
		 */
		public List<User> getAllUser() throws Exception;
		
		/**
		 * @param user
		 * @return
		 * @throws Exception
		 * ����û�
		 */
		public int addUser(User user) throws Exception;
		/**
		 * @param user
		 * @return
		 * @throws Exception
		 * ɾ��
		 */
		public int deleteUser(User user) throws Exception;
		/**
		 * @return
		 * @throws Exception
		 * ׼������ҵ��
		 */
		public User toUpdateUser(User user) throws Exception;
		/**
		 * @return
		 * @throws Exception
		 * ����ҵ��
		 */
		public int updateUser(User user) throws Exception;
		/**
		 * @return
		 * @throws Exception
		 * �������ҵ��
		 */
		public List<User> getUser(User user) throws Exception;
		

}
