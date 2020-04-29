
package com.springframework.rest.example.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Coordinates implements Serializable {

    public String latitude;
    public String longitude;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = -2363904716824303874L;

}
