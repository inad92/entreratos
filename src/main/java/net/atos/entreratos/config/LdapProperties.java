package net.atos.entreratos.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "ldap")
@Data
public class LdapProperties {
    private String url;
    private String user;
    private String pass;
    private String employeeOu;
}
