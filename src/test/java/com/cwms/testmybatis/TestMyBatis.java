/**
 * 
 */
package com.cwms.testmybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cwms.model.User;
import com.cwms.service.UserService;

/**
 * @author IA-Neusoft
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    @Resource
    private UserService userService = null;

    @Test
    public void test() {
        User user = userService.getUserById(1);
        
        logger.info(user);
        logger.info("user to json");
        logger.info(JSON.toJSONString(user));
    }
}
