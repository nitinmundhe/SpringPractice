package demo;

import org.springframework.stereotype.Component;

@Component
public class Performer {
    public void perform() {
        System.out.println("Actually performing...");
    }
}
