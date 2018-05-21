package com.lcy.spdatasource.mapper;


import com.lcy.spdatasource.domain.UserDTO;

public interface UserDTOMapper {
    UserDTO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDTO dto);

}