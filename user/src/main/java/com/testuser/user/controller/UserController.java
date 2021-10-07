package com.testuser.user.controller;

import com.testuser.user.entity.Contact;
import com.testuser.user.entity.Department;
import com.testuser.user.entity.User;
import com.testuser.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @PostMapping("/saveuser")
    public User saveUserDetails(@RequestBody User user) {
        return userService.saveUserDetails(user);

    }

    @GetMapping("/getuser/{userId}")
    public User getUserDetails(@PathVariable("userId") Long userId) {
        User user = userService.getUserDetails(userId);
        List<Contact> contactList = restTemplate.getForObject("http://CONTACT-SERVICE/contact/user/" + user.getUserId(), List.class);
        List<Department> departmentList = webClientBuilder.build().get()
                        .uri("http://DEPARTMENT-SERVICE/department/getdepartment/"+ user.getUserId()).retrieve().bodyToMono(List.class).block();
        user.setContact(contactList);
        user.setDepartment(departmentList);
        return user;
    }

}
