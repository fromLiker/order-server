package io.seata.sample.entity;

import lombok.Data;

/**
 * 订单
 * @author IT云清
 */
@Data
public class Order {

    private Integer orderid;

    private Integer userid;

    private Integer productid;

    private Integer countnum;

    private Integer money;

}
