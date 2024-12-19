package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcore.Bean.Student;
import springcore.ConstructorInject.Vehicle;


public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//        Student s1=(Student) context.getBean("stu1");
//        System.out.println(s1);
//        
//        Student s2=(Student) context.getBean("stu2");
//        System.out.println(s2);
//        
//        Student s3=(Student) context.getBean("stu3");
//        System.out.println(s3);
//        
        ApplicationContext context2=new ClassPathXmlApplicationContext("springcore/ConstructorInject/configCons.xml");
        
     Vehicle vehicle1=(Vehicle) context2.getBean("v1");
        System.out.println(vehicle1);
    }
}
