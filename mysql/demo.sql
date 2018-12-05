/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2018-12-05 16:25:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `gid` int(10) NOT NULL AUTO_INCREMENT,
  `gname` varchar(20) NOT NULL,
  `gprice` float(18,2) NOT NULL,
  `gnum` int(11) NOT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '人', '1.02', '1');
INSERT INTO `goods` VALUES ('3', '力量', '100.00', '55');
INSERT INTO `goods` VALUES ('4', '人', '100.00', '1');
INSERT INTO `goods` VALUES ('5', '明明', '100.00', '20');
INSERT INTO `goods` VALUES ('6', '伟伟', '100.00', '22');
INSERT INTO `goods` VALUES ('7', 'haha ', '2.22', '33');
INSERT INTO `goods` VALUES ('9', '小米', '56.00', '88');
INSERT INTO `goods` VALUES ('10', '笑你个胖子', '0.01', '1');

-- ----------------------------
-- Table structure for `gsales`
-- ----------------------------
DROP TABLE IF EXISTS `gsales`;
CREATE TABLE `gsales` (
  `gsid` int(10) NOT NULL AUTO_INCREMENT,
  `gid` int(10) NOT NULL,
  `sid` int(10) NOT NULL,
  `sdate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `snum` int(11) NOT NULL,
  PRIMARY KEY (`gsid`),
  KEY `gid` (`gid`),
  KEY `sid` (`sid`),
  CONSTRAINT `gsales_ibfk_1` FOREIGN KEY (`gid`) REFERENCES `goods` (`gid`),
  CONSTRAINT `gsales_ibfk_2` FOREIGN KEY (`sid`) REFERENCES `salesman` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gsales
-- ----------------------------

-- ----------------------------
-- Table structure for `salesman`
-- ----------------------------
DROP TABLE IF EXISTS `salesman`;
CREATE TABLE `salesman` (
  `sid` int(10) NOT NULL AUTO_INCREMENT,
  `sname` varchar(10) NOT NULL,
  `spassword` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salesman
-- ----------------------------
INSERT INTO `salesman` VALUES ('1', '郑明明', '123456');
