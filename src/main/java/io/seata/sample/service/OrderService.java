package io.seata.sample.service;

import io.seata.sample.entity.Orders;

/**
 * @author Liker
 */
public interface OrderService {

    /**
     * a创建订单
     * @param order
     * @return
     */
    void create(Orders orders);
    
}
