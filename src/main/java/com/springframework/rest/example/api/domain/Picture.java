
package com.springframework.rest.example.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Picture implements Serializable {

    public String large;
    public String medium;
    public String thumbnail;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = 2192873923250287621L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
