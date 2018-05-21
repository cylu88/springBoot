package com.lcy.service;

import com.lcy.model.UserDTO;

public interface UserService {
    UserDTO query(Long id);
    
    void update(Long id,UserDTO dto);
}
