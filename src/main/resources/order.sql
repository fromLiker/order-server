CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL COMMENT '用户id',
  `productid` int(11) DEFAULT NULL COMMENT '产品id',
  `countnum` int(11) DEFAULT NULL COMMENT '数量',
  `money` int(11) DEFAULT NULL COMMENT '金额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

ALTER TABLE `orders` ADD COLUMN `tstatus` int(1) DEFAULT NULL COMMENT '1commit0rollback' AFTER `money`;
