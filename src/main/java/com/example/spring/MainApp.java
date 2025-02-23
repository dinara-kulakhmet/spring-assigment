package com.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MyBean myBean = context.getBean(MyBean.class);
        myBean.sayHello();

        GreetingService greetingService = context.getBean(GreetingService.class);
        greetingService.greet();

        context.close();
    }
}
