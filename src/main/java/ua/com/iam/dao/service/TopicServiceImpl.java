package ua.com.iam.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import ua.com.iam.dao.entity.TopicEntity;
import ua.com.iam.dao.repo.TopicRepository;

import java.util.List;

public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicRepository repository;

    @Override
    public void createTopic(TopicEntity entity) {
        repository.saveAndFlush(entity);
    }

    @Override
    public void updateTopic(TopicEntity entity) {
        repository.saveAndFlush(entity);
    }

    @Override
    public List<TopicEntity> getTopicByOwnerEmail(String email) {
        return repository.findByOwnerEmail(email);
    }

    @Override
    public TopicEntity getTopicByTopicName(String name) {
        return repository.findByName(name);
    }
}
