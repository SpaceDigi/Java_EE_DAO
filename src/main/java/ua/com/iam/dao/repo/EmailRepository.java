package ua.com.iam.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.iam.dao.entity.EmailEntity;

@Repository
public interface EmailRepository extends JpaRepository<EmailEntity, Integer> {
    EmailEntity findByEmail(String email);
}
