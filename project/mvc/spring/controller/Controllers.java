package mvc.spring.controller;

import mvc.spring.dao.UserDao;
import mvc.spring.po.User;
import mvc.spring.utils.MD5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @description 用于处理所有的页面请求
 * @author hongxingfan
 * @since 2014年4月8日 上午11:24:07
 * @summarize TODO
 */
@Controller
public class Controllers {
	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public Controllers() {
		System.out.println("controllers is run");
	}

	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public ModelAndView login(User userbean) {
		if (userDao.findAll(userbean.getUsername(), MD5.changeToMD5(userbean.getPassword())).size() != 0)
			return new ModelAndView("home", "info", "home_value_info");
		else
			return new ModelAndView("error", "info", "error_value_info");
	}

	@RequestMapping(value = "index.do", method = RequestMethod.GET)
	public ModelAndView index() {
		System.out.println("index.do is run");
		return new ModelAndView("login");
	}
}
