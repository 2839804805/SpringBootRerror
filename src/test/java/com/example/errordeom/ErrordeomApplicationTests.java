package com.example.errordeom;

import com.example.errordeom.bean.RoncooUser;
import com.example.errordeom.dao.RoncooUserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErrordeomApplicationTests {
    @Autowired
    private RoncooUserDao roncooUserDao;

    @Test
    public void contextLoads() {
        RoncooUser roncooUser = new RoncooUser();
        roncooUser.setName("王二名1");
        roncooUser.setCreateTime(new Date());
        roncooUserDao.save(roncooUser);
    }

    @Test
    public void update(){
        RoncooUser roncooUse = new RoncooUser();
        roncooUse.setId(1);
        roncooUse.setName("哈哈哈");

    }

    @Test
    public void del(){
        roncooUserDao.deleteById(1);
    }

    @Test
    public void find(){

        System.out.println(roncooUserDao.findByName("王二名"));
    }

}
