package com.lcy.service.impl;

import com.lcy.mapper.UserDTOMapper;
import com.lcy.model.UserDTO;
import com.lcy.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDTOMapper userDTOMapper;

    public UserDTO query(Long id) {
        UserDTO dto = userDTOMapper.selectByPrimaryKey(id);
        return dto;
    }

    @Transactional
	@Override
	public void update(Long id,UserDTO dto) {
		dto.setId(id);
		userDTOMapper.updateByPrimaryKeySelective(dto );
		int num = 1/0;
	}
}
