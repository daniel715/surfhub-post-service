package com.surfhub.publicacionproductoservice.feign;

import com.surfhub.publicacionproductoservice.feignconfiguration.FeignClientConfig;
import com.surfhub.publicacionproductoservice.user.User;
import feign.Feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base-url}", configuration = FeignClientConfig.class)
public interface UserFeignClient {

    @GetMapping(value = "/list", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<User> getUsers();

    @RequestMapping(method = RequestMethod.POST, value = "/findbyemail", consumes = "application/json")
    Optional<User> findUserByEmail(@RequestBody User user,@RequestHeader("Authorization") String authHeader);


//    @PutMapping(value = "/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
//    UserDTO updateUser(@PathVariable("id") Integer id, @RequestBody UserDTO user);
//
//    @DeleteMapping(value = "/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
//    UserDTO deleteUser(@PathVariable("id") Integer id);

}
