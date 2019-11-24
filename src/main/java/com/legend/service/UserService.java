package com.legend.service;

import java.util.List;

import com.legend.pojo.User;

/**
 * 
 * 用户处理的的相关操作 service
 *
 * @author legend
 * @date 2019年11月24日 13:11:54
 * @version V1.0
 */
public interface UserService {

	/**
	 * 新增用户
	 * @param user
	 */
	public void saveUser(User user);
	
	/**
	 * 更新用户
	 * @param user
	 */
	public void updateUserById(User user);
	
	/**
	 * 删除用户
	 * @param userId
	 */
	public void deleteUserById(String userId);
	
	/**
	 * 根据用户主键ID获取用户信息
	 * @param userId
	 */
	public User getUserById(String userId);
	
	/**
	 * 获取用户列表
	 */
	public List<User> getUserList();
}
