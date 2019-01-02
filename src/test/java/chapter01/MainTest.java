package chapter01;

import com.spring.chapter01.bean.Person;
import com.spring.chapter01.config.MyConfig;
import org.junit.Test;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    @Test
    public void test01() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/chapter01/bean.xml");

        Person person = (Person) applicationContext.getBean("person");

        System.out.println(person);

        String[] names = applicationContext.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);

        }
    }

    @Test
    public void test02(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = applicationContext.getBean(Person.class);

        System.out.println(person);

        String[] names = applicationContext.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);

        }
    }
}
