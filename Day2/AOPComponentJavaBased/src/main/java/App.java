import demo.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "demo")
public class App {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        Performer performer = (Performer) context.getBean("performer");
        performer.perform();
        ((AnnotationConfigApplicationContext) context).close();
    }
}
