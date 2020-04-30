package com.springframework.rest.example.services;

import com.springframework.rest.example.api.domain.Result;
import com.springframework.rest.example.api.domain.UserResults;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApiServiceImpl implements ApiService {

    private final RestTemplate restTemplate;

    @Value("${api.url}")
    private String api_url;

    @Override
    public List<Result> getUsers(Integer limit) {

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder
                .fromUriString(api_url)
                .queryParam("results", limit);

        UserResults userResults = restTemplate.getForObject(uriComponentsBuilder.toUriString(), UserResults.class);

        return userResults.getResults();
    }
}
