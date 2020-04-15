package io.seata.sample.service;

import io.seata.sample.dao.OrdersDao;
import io.seata.sample.entity.Orders;
//import io.seata.sample.feign.AccountApi;
//import io.seata.sample.feign.StorageApi;
//import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Liker
 */
@Service("orderServiceImpl")
public class OrderServiceImpl implements OrderService{

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrdersDao ordersDao;
//    @Autowired
//    private StorageApi storageApi;
//    @Autowired
//    private AccountApi accountApi;

    /**
     * a创建订单
     * @param order
     * @return
     *a 测试结果：
     * 1.a添加本地事务：仅仅扣减库存
     * 2.a不添加本地事务：创建订单，扣减库存
     */
    @Override
//    @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
    public void create(Orders orders) {
    	
    	//a本地方法
        LOGGER.info("------->交易开始");
        ordersDao.create(orders);

        //a远程方法 扣减库存
        LOGGER.info("------->扣减库存开始");
//        storageApi.decrease(orders.getProductid(), orders.getCountnum());
        LOGGER.info("------->扣减库存结束");

        //a远程方法 扣减账户余额
        LOGGER.info("------->扣减账户开始");
//        accountApi.decrease(orders.getUserid(), orders.getMoney());
        LOGGER.info("------->扣减账户结束");

        LOGGER.info("------->交易结束");
    }

}
