package Product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Product {
		public static void main(String[]args) {
		// TODO Auto-generated method stub
		//		Resource resource=new ClassPathResource("Product.xml");  
		//	    BeanFactory factory=new XmlBeanFactory(resource);  	      
		//	    ProductDetails pro=(ProductDetails)factory.getBean("probean");  
		//	    System.out.println(pro.toString());
			ApplicationContext context=new ClassPathXmlApplicationContext("product.xml");
			ProductDetails pro=(ProductDetails)context.getBean("probean");
			System.out.println(pro.toString());
}
}
