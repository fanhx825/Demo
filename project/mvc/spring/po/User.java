package mvc.spring.po;

/**
 * @description 用户实体
 * @author hongxingfan
 * @since 2014年4月8日 上午11:29:21
 * @summarize 在请求到达时，实例化User类
 */
public class User {
	public User() {
		System.out.println("实例化User类");
	}

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
