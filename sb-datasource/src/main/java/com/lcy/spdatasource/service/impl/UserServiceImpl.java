package com.lcy.spdatasource.service.impl;

import com.lcy.spdatasource.domain.UserDTO;
import com.lcy.spdatasource.mapper.UserDTOMapper;
import com.lcy.spdatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDTOMapper userDTOMapper;

    @Override
    @Transactional
    public int update(UserDTO userDTO) {
        int num = userDTOMapper.updateByPrimaryKeySelective(userDTO);
//        num = 1/0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return num;
    }
}
