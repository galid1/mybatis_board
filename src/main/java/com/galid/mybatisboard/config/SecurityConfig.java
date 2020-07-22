package com.galid.mybatisboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.header.writers.frameoptions.WhiteListedAllowFromStrategy;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .cors().disable()
                .authorizeRequests()
                    .antMatchers("/auth/**", "/h2-console/**")
                    .permitAll()
                    .anyRequest()
                    .authenticated()
                    .and()
                .headers()
                    .addHeaderWriter(
                            new XFrameOptionsHeaderWriter(
                                    new WhiteListedAllowFromStrategy(Arrays.asList("localhost"))    // 여기!
                            )
                    )
                    .frameOptions().sameOrigin()
                    .and()
                .formLogin()
                    .loginPage("/auth/signIn")
                    .usernameParameter("authId")
                    .passwordParameter("password")
                    .loginProcessingUrl("/auth/doLogin");
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
