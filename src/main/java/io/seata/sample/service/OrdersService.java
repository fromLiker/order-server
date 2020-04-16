package io.seata.sample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.seata.sample.dao.OrdersRepository;
import io.seata.sample.entity.OrdersEntity;

@Service
public class OrdersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrdersService.class);

    @Autowired
    private OrdersRepository ordersRepository;
    
//  @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
	public void create(OrdersEntity ordersEntity) {
		LOGGER.info("------->交易开始");
		ordersRepository.save(ordersEntity);
		LOGGER.info("------->交易结束");
	}
	  
}
