
package com.springframework.rest.example.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Info implements Serializable {

    public String seed;
    public Integer results;
    public Integer page;
    public String version;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = -6497815111381686970L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
