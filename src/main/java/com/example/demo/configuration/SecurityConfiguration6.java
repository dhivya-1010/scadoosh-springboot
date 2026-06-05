package com.example.demo.configuration;

import com.example.demo.handler.OAuthSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration6 {

    @Autowired
    private OAuthSuccessHandler oAuthSuccessHandler;

    @Bean    //the object should enter into IoC container after doing the operations
    public SecurityFilterChain securityFilterChain6(HttpSecurity http) throws Exception{

        //http.csrf(csrf-> csrf.disable());
        //http.csrf(Customizer->Customizer.disable());
        //http.authorizeHttpRequests(request->request.anyRequest().authenticated());
        http.authorizeHttpRequests(request->request.requestMatchers("/public").permitAll().anyRequest().authenticated());
        //http.formLogin(Customizer.withDefaults());   //it helps to extend the session while new session id is created in all refreshes
        //http.httpBasic(Customizer.withDefaults());
        //http.oauth2Login(Customizer.withDefaults());
        //http.sessionManagement(session->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));


        http.oauth2Login(oauth->oauth.successHandler(oAuthSuccessHandler));
        return http.build(); //convert to object
    }
}
