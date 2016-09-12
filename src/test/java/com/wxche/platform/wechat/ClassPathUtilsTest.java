package com.wxche.platform.wechat;

import com.wxche.platform.wechat.annotation.MessageWorker;
import com.wxche.platform.wechat.handler.AbstractMessageHandler;
import com.wxche.platform.wechat.utils.ClassPathUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

/**
 * Created by lichao.W on 2016/8/13 9:20.
 */
public class ClassPathUtilsTest {

    @Test
    public void testLoadClass() {

        Class<?> aClass = ClassPathUtils.loadClass("Foo", true);

        Assert.assertNotNull(aClass);

    }


    @Test
    public void testGetClassesInPath() {
        Set<Class<?>> classesInPath = ClassPathUtils.getClassesInPath("");
        System.out.println("classesInPath:==>" + classesInPath);
        Assert.assertTrue(!classesInPath.isEmpty());
    }

    @Test
    public void testGetClassByAnnotation() {
        Set<Class<? extends AbstractMessageHandler>> classesByAnnotation =
                ClassPathUtils.getClassesByAnnotation(MessageWorker.class);
        System.out.println(classesByAnnotation);
    }


}
