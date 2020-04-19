package io.seata.sample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.seata.sample.dao.OrdersRepository;
import io.seata.sample.entity.OrdersEntity;
import io.seata.sample.feign.AccountApi;
import io.seata.sample.feign.StorageApi;
import io.seata.spring.annotation.GlobalTransactional;

@Service
public class OrdersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrdersService.class);

    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private StorageApi storageApi;
    @Autowired
    private AccountApi accountApi;
    
    // a不加注解则不会发生事务回滚
    // @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
	public void create(OrdersEntity ordersEntity) {
		LOGGER.info("------->交易开始");
		ordersRepository.save(ordersEntity);
		
        //a远程方法 扣减库存
        LOGGER.info("------->扣减库存开始");
        storageApi.decrease(ordersEntity.getProductid(), ordersEntity.getCountnum());
        LOGGER.info("------->扣减库存结束");

        //a远程方法 扣减账户余额
        LOGGER.info("------->扣减账户开始");
        int restatus = ordersEntity.getTstatus();
        if(restatus==1) {
       	accountApi.decreasen(ordersEntity.getUserid(), ordersEntity.getMoney());
        } else {
       	accountApi.decrease(ordersEntity.getUserid(), ordersEntity.getMoney());
        }
        
        LOGGER.info("------->扣减账户结束");
        
		LOGGER.info("------->交易结束");
	}
    
    // @GlobalTransactional(name = "fsp-createnormal-order", rollbackFor = Exception.class)
//	public void createn(OrdersEntity ordersEntity) {
//		LOGGER.info("------->交易开始");
//		ordersRepository.save(ordersEntity);
//		
//        //a远程方法 扣减库存
//        LOGGER.info("------->扣减库存开始");
//        storageApi.decrease(ordersEntity.getProductid(), ordersEntity.getCountnum());
//        LOGGER.info("------->扣减库存结束");
//
//        //a远程方法 扣减账户余额
//        LOGGER.info("------->扣减账户开始");
//        accountApi.decreasen(ordersEntity.getUserid(), ordersEntity.getMoney());
//        LOGGER.info("------->扣减账户结束");
//        
//		LOGGER.info("------->交易结束");
//	}
	  
}
