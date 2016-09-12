package com.wxche.platform.wechat.controller;

import com.wxche.platform.wechat.service.PinCheInfoService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Lichao.Wang on 2016/9/5.
 */
public class MybatisTest {

    @Test
    public void  TestMybatis()throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
        PinCheInfoService pinCheInfoService = (PinCheInfoService) ac.getBean("pinCheInfoService");
        pinCheInfoService.queryUsers();
    }
}
