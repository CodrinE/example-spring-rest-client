
package com.springframework.rest.example.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Id implements Serializable
{

    public String name;
    public String value;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = -6549247506352542291L;
}
