/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : wxche

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2016-09-13 11:29:56
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
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`car_id`),
  UNIQUE KEY `index_car` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车信息';

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
  `wx_id` varchar(20) NOT NULL COMMENT '微信号',
  `wx_name` varchar(50) DEFAULT NULL COMMENT '微信名',
  `user_sign` varchar(2) DEFAULT NULL COMMENT '用户标识位，0-默认用户，1-车主',
  `user_route` int(2) DEFAULT NULL COMMENT '用户路线（枚举）',
  `create_time` datetime DEFAULT NULL,
  `remark2` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_id`,`wx_id`),
  UNIQUE KEY `index_user` (`wx_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户信息';

-- ----------------------------
-- Table structure for route_infos
-- ----------------------------
DROP TABLE IF EXISTS `route_infos`;
CREATE TABLE `route_infos` (
  `info_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'pkid',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `car_id` bigint(20) NOT NULL COMMENT '车辆id',
  `route_date` varchar(10) NOT NULL COMMENT '出发日期',
  `route_time` varchar(10) NOT NULL COMMENT '出发时间',
  `route_info` varchar(200) NOT NULL COMMENT '路线信息',
  `route_from` int(2) DEFAULT NULL COMMENT '出发地(枚举)',
  `route_to` int(2) DEFAULT NULL COMMENT '目的地(枚举)',
  `creatr_time` datetime DEFAULT NULL COMMENT '创建时间',
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`info_id`,`route_date`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
