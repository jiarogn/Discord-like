package org.example.discordlike.service;

import org.example.discordlike.domain.UserRequestDTO;
import org.example.discordlike.domain.UsersDTO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 123
* @description 针对表【users】的数据库操作Service
* @createDate 2024-06-20 14:42:25
*/
public interface UsersService extends IService<UsersDTO> {
    void register(UserRequestDTO userRequestDTO);
}
