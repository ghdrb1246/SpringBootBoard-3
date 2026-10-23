package com.mysite.sbb.user;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("ROLE_ADNIN"),
    USER("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private String value;
}
