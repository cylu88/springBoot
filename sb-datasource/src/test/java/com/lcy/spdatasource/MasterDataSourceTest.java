package com.lcy.spdatasource;

import com.lcy.spdatasource.domain.UserDTO;
import com.lcy.spdatasource.mapper.UserDTOMapper;
import com.lcy.spdatasource.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MasterDataSourceTest {

    @Autowired
    UserDTOMapper userDTOMapper;
    @Test
    public void masterTest(){
        UserDTO user = userDTOMapper.selectByPrimaryKey(2L);
        System.out.println("查询结果user:"+user);
    }

    @Autowired
    UserService userService;

    @Test
    public void updateTest() {
        UserDTO user = userDTOMapper.selectByPrimaryKey(2L);
        System.out.println("查询结果user:"+user);
        user.setName("123123");
        userService.update(user);
        user = userDTOMapper.selectByPrimaryKey(2L);
        System.out.println("查询结果user:"+user);
    }
}
