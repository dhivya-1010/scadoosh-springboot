package com.phase6.task_management.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;

@Service
public class JwtService {

    private final SecretKey secretKey;
    private final long jwtExpiration;

    public JwtService(
            @Value("${app.jwt.secret}") String secret,
            @Value("${app.jwt.expiration}") long jwtExpiration
    ) {
        this.secretKey = Keys.hmacShaKeyFor(
                Decoders.BASE64.decode(secret)
        );

        this.jwtExpiration = jwtExpiration;
    }

    public String generateToken(UserDetails userDetails) {

        Date currentDate = new Date();

        Date expirationDate = new Date(
                currentDate.getTime() + jwtExpiration
        );

        return Jwts.builder()
                .subject(userDetails.getUsername())
                .issuedAt(currentDate)
                .expiration(expirationDate)
                .signWith(secretKey)
                .compact();
    }
    public String extractUserName(String token){
        return extractAllClaims(token).getSubject();
    }
    private Claims extractAllClaims(String token){
        return Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token).getPayload();
    }
    public boolean isTokenValid(String token, UserDetails userDetails){
        String userName = extractUserName(token);
        return userName.equals(userDetails.getUsername()) && extractAllClaims(token).getExpiration().after(new Date());
    }
    public long getJwtExpirationMillis(){
        return jwtExpiration;
    }
}