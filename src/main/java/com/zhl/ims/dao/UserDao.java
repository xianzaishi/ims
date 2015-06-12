package com.zhl.ims.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.zhl.ims.domain.UserResult;
import com.zhl.ims.model.User;

/**
 * 用户Dao
 * 
 * @author 张宏亮
 * 
 */
@Repository
public class UserDao extends BaseDao{
	private JdbcTemplate jdbcTemplate;
	private static final String FIND_USER_SQL = "select u.user_name as username, u.password, r.name, u.enable from user u, role r, user_role us "
			+ "where u.id = us.user_id and r.id = us.role_id and u.user_name = ? ";

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public UserResult findByName(String username) {
		final UserResult userResult = new UserResult();
		jdbcTemplate.query(FIND_USER_SQL, new Object[] { username }, new RowCallbackHandler() {
			public void processRow(ResultSet rs) throws SQLException {
				userResult.setUsername(rs.getString("username"));
				userResult.setPassword(rs.getString("password"));
				userResult.setEnable(rs.getBoolean("enable"));
				userResult.addPower(rs.getString("name"));
			}
		});
		return userResult;
	}

	/**
	 * 查询用户数
	 * 
	 * @return
	 */
	public int queryUserCount() {
		return (Integer) getSqlMapClientTemplate().queryForObject("user.queryUserCount");
	}

	/**
	 * 查询内容
	 * 
	 * @return
	 */
	public List<User> queryUser(int maxRowCount, int rows) {
		return (List<User>) getSqlMapClientTemplate().queryForList("user.queryUser", maxRowCount - rows, rows);
	}

	/**
	 * 增加用户
	 * 
	 * @param user
	 */
	public void addUser(User user) {
		getSqlMapClientTemplate().insert("user.addUser", user);
	}

	/**
	 * 删除用户
	 * 
	 * @param id
	 */
	public void deleteUser(int id) {
		getSqlMapClientTemplate().delete("user.deleteUser", id);
	}

	/**
	 * 根据id查用户
	 * 
	 * @param id
	 * @return
	 */
	public User queryUserById(int id) {
		return (User) getSqlMapClientTemplate().queryForObject("user.queryUserById", id);
	}

	/**
	 * 编辑用户
	 * 
	 * @param user
	 */
	public void editUser(User user) {
		getSqlMapClientTemplate().update("user.editUser", user);
	}

	/**
	 * 查询人员
	 * 
	 * @param userName
	 * @return
	 */
	public List<User> queryUserByName(String userName) {
		return (List<User>) getSqlMapClientTemplate().queryForList("user.queryUserByName", "%" + userName + "%");
	}

	/**
	 * 查询结果数
	 * 
	 * @param userName
	 * @return
	 */
	public int queryUserByNameCount(String userName) {
		return (Integer) getSqlMapClientTemplate().queryForObject("user.queryUserByNameCount", "%" + userName + "%");
	}
}
