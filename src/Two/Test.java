package Two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new  ClassPathXmlApplicationContext("App.xml");
		x x=(x)con.getBean("x");
		x.M1();
		x.M2();

	}

}
