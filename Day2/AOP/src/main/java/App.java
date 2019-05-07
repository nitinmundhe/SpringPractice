import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Performer performer = (Performer) context.getBean("performer");
        performer.perform();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
