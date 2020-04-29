
package com.springframework.rest.example.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Dob implements Serializable {

    public String date;
    public Integer age;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = -4915420511129144477L;
}
