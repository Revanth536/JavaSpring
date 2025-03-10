package Question;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r =new ClassPathResource("application.xml");
		BeanFactory factory =new XmlBeanFactory(r);
		
		Questions q=(Questions)factory.getBean("q");
		q.display();		
	}

}
