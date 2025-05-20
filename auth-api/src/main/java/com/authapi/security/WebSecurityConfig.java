package com.authapi.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig  {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.cors(cors -> cors.disable())
                .csrf( (csrf) -> { csrf.disable();} // Desativa tela padrão do Spring Security
                ).authorizeHttpRequests((auth -> {
                    auth.requestMatchers(new AntPathRequestMatcher("/register", "POST")).permitAll()
                            .requestMatchers(new AntPathRequestMatcher("/login", "POST")).permitAll()
                            .requestMatchers(new AntPathRequestMatcher("/hello", "GET")).permitAll()
                            .requestMatchers(new AntPathRequestMatcher("/helloUser", "GET")).hasRole("USER")
                            .requestMatchers(new AntPathRequestMatcher("/helloAdmin", "GET")).hasRole("ADMIN")
                            .requestMatchers(new AntPathRequestMatcher("/helloMaster", "GET")).hasRole("MASTER")
                            .anyRequest().authenticated();
                }))
                .addFilterBefore(new AuthFilter(), UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
