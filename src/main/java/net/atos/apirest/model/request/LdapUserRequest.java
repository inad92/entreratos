package net.atos.apirest.model.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class LdapUserRequest {

    @NotNull
    private String das;

    @NotNull
    private String password;

}
