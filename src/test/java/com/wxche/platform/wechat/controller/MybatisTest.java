package com.wxche.platform.wechat.controller;

import com.wxche.platform.wechat.repository.model.RouteInfos;
import com.wxche.platform.wechat.service.PinCheInfoService;
import com.wxche.platform.wechat.utils.GsonUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Lichao.Wang on 2016/9/5.
 */
public class MybatisTest {

    @Test
    public void  TestMybatis()throws Exception{
        //ApplicationContext ac = new ClassPathXmlApplicationContext("/applicationContext.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        PinCheInfoService pinCheInfoService = (PinCheInfoService) context.getBean("pinCheInfoService");
        List<RouteInfos> routeInfoses = pinCheInfoService.queryRouteInfos();
        System.err.println(GsonUtil.toJson(routeInfoses));
    }
}
