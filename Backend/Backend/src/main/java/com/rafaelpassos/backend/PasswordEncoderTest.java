package com.rafaelpassos.backend;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderTest {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "1q2w3e4r"; // Substitua pela senha que você deseja codificar
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println(encodedPassword);
    }
}

