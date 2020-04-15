package io.seata.sample.entity;

import lombok.Data;

/**
 * a订单
 * @author Liker
 */
@Data
public class Orders {

    private Integer id;

    private Integer userid;

    private Integer productid;

    private Integer countnum;

    private Integer money;

}
