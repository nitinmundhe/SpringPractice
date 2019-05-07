import com.nitsmagic.HelloWorld;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String args[]){
        //BeanFactory context = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld bean1 = (HelloWorld) context.getBean("helloWorld");
        bean1.sayHello("Bean 1");
        context.close();
        //HelloWorld bean2 = (HelloWorld) context.getBean("helloWorld");
        //bean2.sayHello("Bean 2");
    }

}
