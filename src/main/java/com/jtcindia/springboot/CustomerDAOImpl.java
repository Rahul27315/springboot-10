package com.jtcindia.springboot;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("custDAO")
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	JdbcTemplate jdbcTemp;
	@Override
	public void addCustomer(Customer cust) {
		String sql="insert into mycustomers values(?,?,?,?,?)";
		jdbcTemp.update(sql,cust.getCid(),cust.getCname(),cust.getEmail(),cust.getPhone(),cust.getCity());		
	}
	@Override
	public List<Customer> getAllCustomers() {
		String sql="select * from mycustomers";
		List<Customer> list=jdbcTemp.query(sql,new CustomerRowMapper());
		return list;
	}
}
