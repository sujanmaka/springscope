package edu.cs544.sujan.spring.scopes.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireconfig.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(AutowireConfig.class);
        Game game = context.getBean(Game.class);
        game.play();
    }
}
