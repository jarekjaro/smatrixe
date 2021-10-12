package com.smatrixe.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class AuthConfig {
    @Bean
    SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        return http
                .authorizeExchange()
                .pathMatchers("/").permitAll()
                .pathMatchers("/**").permitAll()
                .anyExchange().permitAll()
                .and()
//                .formLogin().disable()
//                .httpBasic().disable()
//                .csrf().disable()
//            .logout().disable()
//            .requestCache()
//            .requestCache(NoOpServerRequestCache.getInstance())
//            .and()
//            .securityContextRepository(NoOpServerSecurityContextRepository.getInstance())
//                .cors()
//                .and()
//                .oauth2Login()
//                .and()
//            .oauth2Client {
//                it.clientRegistrationRepository(crr())
//            }
                .build();
    }
}
