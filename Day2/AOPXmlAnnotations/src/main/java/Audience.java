import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* Performer.perform(..))")
    public void performance() {
    }

    public Audience() {
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("takeSeats...");
    }

    @Before("performance()")
    public void turnOffCellPhones() {
        System.out.println("turnOffCellPhones...");
    }

    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("applaud...");
    }

    @AfterThrowing("performance()")
    public void demandForRefund() {
        System.out.println("demandForRefund...");
    }
}
