package org.wsa.controller.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wsa.controller.CustomerController;
import org.wsa.controller.UserController;

public class CustomerControllerTest {

    @Test
    public void testSave() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        CustomerController customerController = context.getBean("customerController", CustomerController.class);
//        customerController.save();
        UserController userController = context.getBean("userController",UserController.class);
        userController.insert();
    }
}
