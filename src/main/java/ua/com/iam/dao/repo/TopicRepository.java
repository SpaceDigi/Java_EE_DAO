package ua.com.iam.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.iam.dao.entity.TopicEntity;

import java.util.List;

public interface TopicRepository extends JpaRepository<TopicEntity,Integer> {
    TopicEntity findByName(String name);
    List<TopicEntity> findByOwnerEmail(String email);
}
