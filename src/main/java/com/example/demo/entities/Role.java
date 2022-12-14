package com.example.demo.entities;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    private Long id;
    @Column
    private String name;

//    @ManyToMany(mappedBy = "roles")
//    private Set<User> users;

    public Role(Long id, String name, Set<User> users) {
        this.id = id;
        this.name = name;
//        this.users = users;
    }

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Role(Long id) {
        this.id = id;
    }

    public Role() {

    }

    @Override
    public String getAuthority() {
        return name;
    }
}
