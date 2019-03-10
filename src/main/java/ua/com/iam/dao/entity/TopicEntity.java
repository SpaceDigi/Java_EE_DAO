package ua.com.iam.dao.entity;


import javax.persistence.*;

@Entity
@Table(name = "topics")
public class TopicEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "topic_name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private UserEntity owner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserEntity getOwner() {
        return owner;
    }

    public void setOwner(UserEntity owner) {
        this.owner = owner;
    }
}
