package com.springframework.rest.example.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserResult {

    List<User> results;
}
