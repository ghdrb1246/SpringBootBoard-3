package com.mysite.sbb.user;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<SiteUser, Long> {
    Optional<SiteUser> findByusername(String username);
}
