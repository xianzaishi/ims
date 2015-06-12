package com.zhl.ims.service;

import java.util.List;

import com.zhl.ims.model.User;

public interface UserService {

	/**
	 * 查询用户数
	 * 
	 * @return
	 */
	public int queryUserCount();

	/**
	 * 查询内容
	 * 
	 * @return
	 */
	public List<User> queryUser(int maxRowCount, int rows);

	/**
	 * 增加用户
	 * 
	 * @param user
	 */
	public void addUser(User user);

	/**
	 * 删除用户
	 * 
	 * @param id
	 */
	public void deleteUser(int id);

	/**
	 * 根据id查用户
	 * 
	 * @param id
	 * @return
	 */
	public User queryUserById(int id);

	/**
	 * 编辑用户
	 * 
	 * @param user
	 */
	public void editUser(User user);

	/**
	 * 查询人员
	 * 
	 * @param userName
	 * @return
	 */
	public List<User> queryUserByName(String userName);

	/**
	 * 查询结果数
	 * 
	 * @param userName
	 * @return
	 */
	public int queryUserByNameCount(String userName);
}
