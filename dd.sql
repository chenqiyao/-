/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.7.21-log : Database - kgc
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`kgc` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `kgc`;

/*Data for the table `houseinfo` */

LOCK TABLES `houseinfo` WRITE;

insert  into `houseinfo`(`houseId`,`houseDesc`,`typeId`,`monthlyRent`,`publishDate`) values (1,'月坛西街铁二中学紧邻月坛工员 朝东一居室',1,'4000元/月','2019-01-20'),(2,'天通苑东三区新出好房南北三居你值得拥有',2,'4300元/月','2019-01-20'),(3,'三元桥国展精装修两居交通便利拎包入住',3,'3900元/月','2019-01-20'),(4,'长椿街三庙大院华商场背后 紧邻长椿街地铁',2,'6000元/月','2019-01-20');

UNLOCK TABLES;

/*Data for the table `houselype` */

LOCK TABLES `houselype` WRITE;

insert  into `houselype`(`typeId`,`typeName`) values (1,'1室1厅'),(2,'3室2厅'),(3,'2室1厅');

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
