/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : wxche

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2016-09-09 14:00:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for foo_cars
-- ----------------------------
DROP TABLE IF EXISTS `foo_cars`;
CREATE TABLE `foo_cars` (
  `car_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '车id',
  `user_id` varchar(20) NOT NULL COMMENT '车主id',
  `user_nick_name` varchar(20) DEFAULT NULL COMMENT '车主昵称',
  `car_model` varchar(50) DEFAULT NULL COMMENT '车型号',
  `car_seat` varchar(2) DEFAULT NULL COMMENT '座位数',
  `buy_year` varchar(10) DEFAULT NULL,
  `remark1` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`car_id`),
  UNIQUE KEY `index_car` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车信息';

-- ----------------------------
-- Records of foo_cars
-- ----------------------------

-- ----------------------------
-- Table structure for foo_users
-- ----------------------------
DROP TABLE IF EXISTS `foo_users`;
CREATE TABLE `foo_users` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_nick_name` varchar(50) DEFAULT NULL COMMENT '用户昵称，默认和微信昵称一致',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名字',
  `user_mobile` varchar(20) DEFAULT NULL COMMENT '用户手机号',
  `user_sex` varchar(2) DEFAULT NULL COMMENT '用户性别',
  `user_certid` varchar(20) DEFAULT NULL COMMENT '用户身份证号',
  `wx_id` varchar(20) DEFAULT NULL COMMENT '微信号',
  `wx_name` varchar(50) DEFAULT NULL COMMENT '微信名',
  `user_sign` varchar(2) DEFAULT NULL COMMENT '用户标识位，0-默认用户，1-车主',
  `remark1` varchar(100) DEFAULT NULL,
  `remark2` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `index_user` (`wx_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户信息';

-- ----------------------------
-- Records of foo_users
-- ----------------------------
INSERT INTO `foo_users` VALUES ('1', 'test', 'test', '13105321973', '2', '220183', 'test', 'test', '0', null, null);
