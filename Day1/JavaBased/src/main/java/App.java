import com.nitsmagic.HelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String args[]) {
        //BeanFactory context = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld bean1 = (HelloWorld) context.getBean("helloWorld");
        bean1.sayHello("Bean 1");
        context.close();
        //HelloWorld bean2 = (HelloWorld) context.getBean("helloWorld");
        //bean2.sayHello("Bean 2");
    }

}
