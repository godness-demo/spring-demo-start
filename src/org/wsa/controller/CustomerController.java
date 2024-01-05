package org.wsa.controller;

import org.wsa.service.CustomerService;

public class CustomerController {

    //1.声明一个父接口的引用
    private CustomerService customerService;

    //2.通过set方法注入对象，我们将通过方法注入对象的方式称为依赖注入
    public void setCustomerService(CustomerService customerService){
        this.customerService = customerService;
    }

    public void save(){
        //调用服务方的方法
        customerService.save();
    }
}
