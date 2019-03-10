package ua.com.iam.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.iam.dao.entity.EmailEntity;
import ua.com.iam.dao.entity.UserEntity;
import ua.com.iam.dao.repo.EmailRepository;
import ua.com.iam.dao.repo.UserRepository;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private EmailRepository emailRepository;

    public void createUser(UserEntity userEntity) {
        repository.saveAndFlush(userEntity);
    }

    public void deleteUser(Integer id) {
        repository.delete(id);
    }

    public void deleteUser(String email) {
        UserEntity entity = repository.findByEmail(email);
        repository.delete(entity);
    }

    public void updateUser(UserEntity entity) {
        repository.saveAndFlush(entity);
    }

    public UserEntity getUser(String email) {
        return repository.findByEmail(email);
    }

    public UserEntity getUser(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public EmailEntity getEmail(String email) {
        return emailRepository.findByEmail(email);
    }

    @Override
    public EmailEntity getEmail(Integer id) {
        return emailRepository.findOne(id);
    }

}
