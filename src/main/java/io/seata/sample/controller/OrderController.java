package io.seata.sample.controller;

import io.seata.sample.entity.Orders;
import io.seata.sample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liker
 */
@RestController
@RequestMapping(value = "orders")
public class OrderController {

    @Autowired
    private OrderService orderServiceImpl;

    /**
     *a 创建订单
     * @param order
     * @return
     */
    @GetMapping("create")
    public String create(Orders orders){
        orderServiceImpl.create(orders);
        return "Create order success";
    }

}
