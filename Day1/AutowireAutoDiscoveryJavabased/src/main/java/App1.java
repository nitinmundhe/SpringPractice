import com.demo.Communication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan("com.demo")// base package
public class App1 {

    public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(App1.class);
        Communication app = (Communication) context.getBean("communication");
        app.communicate();
    }
}