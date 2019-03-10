package ua.com.iam.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.iam.dao.entity.TopicEntity;
import ua.com.iam.dao.entity.UserEntity;
import ua.com.iam.dao.service.TopicService;
import ua.com.iam.dao.service.UserService;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = (UserService) context.getBean("userService");
        TopicService topicService = (TopicService) context.getBean("topicService");
        UserEntity entity = userService.getUser(1);
        System.out.println(entity.getEmail());
        //TopicEntity topicEntity = new TopicEntity();
        //topicEntity.setName("topicName1");
        //topicEntity.setOwner(entity);
        //topicEntity.setId(3);
        //topicService.createTopic(topicEntity);
        List<TopicEntity> topics = topicService.getTopicByOwnerEmail(entity.getEmail());
        System.out.println(topics.size());
    }
}
