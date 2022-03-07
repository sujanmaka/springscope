package edu.cs544.sujan.spring.scopes;

import edu.cs544.sujan.spring.scopes.services.EmailServicePractice;
import edu.cs544.sujan.spring.scopes.services.PrototypeDestroy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("App start");

        ApplicationContext context = new ClassPathXmlApplicationContext("configPractice.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigPractice.class);

        System.out.println("Before bean initialization");

        EmailServicePractice emailServicePractice = context.getBean(EmailServicePractice.class);
        EmailServicePractice emailServicePractice1 = context.getBean(EmailServicePractice.class);
        EmailServicePractice emailServicePractice2 = context.getBean(EmailServicePractice.class);
        EmailServicePractice emailServicePractice3 = context.getBean(EmailServicePractice.class);

        System.out.println(emailServicePractice.getLogger());
        System.out.println(emailServicePractice1.getLogger());
        System.out.println(emailServicePractice2.getLogger());
        System.out.println(emailServicePractice3.getLogger());
//
//        emailServicePractice.log();
//
//        //prototype destory method call, need when scope is "prototype"
//        PrototypeDestroy prototypeDestroy = context.getBean(PrototypeDestroy.class);
//        try {
//            prototypeDestroy.destroy();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("****************");

//        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
////        ApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//
//        System.out.println("Before getting bean");
//        EmailService emailService = springContext.getBean(EmailService.class);
//        EmailService emailService1 = springContext.getBean(EmailService.class);
//        EmailService emailService2 = springContext.getBean(EmailService.class);
//        EmailService emailService3 = springContext.getBean(EmailService.class);
//
//        System.out.println(emailService);
//        System.out.println(emailService1);
//        System.out.println(emailService2);
//        System.out.println(emailService3);

//        System.out.println(emailService.getLogger());
//        System.out.println(emailService1.getLogger());
//        System.out.println(emailService2.getLogger());
//        System.out.println(emailService3.getLogger());

//        ApplicationContext springContext1 = new AnnotationConfigApplicationContext(SpringConfig.class);
//        EmailService emailService1 = springContext1.getBean(EmailService.class);
//        emailService1.sendEmail();

        System.out.println("App end");
    }
}
