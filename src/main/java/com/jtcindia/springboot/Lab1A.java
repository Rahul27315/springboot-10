package com.jtcindia.springboot;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Lab1A {	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(JTCAppConfig.class);
		CustomerDAO cdao=(CustomerDAO)ctx.getBean("custDAO");//CustomerDAO custDAO=new CustomerDAOImpl();
		//1.addCustomer
		Customer cust=new Customer(638,"Rahul","rahul",1111,"Noida");
		cdao.addCustomer(cust);
		//2.getAllCustomers
		System.out.println("getAllCustomers");
		List<Customer> list=cdao.getAllCustomers();
		list.forEach(customer->System.out.println(customer));
		System.out.println("----Done------");
		
	}
}
