package org.wsa.pojo.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wsa.pojo.User;

public class UserTest {

    @Test
    public void testAlias(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user);
        System.out.println("-------");
        User user1 = context.getBean("user1",User.class);
        System.out.println(user1);
    }
}
