package io.seata.sample.service;

import io.seata.sample.entity.Order;
// import java.math.BigDecimal;

/**
 * @author Liker
 */
public interface OrderService {

    /**
     * a创建订单
     * @param order
     * @return
     */
    void create(Order order);

    /**
     * a修改订单状态
     * @param userId
     * @param money
     * @param status
     */
    // void update(Long userId,BigDecimal money,Integer status);
}
