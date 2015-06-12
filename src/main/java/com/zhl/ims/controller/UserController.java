package com.zhl.ims.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhl.ims.constant.Url;
import com.zhl.ims.constant.View;
import com.zhl.ims.dto.JqGridDto;
import com.zhl.ims.model.User;
import com.zhl.ims.service.UserService;

/**
 * User控制器
 * 
 * @author 张宏亮
 * 
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;

	/**
	 * 用户管理首页
	 * 
	 * @return
	 */
	@RequestMapping(value = Url.IMS_USER_MANAGEMENT)
	public String loginPage() {
		return View.UserManagementView;
	}

	/**
	 * 分页显示所有用户和权限 @user @aurhorize
	 * 
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = Url.IMS_USER_GET)
	public JqGridDto getAllUser(int page, int rows) {
		// 总记录数
		int recordCount = 0;
		// 总页数
		int pageCount = 1;

		recordCount = userService.queryUserCount();

		List<User> user = new LinkedList<User>();
		user = userService.queryUser(page * rows, rows);

		if (recordCount % rows > 0) {
			pageCount = recordCount / rows + 1;
		} else {
			pageCount = recordCount / rows;
		}

		JqGridDto jqGridDto = new JqGridDto();
		jqGridDto.setPage(page);
		jqGridDto.setRecordsCount(recordCount);
		jqGridDto.setTotal(pageCount);
		jqGridDto.setRows(user);
		return jqGridDto;
	}

	/**
	 * 添加用户页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = Url.IMS_USER_ADD_PAGE)
	public String addUserPage(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		return View.AddUser;
	}

	/**
	 * 添加用户
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = Url.IMS_ADD_USER, method = RequestMethod.POST)
	public String addUser(User user) {
		userService.addUser(user);
		return View.Success;
	}

	/**
	 * 删除用户
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = Url.IMS_DELETE_USER)
	public String deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
		return "success";
	}

	/**
	 * 编辑用户页面
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = Url.IMS_EDIT_USER_PAGE)
	public String editUserPage(@PathVariable int id, ModelMap model) {
		User user = new User();
		user = userService.queryUserById(id);

		model.addAttribute("user", user);
		return View.EditUser;
	}

	/**
	 * 编辑用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = Url.IMS_EDIT_USER)
	public String editUser(@PathVariable int id, User user) {
		user.setId(id);
		userService.editUser(user);
		return View.UserManagementView;
	}

	/**
	 * 搜索人员页面
	 * 
	 * @param userName
	 * @param model
	 * @return
	 */
	@RequestMapping(value = Url.IMS_SEARCH_USER)
	public String searchUserPage(@PathVariable String user, ModelMap model) {
		model.addAttribute("user", user);
		return View.SearchUser;
	}

	/**
	 * 查询人员
	 * 
	 * @param userName
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = Url.IMS_SEARCH_USER_GET)
	public JqGridDto searchUser(@PathVariable String userName) {
		List<User> user = new LinkedList<User>();
		user = userService.queryUserByName(userName);
		// 总记录数
		int recordCount = 0;
		// 总页数
		int pageCount = 1;

		recordCount = userService.queryUserByNameCount(userName);

		JqGridDto jqGridDto = new JqGridDto();
		jqGridDto.setPage(1);
		jqGridDto.setRecordsCount(recordCount);
		jqGridDto.setTotal(pageCount);
		jqGridDto.setRows(user);
		return jqGridDto;
	}
}

