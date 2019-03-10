package ua.com.iam.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.iam.dao.entity.UserEntity;
import ua.com.iam.dao.service.UserService;

public class Main {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService service = (UserService) context.getBean("userService");
        System.out.println(service.getUser(1).getEmail());
    }
}
