package com.zhl.ims.constant;

public class Url {
	public static final String IMS_BASE = "/ims";

	public static final String INDEX = "/index";

	public static final String IMS_INDEX = IMS_BASE + "/index";

	public static final String IMS_LOGIN = IMS_BASE + "/login";

	/**
	 * 用户管理
	 */
	public static final String IMS_USER_MANAGEMENT = "/user/management";

	/**
	 * 角色管理
	 */
	public static final String IMS_ROLE_MANAGEMENT = "/role/management";

	/**
	 * 获得所有用户
	 */
	public static final String IMS_USER_GET = "/user/get";

	/**
	 * 添加用户页面
	 */
	public static final String IMS_USER_ADD_PAGE = "/user/add";

	/**
	 * 添加用户
	 */
	public static final String IMS_ADD_USER = "/add/user";

	/**
	 * 删除用户
	 */
	public static final String IMS_DELETE_USER = "/user/delete/{id}";

	/**
	 * 编辑用户页面
	 */
	public static final String IMS_EDIT_USER_PAGE = "/user/edit/{id}";

	/**
	 * 编辑用户
	 */
	public static final String IMS_EDIT_USER = "/edit/user/{id}";

	/**
	 * 获得所有角色
	 */
	public static final String IMS_ROLE_GET = "/role/get";

	/**
	 * 添加角色页面
	 */
	public static final String IMS_ROLE_ADD_PAGE = "/role/add";

	/**
	 * 添加角色
	 */
	public static final String IMS_ADD_ROLE = "/add/role";

	/**
	 * 删除角色
	 */
	public static final String IMS_DELETE_ROLE = "/role/delete/{id}";

	/**
	 * 编辑角色页面
	 */
	public static final String IMS_EDIT_ROLE_PAGE = "/role/edit/{id}";

	/**
	 * 编辑角色
	 */
	public static final String IMS_EDIT_ROLE = "/edit/role/{id}";

	/**
	 * 查询角色页面
	 */
	public static final String IMS_SEARCH_ROLE = "/search/role/{role}";

	/**
	 * 查询角色
	 */
	public static final String IMS_SEARCH_ROLE_GET = "/search/role/get/{roleName}";

	/**
	 * 查询用户页面
	 */
	public static final String IMS_SEARCH_USER = "/search/user/{user}";

	/**
	 * 查询用户
	 */
	public static final String IMS_SEARCH_USER_GET = "/search/user/get/{userName}";

	/**
	 * 用户授权
	 */
	public static final String IMS_USER_AUTHORIZE = "/authorize/user/id/{id}";

	/**
	 * 权限管理
	 */
	public static final String IMS_AUTHORIZE_RESOURCES_MANAGEMENT = "/authorize/resources/management";
}
