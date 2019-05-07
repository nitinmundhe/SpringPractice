import org.springframework.beans.factory.annotation.Autowired;

public class Communication {

    @Autowired
    Messaging messaging;

    public Communication() {
        super();
        System.out.println("Inside Communication default constructor..");
    }

    public Communication(Messaging messaging) {
        super();
        this.messaging = messaging;
        System.out.println("Inside Communication parameterised constructor..");
    }

    public void setMessaging(Messaging messaging) {
        this.messaging = messaging;
        System.out.println("Inside setter method..");
    }

    public void communicate() {
        messaging.sendMessage();
    }
}