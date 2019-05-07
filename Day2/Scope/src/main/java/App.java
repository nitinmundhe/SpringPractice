public class App {
    public static void main(String[] args){
        App1 app1 =new App1();
        App2 app2 =new App2();
        App3 app3 =new App3();
        App4 app4 =new App4();
        System.out.println("Singleton - Singleton");
        app1.executeCase();
        System.out.println("Singleton - Prototype");
        app2.executeCase();
        System.out.println("Prototype - Singleton");
        app3.executeCase();
        System.out.println("Prototype - Prototype");
        app4.executeCase();
    }
}

