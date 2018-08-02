package net.atos.apirest.controller;

import net.atos.apirest.model.request.LdapUserRequest;
import net.atos.apirest.service.LdapService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/ldap")
public class LdapController {

    @Autowired
    LdapService ldapService;

    private static Logger logger = LogManager.getLogger(LdapController.class);

    public LdapController() {
        super();
    }

    @PostMapping("validate")
    public boolean validateLdap(
            @Valid
            @RequestBody
                    LdapUserRequest ldapUserRequest
    ) {
        logger.info("Petición recibida a '/ldap/validate' con el método POST");
        return ldapService.validateLdapUser(ldapUserRequest);
    }
}
