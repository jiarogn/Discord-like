package org.example.discordlike.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.discordlike.domain.ApiResponse;
import org.example.discordlike.domain.UserRequestDTO;
import org.example.discordlike.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UsersService usersService;

    /*
    * 用户注册：
    * 1.检查用户名是否合法，检查用户输入的密码是否合法，检查邮箱是否合法（前端做吧）；
    * 2.前端将加密后的密码返回？
    * 3.将前端传入的数据更新到数据库中
    * */
    @PostMapping("/register")
    public ApiResponse<Void> register(@RequestBody UserRequestDTO userRequestDTO) {
        log.info("用户注册：username-{}", userRequestDTO.getUsername());
        usersService.register(userRequestDTO);
        return null;
    }

}