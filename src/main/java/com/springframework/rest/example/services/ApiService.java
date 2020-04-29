package com.springframework.rest.example.services;

import com.springframework.rest.example.api.domain.Result;

import java.util.List;

public interface ApiService {

    List<Result> getUsers(Integer limit);
}
