package com.lcy.spdatasource;

import com.lcy.spdatasource.domain.UserDTO;
import com.lcy.spdatasource.slavemapper.UserDTOMapper2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SalveDataSourceTest {

    @Autowired
    UserDTOMapper2 userDTOMapper2;
    @Test
    public void salveTest(){
        UserDTO user = userDTOMapper2.selectByPrimaryKey(2L);
        System.out.println("查询结果user:"+user);
    }
}
