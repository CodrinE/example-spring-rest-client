
package com.springframework.rest.example.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Name implements Serializable {

    public String title;
    public String first;
    public String last;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = -8001460831244581976L;

}
