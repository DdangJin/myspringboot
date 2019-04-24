package com.example.myspringboot.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue
    private Integer id;
    private String description;

    @ManyToOne(fetch= FetchType.LAZY)
    @JsonIgnore
    private User user;

    @Override
    public String toString() {
        return String.format("Post [id=%s, description=%s]", id, description);
    }

}
