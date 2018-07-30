package net.atos.entreratos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.DefaultDirObjectFactory;
import org.springframework.ldap.core.support.LdapContextSource;

@Configuration
public class LdapConfiguration {

    @Autowired
    private LdapProperties ldapProperties;

    @Bean
    public LdapTemplate getLdapTemplate() {
        return new LdapTemplate(getLdapContextSource());
    }

    @Bean
    public LdapContextSource getLdapContextSource() {
        LdapContextSource lcs = new LdapContextSource();
        lcs.setUrl(ldapProperties.getUrl());
        lcs.setUserDn(ldapProperties.getUser());
        lcs.setPassword(ldapProperties.getPass());
        lcs.setDirObjectFactory(DefaultDirObjectFactory.class);
        lcs.afterPropertiesSet();
        return lcs;
    }
}