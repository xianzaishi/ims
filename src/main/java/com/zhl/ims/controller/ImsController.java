package com.zhl.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhl.ims.constant.Url;
import com.zhl.ims.constant.View;

/**
 * IMS控制器
 * 
 * @author 张宏亮
 * 
 */
@Controller
public class ImsController {

	/**
	 * 登陆页面
	 * 
	 * @return
	 */
	@RequestMapping(value = Url.IMS_LOGIN)
	public String loginPage() {
		return View.LoginView;
	}

	/**
	 * IMS主页
	 * 
	 * @return
	 */
	@RequestMapping(value = Url.IMS_INDEX)
	public String indexPage() {
		return View.IndexView;
	}

	/**
	 * 用户授权主页
	 * 
	 * @return
	 */
	@RequestMapping(value = Url.IMS_USER_AUTHORIZE)
	public String userAuthorize() {
		return View.UserAuthorize;
	}

	/**
	 * 权限管理
	 * 
	 * @return
	 */
	@RequestMapping(value = Url.IMS_AUTHORIZE_RESOURCES_MANAGEMENT)
	public String resourcesManagement() {
		return View.ResourcesManagement;
	}
}

