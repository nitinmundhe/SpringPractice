import com.config.SpringConfiguration;
import com.demo.Communication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App2 {

    public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Communication app = (Communication) context.getBean("communication");
        app.communicate();
    }
}