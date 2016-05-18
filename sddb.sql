-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: sddb
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `obstruction`
--

DROP TABLE IF EXISTS `obstruction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `obstruction` (
  `obstructionlocation` varchar(255) DEFAULT NULL,
  `obstructiondate` datetime DEFAULT CURRENT_TIMESTAMP,
  `obstructiondescription` varchar(255) DEFAULT NULL,
  `idobstruction` int(11) NOT NULL AUTO_INCREMENT,
  `Lat` float DEFAULT NULL,
  `lng` float DEFAULT NULL,
  PRIMARY KEY (`idobstruction`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `obstruction`
--

LOCK TABLES `obstruction` WRITE;
/*!40000 ALTER TABLE `obstruction` DISABLE KEYS */;
INSERT INTO `obstruction` VALUES ('florida atlantic university boca raton','2016-05-02 12:50:08','Fallen Trees',1,26.3775,-80.1045),('palm beach state college','2016-05-02 12:50:08','Potholes',2,26.3763,-80.0989),('Boca Raton Town Center','2016-05-02 12:50:08','Accident In Lot',3,26.3683,-80.1289),('North university drive boca raton','2016-05-02 12:57:55','accident',4,26.3746,-80.1033),('chipotle on glades road boca raton','2016-05-02 12:57:55','fallen trees',5,26.368,-80.168),('777 Glades Road, Boca Raton','2016-05-02 14:05:38','missing sign',6,26.3706,-80.1033),('link university, boca raton, florida','2016-05-02 14:08:26','potholes',7,26.3685,-80.0974),('lynn university, boca raton, florida','2016-05-02 14:10:31','pothole',8,26.3846,-80.1214),('671 NE 195 ST 33179','2016-05-03 21:49:10','fallen tree',9,25.9556,-80.1889);
/*!40000 ALTER TABLE `obstruction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'sddb'
--

--
-- Dumping routines for database 'sddb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-03 22:35:03
