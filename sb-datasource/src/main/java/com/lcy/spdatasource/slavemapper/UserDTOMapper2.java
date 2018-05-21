package com.lcy.spdatasource.slavemapper;


import com.lcy.spdatasource.domain.UserDTO;

public interface UserDTOMapper2 {
    UserDTO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDTO dto);

}