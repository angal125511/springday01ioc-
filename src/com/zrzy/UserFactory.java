package com.zrzy;

import com.zrzy.entity.User;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: 徐大伟
 * User: ${和敬清寂}
 * Date: 2019/4/15
 * Time: 15:10
 */
public class UserFactory {

    // 非静态工厂
    public User createFactory(){

        User user = new User();
        user.setId(5);
        user.setUsername("admin555");
        user.setPassword("admin555");
        return user;
    }

    // 静态工厂
    public static User createStaticFactory(){

        User user = new User();
        user.setId(6);
        user.setUsername("admin666");
        user.setPassword("admin666");

        return user;
    }




}
