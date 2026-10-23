package com.mysite.sbb.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class SiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
}
