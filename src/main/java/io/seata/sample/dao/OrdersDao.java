package io.seata.sample.dao;

import io.seata.sample.entity.Orders;
import org.springframework.stereotype.Repository;

/**
 * @author Liker
 */
@Repository
public interface OrdersDao {

    /**
     * a创建订单
     * @param order
     * @return
     */
    void create(Orders orders);
    
}
