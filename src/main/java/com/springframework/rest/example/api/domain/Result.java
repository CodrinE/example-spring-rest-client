
package com.springframework.rest.example.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gender",
    "name",
    "location",
    "email",
    "login",
    "dob",
    "registered",
    "phone",
    "cell",
    "id",
    "picture",
    "nat"
})
public class Result implements Serializable
{

    @JsonProperty("gender")
    public String gender;
    @JsonProperty("name")
    public Name name;
    @JsonProperty("location")
    public Location location;
    @JsonProperty("email")
    public String email;
    @JsonProperty("login")
    public Login login;
    @JsonProperty("dob")
    public Dob dob;
    @JsonProperty("registered")
    public Registered registered;
    @JsonProperty("phone")
    public String phone;
    @JsonProperty("cell")
    public String cell;
    @JsonProperty("id")
    public Id id;
    @JsonProperty("picture")
    public Picture picture;
    @JsonProperty("nat")
    public String nat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8942009791493839939L;

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
