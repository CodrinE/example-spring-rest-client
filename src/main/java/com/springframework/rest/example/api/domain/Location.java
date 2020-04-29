
package com.springframework.rest.example.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Location implements Serializable {

    public Street street;
    public String city;
    public String state;
    public String country;
    public Integer postcode;
    public Coordinates coordinates;
    public Timezone timezone;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = 6843640969270889872L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
