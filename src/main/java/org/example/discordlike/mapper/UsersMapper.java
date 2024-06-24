package org.example.discordlike.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.discordlike.domain.UsersDTO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 123
* @description 针对表【users】的数据库操作Mapper
* @createDate 2024-06-20 14:42:25
* @Entity generator.domain.Users
*/
@Mapper
public interface UsersMapper extends BaseMapper<UsersDTO> {

}




