package com.jtcindia.springboot;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
@Configuration
@ComponentScan(basePackages="com.jtcindia.springboot")//scan all class inside com.jtcindia.springboot
public class JTCAppConfig {
	@Bean(name="datasource" )
	public DataSource dataSource() {
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/customertable");
		bds.setUsername("root");
		bds.setPassword("Rahul@27");
		bds.setInitialSize(10);
		bds.setMaxActive(15);
		return bds;
	}
	@Bean(name="jtemp")
	public JdbcTemplate getJdbcTemplate(DataSource ds) {		
		return new JdbcTemplate(ds);
	}
}
