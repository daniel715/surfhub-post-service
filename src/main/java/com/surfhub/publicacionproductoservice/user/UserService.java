package com.surfhub.publicacionproductoservice.user;

import com.google.common.net.HttpHeaders;
import com.surfhub.publicacionproductoservice.feign.UserFeignClient;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

     private final UserFeignClient userFeignClient;


    public List<User> listUsers() {
        return userFeignClient.getUsers();
    }

    public Optional<User> findByEmail(String email) {
        System.out.println("dentro de findbyemail********");
        User user = User.builder()
                .email(email)
                .role(Role.USER)
                .build();
        System.out.println("usuario a enviar" + user);
        String authHeader = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkYW5pZWxtb250ZWxsYW5vc2xsYW1vY2FAZ21haWwuY29tIiwiaWF0IjoxNjk5MDQxNzg1LCJleHAiOjE2OTkxNjA0MDB9.m5_emhx3Ik3G6ObAj8qq4TBjO6-tx15A46-GLrfK0w4kyEk830I70AZj05L21FZHbbOdOgh79NQheLDZeAjbQw";
        return userFeignClient.findUserByEmail(user, authHeader);
    }
}

