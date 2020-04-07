package io.seata.sample.service;

import io.seata.sample.entity.Seataorder;
import java.math.BigDecimal;

/**
 * @author IT云清
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     * @return
     */
    void create(Seataorder order);

    /**
     * 修改订单状态
     * @param userId
     * @param money
     * @param status
     */
//    void update(Long userId,BigDecimal money,Integer status);
}
