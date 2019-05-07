import com.nitsmagic.HelloWorld;
import com.nitsmagic.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
    @Bean(initMethod = "myinit", destroyMethod = "mydestroy")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
}
