package net.atos.apirest.model;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class LdapUserRequest {

    @NotNull
    private String das;

    @NotNull
    private String password;

}
