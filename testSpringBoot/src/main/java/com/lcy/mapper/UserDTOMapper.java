package com.lcy.mapper;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.lcy.model.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface UserDTOMapper {
    UserDTO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDTO dto);

    Page<UserDTO> queryByPage();
}