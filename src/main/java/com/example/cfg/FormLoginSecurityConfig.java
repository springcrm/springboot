package com.example.cfg;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
//@EnableWebSecurity
public class FormLoginSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/").hasRole("USER")
                .and()
            .formLogin()
                   .usernameParameter("j_username") // default is username
                   .passwordParameter("j_password") // default is password
                   .loginPage("/login") // default is /login with an HTTP get
                   .failureUrl("/login?failed") // default is /login?error
                   .loginProcessingUrl("/login/process"); // default is /login with an HTTP post
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth
             .inMemoryAuthentication()
                  .withUser("user")
                       .password("password")
                       .roles("USER");
    }
}