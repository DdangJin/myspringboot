package com.example.myspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.ResultSet;

@Configuration
@EnableGlobalAuthentication
public class JdbcSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

    // user -> account
    @Bean
    public UserDetailsService userDetailsService(JdbcTemplate jdbcTemplate) {
        RowMapper<User> userRowMapper = (ResultSet rs, int i) ->
                new User(
                        rs.getString("ACCOUNT_NAME"),
                        rs.getString("PASSWORD"),
                        rs.getBoolean("Enabled1"),
                        rs.getBoolean("Enabled2"),
                        rs.getBoolean("Enabled3"),
                        rs.getBoolean("Enabled4"),
                        AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN"));

        return username -> jdbcTemplate.queryForObject("SELECT * from ACCOUNT where ACCOUNT_NAME=?", userRowMapper, username);
    }

    // ignore encryption password
    @Bean
    public PasswordEncoder noOpPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(this.userDetailsService);
    }
}
