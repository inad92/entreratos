package net.atos.apirest.service;

import net.atos.apirest.config.LdapProperties;
import net.atos.apirest.model.request.LdapUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.filter.AndFilter;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.stereotype.Service;

@Service
public class LdapService {

    @Autowired
    private LdapTemplate ldapTemplate;

    @Autowired
    private LdapProperties ldapProperties;

    public boolean validateLdapUser(LdapUserRequest ldapUserRequest) {
        AndFilter filter = new AndFilter()
                .and(new EqualsFilter("uid", ldapUserRequest.getDas()));

        return ldapTemplate.authenticate(ldapProperties.getEmployeeOu(), filter.toString(), ldapUserRequest.getPassword());

    }
}