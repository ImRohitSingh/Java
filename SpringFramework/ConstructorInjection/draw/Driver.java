package draw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) 
	{
		/* Note: When using FileSystemXmlApplicationContext keep the .xml within the SpringDemo folder: 
		ApplicationContext  context =  new FileSystemXmlApplicationContext("Spring.xml"); 
		*/
		
		/* When using ClassPathXmlApplicationContext put the .xml file inside the src folder:*/
		ApplicationContext  context =  new ClassPathXmlApplicationContext("Spring.xml");
		Triangle triangleType = (Triangle) context.getBean("triangleType");
		triangleType.draw();
		Triangle triangleHeight = (Triangle) context.getBean("triangleHeight");
		triangleHeight.draw();
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
