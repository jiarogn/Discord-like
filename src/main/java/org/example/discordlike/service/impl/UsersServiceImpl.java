package org.example.discordlike.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.example.discordlike.domain.UserRequestDTO;
import org.example.discordlike.domain.UsersDTO;
import org.example.discordlike.mapper.UsersMapper;
import org.example.discordlike.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
* @author 123
* @description 针对表【users】的数据库操作Service实现
* @createDate 2024-06-20 14:42:25
*/
@Slf4j
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, UsersDTO>
    implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    /*
    * 用户注册
    * */
    public void register(UserRequestDTO userRequestDTO) {
        log.info("1.用户注册-{}", userRequestDTO);
        UsersDTO user = new UsersDTO();
        user.setUsername(userRequestDTO.getUsername());
        user.setPassword(userRequestDTO.getPassword());
        user.setEmail(userRequestDTO.getEmail());
        user.setRole(userRequestDTO.getRole());
        //获取当前时间，格式化
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        log.info("2.用户注册-{}", user);
        usersMapper.insert(user);
    }
}




