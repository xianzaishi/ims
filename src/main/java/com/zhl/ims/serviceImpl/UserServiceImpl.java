package com.zhl.ims.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhl.ims.dao.UserDao;
import com.zhl.ims.model.User;
import com.zhl.ims.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	/**
	 * 查询用户数
	 * 
	 * @return
	 */
	public int queryUserCount() {
		return userDao.queryUserCount();
	}

	/**
	 * 查询内容
	 * 
	 * @return
	 */
	public List<User> queryUser(int maxRowCount, int rows) {
		return userDao.queryUser(maxRowCount, rows);
	}

	/**
	 * 增加用户
	 * 
	 * @param user
	 */
	public void addUser(User user) {
		userDao.addUser(user);
	}

	/**
	 * 删除用户
	 * 
	 * @param id
	 */
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

	/**
	 * 根据id查用户
	 * 
	 * @param id
	 * @return
	 */
	public User queryUserById(int id) {
		return userDao.queryUserById(id);
	}

	/**
	 * 编辑用户
	 * 
	 * @param user
	 */
	public void editUser(User user) {
		userDao.editUser(user);
	}

	/**
	 * 查询人员
	 * 
	 * @param userName
	 * @return
	 */
	public List<User> queryUserByName(String userName) {
		return userDao.queryUserByName(userName);
	}

	/**
	 * 查询结果数
	 * 
	 * @param userName
	 * @return
	 */
	public int queryUserByNameCount(String userName) {
		return userDao.queryUserByNameCount(userName);
	}
}
