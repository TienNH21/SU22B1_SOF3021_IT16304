package su22.sof3021.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import su22.sof3021.demo_bean_config.UserDAOInterface;
import su22.sof3021.demo_bean_config.UserDAOMySql;
import su22.sof3021.demo_bean_config.UserDAOSqlServer;

@Configuration
public class UserDAOConfiguration {
	@Bean("user_dao_mysql")
	public UserDAOInterface getUserDAOBeanMySQL()
	{
		UserDAOMySql dao = new UserDAOMySql();
		return dao;
	}
	
	@Bean("user_dao_sqlserver")
	public UserDAOInterface getUserDAOBeanSqlServer()
	{
		UserDAOSqlServer dao = new UserDAOSqlServer();
		return dao;
	}
}
