/**
 * 
 */
package draw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author RS
 *
 */
public class DrawApp 
{
	public static void main(String[] args) 
	{
		/* Note: When using FileSystemXmlApplicationContext keep the .xml within the SpringDemo folder: 
			ApplicationContext  context =  new FileSystemXmlApplicationContext("Spring.xml"); 
		*/
		
		/* When using ClassPathXmlApplicationContext put the .xml file inside the src folder:*/
		ApplicationContext  context =  new ClassPathXmlApplicationContext("Spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
