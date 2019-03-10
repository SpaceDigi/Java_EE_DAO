package ua.com.iam.dao.entity;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "email")
    private String email;

    @Column(name = "pass")
    private String password;

    @OneToMany(cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    @JoinColumn(name = "user_topic_id")
    private List<TopicEntity> topics;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TopicEntity> getTopics() { return topics; }

    public void setTopics(List<TopicEntity> topics) {this.topics = topics;}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
