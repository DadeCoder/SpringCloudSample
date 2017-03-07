package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Dade on 2017/3/6.
 */
@Configuration
@EnableWebSecurity
//@ComponentScan("com.dade")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    HunterUserRepository repository;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//        auth.inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER");
        auth.userDetailsService(new HunterUserSecurityServices(repository));

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
//        http.authorizeRequests().anyRequest().authenticated().and().formLogin();
////        http.authorizeRequests().anyRequest().authenticated().and().formLogin();
        http
////                .formLogin()
////                .and()
////                .httpBasic()
////                .and()
                .authorizeRequests()
//                .antMatchers("/api/private/**").authenticated()
                .antMatchers("/api/private/**").authenticated().and().formLogin().loginPage("http://localhost:8000/login.html").and().authorizeRequests()
                .antMatchers("/api/public/**").permitAll();
//                .anyRequest().permitAll();
        http.csrf().disable();
    }




}
