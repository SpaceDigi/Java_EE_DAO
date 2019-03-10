package ua.com.iam.dao.service;

import ua.com.iam.dao.entity.EmailEntity;
import ua.com.iam.dao.entity.UserEntity;

public interface UserService {
    void createUser(UserEntity userEntity);

    void deleteUser(Integer id);

    void deleteUser(String email);

    void updateUser(UserEntity entity);

    UserEntity getUser(String email);

    UserEntity getUser(Integer id);

    EmailEntity getEmail(String email);

    EmailEntity getEmail(Integer id);
}
