
package com.springframework.rest.example.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Location implements Serializable {

    public String street;
    public String city;
    public String state;
    public String postcode;
    public Coordinates coordinates;
    public Timezone timezone;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = -6045877426323739202L;

}
