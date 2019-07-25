-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `tips` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_role_name` (`name`),
  UNIQUE KEY `unique_role_value` (`value`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('6', '管理员', 'admin', null, '2017-06-20 15:07:13', '2017-06-26 12:46:09', '1');
INSERT INTO `sys_role` VALUES ('8', '超级管理员', 'super', null, '2017-06-20 15:08:45', null, '1');
INSERT INTO `sys_role` VALUES ('17', '用户', 'user', null, '2017-06-28 18:50:39', '2017-07-21 09:41:28', '1');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `avatar` varchar(255) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(96) DEFAULT NULL,
  `salt` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_user_username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('46', null, 'super', '$2a$10$6q6PtEBdR2rYjl0kURBl4OltnjGeUjSI1cG2kMzO/eVoYESFOlKLm', null, '超级管理员', '2017-06-22 14:26:09', '1', null, null, '1', '2017-06-20 15:12:16', '2017-09-12 14:39:48');
INSERT INTO `sys_user` VALUES ('48', null, 'admin', '$2a$10$6q6PtEBdR2rYjl0kURBl4OltnjGeUjSI1cG2kMzO/eVoYESFOlKLm', null, '管理员', null, '1', null, null, '1', '2017-06-26 17:31:41', null);
INSERT INTO `sys_user` VALUES ('50', null, 'test1', '$2a$10$6q6PtEBdR2rYjl0kURBl4OltnjGeUjSI1cG2kMzO/eVoYESFOlKLm', null, 'test1', null, '1', null, null, '1', '2017-09-18 16:11:15', null);
INSERT INTO `sys_user` VALUES ('51', null, 'test2', '$2a$10$6q6PtEBdR2rYjl0kURBl4OltnjGeUjSI1cG2kMzO/eVoYESFOlKLm', null, 'test2', null, '1', null, null, '1', '2017-09-21 17:09:51', null);

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES('1','46','6',null,null);
INSERT INTO `sys_user_role` VALUES('2','46','8',null,null);
INSERT INTO `sys_user_role` VALUES('3','46','17',null,null);
INSERT INTO `sys_user_role` VALUES('4','48','6',null,null);
INSERT INTO `sys_user_role` VALUES('5','48','8',null,null);
INSERT INTO `sys_user_role` VALUES('6','50','17',null,null);
INSERT INTO `sys_user_role` VALUES('7','51','17',null,null);