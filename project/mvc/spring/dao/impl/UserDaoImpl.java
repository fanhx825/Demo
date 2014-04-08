package mvc.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mvc.spring.dao.UserDao;
import mvc.spring.po.User;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class UserDaoImpl implements UserDao {
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Override
	public List<User> findAll(String username, String password) {
		String sql_user = "SELECT u_name,u_password FROM sys_user WHERE u_name=:u_name AND u_password=:u_password";
		Map<String, Object> sql_param = new HashMap<String, Object>();
		sql_param.put("u_name", username);
		sql_param.put("u_password", password);
		List<User> list_users = namedParameterJdbcTemplate.query(sql_user, sql_param, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User item = new User();
				item.setUsername(rs.getString("u_name"));
				item.setPassword(rs.getString("u_password"));
				return item;
			}
		});
		return list_users;
	}

	@Override
	public List<User> findByName(String username) {
		return null;
	}

}
