package com.springframework.rest.example.services;

import com.springframework.rest.example.api.domain.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Test
    void getUsers() {
        List<Result> users = apiService.getUsers(2);

        assertEquals(2, users.size());
    }
}