package com.springframework.rest.example.services;

import com.springframework.rest.example.SpringRestClientExampleApplication;
import com.springframework.rest.example.api.domain.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@SpringBootTest(classes = {SpringRestClientExampleApplication.class})
@RunWith(SpringRunner.class)
public class ApiServiceImplTest {


    @Autowired
    public ApiService apiService;

    @Test
    public void getUsers() {
        List<Result> users = apiService.getUsers(2);

        assertEquals(2, users.size());
    }
}