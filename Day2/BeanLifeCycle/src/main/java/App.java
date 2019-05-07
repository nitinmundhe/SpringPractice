import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
        hw.getMessage();
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }
}
