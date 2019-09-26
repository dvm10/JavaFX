-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: addressbook
-- ------------------------------------------------------
--

DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `dbpersonID` int(11) NOT NULL AUTO_INCREMENT,
  `dbfirstName` varchar(64) DEFAULT NULL,
  `dblastName` varchar(64) DEFAULT NULL,
  `dbstreet` varchar(64) DEFAULT NULL,
  `dbpostalCode` int(11) DEFAULT NULL,
  `dbcity` varchar(64) DEFAULT NULL,
  `salary`  DECIMAL(10,2) DEFAULT NULL,
  PRIMARY KEY (`dbpersonID`)
) AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;



LOCK TABLES `person` WRITE;

INSERT INTO `person` VALUES (1,'Masudur','Rahman','Ver king drive',18002,'Galloway', 8000.00),(5,'Tina','Ray','Ver king drive',18002,'Galloway', 7000.00),
(9,'Jack','Tom','Ver king drive',08089,'Egg Harbor', 110000.00),(19,'Jimmy','Beck','Balam Drive',08034,'Cherry Hill', 89760.00);

UNLOCK TABLES;

