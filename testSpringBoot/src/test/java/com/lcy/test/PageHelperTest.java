package com.lcy.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lcy.domain.PageBase;
import com.lcy.mapper.UserDTOMapper;
import com.lcy.model.UserDTO;
import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.Max;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PageHelperTest {


    @Autowired
    UserDTOMapper userDTOMapper;

    @Test
    public void queryByPage(){

        int currentPage = 1;
        int pageSize = 2;
        PageHelper.startPage(currentPage, pageSize);
        Page<UserDTO> page = userDTOMapper.queryByPage();
        System.out.println("查询结果:"+page);
        PageInfo<UserDTO> pageInfo = new PageInfo<UserDTO>(page);
        System.out.println("pageInfo:"+pageInfo);
        PageBase<UserDTO> result = new PageBase<UserDTO>(page.getPageNum(), page.getPageSize(), page.getPages(), Integer.parseInt(page.getTotal() + ""), page.getResult());
        System.out.println("result:"+result);
    }
}
