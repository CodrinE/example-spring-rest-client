package com.springframework.rest.example.services;

import com.springframework.rest.example.api.domain.Result;
import com.springframework.rest.example.api.domain.UserResults;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@AllArgsConstructor
public class ApiServiceImpl implements ApiService {

    RestTemplate restTemplate;

    @Override
    public List<Result> getUsers(Integer limit) {

        UserResults userResult = restTemplate.getForObject("https://randomuser.me/api/?results=" + limit, UserResults.class);
        return userResult.getResults();
    }
}
