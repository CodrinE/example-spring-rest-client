
package com.springframework.rest.example.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Result implements Serializable {

    public String gender;
    public Name name;
    public Location location;
    public String email;
    public Login login;
    public Dob dob;
    public Registered registered;
    public String phone;
    public String cell;
    public Id id;
    public Picture picture;
    public String nat;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = 8942009791493839939L;

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
