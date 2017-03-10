package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by Dade on 2017/3/6.
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled=true)
//@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
@EnableWebSecurity
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
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .anyRequest().authenticated()

//        http.csrf().disable();
//        http.cors().disable();
            ;
    }

//        http
//                .authorizeRequests().anyRequest().permitAll()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/api/private/**").authenticated().and().formLogin().loginPage("/login").permitAll();



//                .antMatchers("/api/private/**").authenticated().and().formLogin().and().authorizeRequests()
//                .antMatchers("/api/private/**").authenticated().and().formLogin().loginPage("http://localhost:8003/login.html").and().authorizeRequests()
//                .anyRequest().permitAll();
//        http.authorizeRequests().anyRequest().authenticated().and().formLogin();
////        http.authorizeRequests().anyRequest().authenticated().and().formLogin();
}
