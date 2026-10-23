package com.mysite.sbb.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<SiteUser, Long> {
}
