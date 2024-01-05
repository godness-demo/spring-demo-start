package org.wsa.service.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wsa.service.HelloWorldService;

public class HelloWorldServiceTest {
    @Test
    public void testSay(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorldService helloWorldService = context.getBean(HelloWorldService.class);
        helloWorldService.say();
    }
}
