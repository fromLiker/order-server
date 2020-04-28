package io.seata.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.seata.sample.entity.OrdersEntity;
import io.seata.sample.service.OrdersService;

@CrossOrigin
@RestController
//@RequestMapping(value = "orders/create")
public class OrdersController {
	
    @Autowired
    private OrdersService ordersService;
    
//    @GetMapping("create")
//    public String create(OrdersEntity ordersEntity){
//    	ordersService.create(ordersEntity);
//        return "Create order success";
//    }
//    
	@PostMapping("orders/create")
	public String create(@RequestBody OrdersEntity ordersEntity) {
		ordersService.create(ordersEntity);
        return "Create order success";
	}

}
