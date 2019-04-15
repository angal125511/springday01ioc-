package com.zrzy.test;

import com.zrzy.entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/15
 * Time: 14:55
 */
public class SpringTest {

    /**
     * SpringIOC的三种注入方式
     *  1.setter
     *  2.构造方法
     *  3.factory 注入(静态工厂，非静态工厂)
     **/

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        // setter注入
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);

        // 构造方法注入
        User user2 = applicationContext.getBean("user2", User.class);
        System.out.println(user2);

        // 索引注入
        User user3 = applicationContext.getBean("user3", User.class);
        System.out.println(user3);

        // 联合注入
        User user4= applicationContext.getBean("user4", User.class);
        System.out.println(user4);

        // 非静态工厂
        User user5= applicationContext.getBean("user5", User.class);
        System.out.println(user5);

        // 静态工厂
        User user6= applicationContext.getBean("user6", User.class);
        System.out.println(user6);
    }


}
