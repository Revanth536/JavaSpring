package Emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext a=new ClassPathXmlApplicationContext("Emp.xml");
		Emp p=(Emp)a.getBean("id2");
		System.out.println(p);
	}

}
