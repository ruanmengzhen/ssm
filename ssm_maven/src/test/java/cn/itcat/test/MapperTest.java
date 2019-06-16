package cn.itcat.test;

import cn.itcast.domain.Items;
import cn.itcast.mapper.ItemsMapper;
import cn.itcast.seervice.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperTest {

    //测试mapper接口
    @Test
    public void test1(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsMapper itemsMapper = app.getBean(ItemsMapper.class);
        Items items = itemsMapper.findById(1);
        System.out.println(items);
    }

    //测试service层
    @Test
    public void test2(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService it = app.getBean(ItemsService.class);
        Items items = it.findById(1);
        System.out.println(items);
    }

}
