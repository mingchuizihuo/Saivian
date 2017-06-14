CREATE TABLE `picture` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `picture_address` varchar(200) NOT NULL COMMENT '地址',
  `picture_type` tinyint(4) NOT NULL COMMENT '图片类型 1，员工头像',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='图片表';