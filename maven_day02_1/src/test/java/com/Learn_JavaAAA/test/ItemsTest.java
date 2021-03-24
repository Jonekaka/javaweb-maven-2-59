package com.learnCCC.test;

import com.learnCCC.domain.Items;
import com.learnCCC.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void findById(){
        //获取spring容器
        /*新建一个容器，创建一个实现类，配置文件，路径需在clssspath下，因为这是路径加载需要的，也是配置的原因*/
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //dao测试
        //从容器中拿到所需的dao的代理对象，返回得到接口
//        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        //调用方法
//        Items items = itemsDao.findById(1);
//        System.out.println(items.getName());/*数据库已经对应*/
        //service测试
        ItemsService itemsService = ac.getBean(ItemsService.class);
        //调用方法
        Items items = itemsService.findById(1);
        System.out.println(items.getName());
    }
}
