package C2TC_SpringEample.banglore_flight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	bg_flight obj = (bg_flight)context.getBean("welcome");
    	System.out.println(((bg_flight) obj).getMessage());
    }
}
