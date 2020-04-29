
package com.springframework.rest.example.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Login implements Serializable
{

    public String uuid;
    public String username;
    public String password;
    public String salt;
    public String md5;
    public String sha1;
    public String sha256;
    private Map<String, Object> additionalProperties = new HashMap<>();
    private final static long serialVersionUID = 8279994215325130717L;
}
