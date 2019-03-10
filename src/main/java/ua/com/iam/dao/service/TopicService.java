package ua.com.iam.dao.service;

import ua.com.iam.dao.entity.TopicEntity;

import java.util.List;

public interface TopicService {

    void createTopic(TopicEntity entity);

    void updateTopic(TopicEntity entity);

    List<TopicEntity> getTopicByOwnerEmail(String email);

    TopicEntity getTopicByTopicName(String name);
}
