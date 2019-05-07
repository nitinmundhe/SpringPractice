import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorld implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    String message;

    public HelloWorld() {
     System.out.println("Constructor..");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Setter..");
        this.message = message;
    }

    public void myinit(){
        System.out.println("Custom Init..");
    }

    public void mydestroy(){
        System.out.println("Custom Destroy..");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName..");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext..");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory..");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet..");
        myinit();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy..");
        mydestroy();
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                '}';
    }
}
