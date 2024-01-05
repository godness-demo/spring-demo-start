package org.wsa.service.impl;

import org.wsa.service.CustomerService;

public class CustomerServiceImpl2 implements CustomerService {
    @Override
    public void save() {
        System.out.println("-保存客户-CustomerServiceImpl2");
    }
}
