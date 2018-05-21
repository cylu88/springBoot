package com.lcy.test;

import com.lcy.mapper.UserDTOMapper;
import com.lcy.model.UserDTO;
import com.lcy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @MockBean
    private Runner runner;

    @Autowired
    UserService userService;

    @Test
    public void transTest() throws Exception {
        try {
            UserDTO user = userService.query(2L);
            System.out.println("查询结果:"+user);

            UserDTO dto = new UserDTO();
            dto.setName("123");
            userService.update(2L,dto);

            user = userService.query(2L);
            System.out.println("查询结果:"+user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Autowired
    UserDTOMapper userDTOMapper;
    @Test
    public void TestBasePackage(){
        try {
            UserDTO user = userDTOMapper.selectByPrimaryKey(2L);
            System.out.println("查询结果:"+user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
