package com.nitsmagic;

public class HelloWorldImpl implements HelloWorld {
    private String name;

    static {
        System.out.println(" Inside Static Block. ");
    }

    //Default Constructor
    public HelloWorldImpl() {
        System.out.println(" Inside Constructor. ");
    }

    //Overloaded Parameterised Constructor
    public HelloWorldImpl(String name) {
        this.name = name;
        System.out.println(" Inside parameterised Constructor. ");
    }

    public void myinit() {
        System.out.println("Inside init!!!");
    }

    public void mydestroy() {
        System.out.println("Inside Destory!!!");
    }

    public void sayHello(String name) {
        System.out.println(" Hello " + name + "!!!");
    }
}
