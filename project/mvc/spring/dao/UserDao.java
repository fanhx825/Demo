package mvc.spring.dao;


import java.util.List;

import mvc.spring.po.User;

/**
 * @description 查找用户接口
 * @author hongxingfan
 * @since 2014年4月8日  下午3:12:23
 * @summarize TODO
 */
public interface UserDao {

	public List<User> findAll(String username,String password);
	
	public List<User> findByName(String username);
}
