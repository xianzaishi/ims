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
import com.zhl.ims.model.Role;
import com.zhl.ims.service.RoleService;

/**
 * 角色控制器
 * 
 * @author 张宏亮
 * 
 */
@Controller
public class RoleController {
	@Autowired
	private RoleService roleService;

	@RequestMapping(value = Url.IMS_ROLE_MANAGEMENT)
	public String roleMananement(){
		return View.RoleManagementView;
	}

	/**
	 * 分页显示所有权限
	 * 
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = Url.IMS_ROLE_GET)
	public JqGridDto getAll(int page, int rows) {
		// 总记录数
		int recordCount = 0;
		// 总页数
		int pageCount = 1;

		recordCount = roleService.queryRoleCount();

		List<Role> role = new LinkedList<Role>();
		role = roleService.queryRole(page * rows, rows);

		if (recordCount % rows > 0) {
			pageCount = recordCount / rows + 1;
		} else {
			pageCount = recordCount / rows;
		}

		JqGridDto jqGridDto = new JqGridDto();
		jqGridDto.setPage(page);
		jqGridDto.setRecordsCount(recordCount);
		jqGridDto.setTotal(pageCount);
		jqGridDto.setRows(role);
		return jqGridDto;
	}

	/**
	 * 添加角色页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = Url.IMS_ROLE_ADD_PAGE)
	public String addUserPage(ModelMap model) {
		Role role = new Role();
		model.addAttribute("role", role);
		return View.AddRole;
	}

	/**
	 * 添加角色
	 * 
	 * @param role
	 * @return
	 */
	@RequestMapping(value = Url.IMS_ADD_ROLE, method = RequestMethod.POST)
	public String addRole(Role role) {
		roleService.addRole(role);
		return View.Success;
	}

	/**
	 * 删除角色
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = Url.IMS_DELETE_ROLE)
	public String deleteRole(@PathVariable int id) {
		roleService.deleteRole(id);
		return "success";
	}

	/**
	 * 编辑角色页面
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = Url.IMS_EDIT_ROLE_PAGE)
	public String editRolePage(@PathVariable int id, ModelMap model) {
		Role role = new Role();
		role = roleService.queryRoleById(id);

		model.addAttribute("role", role);
		return View.EditRole;
	}

	/**
	 * 编辑角色
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = Url.IMS_EDIT_ROLE)
	public String editUser(@PathVariable int id, Role role) {
		role.setId(id);
		roleService.editRole(role);
		return View.Success;
	}

	/**
	 * 查询角色页面
	 * 
	 * @param roleName
	 * @param model
	 * @return
	 */
	@RequestMapping(value = Url.IMS_SEARCH_ROLE)
	public String searchRolePage(@PathVariable String role, ModelMap model) {
		model.addAttribute("role", role);
		return View.SearchRole;
	}

	/**
	 * 查询角色
	 * 
	 * @param roleName
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = Url.IMS_SEARCH_ROLE_GET)
	public JqGridDto searchRole(@PathVariable String roleName) {
		List<Role> role = new LinkedList<Role>();
		role = roleService.queryRoleByName(roleName);
		// 总记录数
		int recordCount = 0;
		// 总页数
		int pageCount = 1;

		recordCount = roleService.queryRoleByNameCount(roleName);

		JqGridDto jqGridDto = new JqGridDto();
		jqGridDto.setPage(1);
		jqGridDto.setRecordsCount(recordCount);
		jqGridDto.setTotal(pageCount);
		jqGridDto.setRows(role);
		return jqGridDto;
	}

}

