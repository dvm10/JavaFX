-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: addressbook
--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `dbAdminSerialNo` int(11) NOT NULL AUTO_INCREMENT,
  `username`  varchar(64) DEFAULT NULL,
  `dbAdminFname` varchar(64) DEFAULT NULL,
  `dbAdminLname` varchar(64) DEFAULT NULL,
  `dbAdminEmail` varchar(64) DEFAULT NULL,
  `dbAdminPassword` varchar(64) DEFAULT 'password',
  PRIMARY KEY (`dbAdminSerialNo`)
) AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'mh01','Munir','Hasan','mh01@gmial.com','1234'),(2,'th02','Tanjina','Helaly','th02@gmail.com','1234');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

