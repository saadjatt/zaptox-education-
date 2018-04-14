/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.1.19-MariaDB : Database - server_login
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`server_login` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `server_login`;

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(100) NOT NULL,
  `c_duration` varchar(100) NOT NULL,
  `c_fee` double NOT NULL,
  `c_status` int(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `course` */

insert  into `course`(`c_id`,`c_name`,`c_duration`,`c_fee`,`c_status`) values (1,'Java','4',3000,1),(2,'PHP','4',4000,1);

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `roll` enum('Admin','Teacher') NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`id`,`name`,`password`,`roll`) values (1,'saad','saad','Admin'),(2,'Sir Ali','111','Teacher'),(3,'Sir Vijay','111','Teacher'),(4,'Sir wahab','222','Teacher');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `std_id` int(11) NOT NULL AUTO_INCREMENT,
  `std_name` varchar(100) NOT NULL,
  `std_age` int(11) NOT NULL,
  `std_gender` enum('Male','Female') NOT NULL,
  `std_city` varchar(100) NOT NULL,
  `std_status` int(2) NOT NULL DEFAULT '1',
  `t_id` int(11) NOT NULL,
  `t_course` varchar(100) NOT NULL,
  `std_fees` double NOT NULL,
  `std_paid` enum('Unpaid','Paid') NOT NULL,
  PRIMARY KEY (`std_id`),
  KEY `t_id` (`t_id`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`t_id`) REFERENCES `teacher` (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `student` */

insert  into `student`(`std_id`,`std_name`,`std_age`,`std_gender`,`std_city`,`std_status`,`t_id`,`t_course`,`std_fees`,`std_paid`) values (1,'Vijay',16,'Male','Hyderabad City',1,2,'Java',3000,'Unpaid'),(2,'Wahab',18,'Male','Karachi',1,2,'Java',3000,'Unpaid'),(3,'ALiza',18,'Female','Jamshoro',1,2,'Java',3000,'Unpaid'),(4,'Amna',12,'Female','Karachi',1,3,'PHP',4000,'Unpaid');

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_name` varchar(100) NOT NULL,
  `t_gender` enum('Male','Female') NOT NULL,
  `t_age` int(11) NOT NULL,
  `t_password` varchar(100) NOT NULL,
  `t_status` int(2) NOT NULL DEFAULT '1',
  `t_list` int(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `teacher` */

insert  into `teacher`(`t_id`,`t_name`,`t_gender`,`t_age`,`t_password`,`t_status`,`t_list`) values (2,'Sir Ali','Male',23,'111',1,0),(3,'Sir Vijay','Male',21,'111',1,0),(4,'Sir wahab','Male',33,'222',1,1);

/*Table structure for table `teacher_course` */

DROP TABLE IF EXISTS `teacher_course`;

CREATE TABLE `teacher_course` (
  `t_id` int(11) NOT NULL,
  `c_id` int(11) NOT NULL,
  `status` int(2) NOT NULL DEFAULT '1',
  KEY `t_id` (`t_id`),
  KEY `c_id` (`c_id`),
  CONSTRAINT `teacher_course_ibfk_1` FOREIGN KEY (`t_id`) REFERENCES `teacher` (`t_id`),
  CONSTRAINT `teacher_course_ibfk_2` FOREIGN KEY (`c_id`) REFERENCES `course` (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `teacher_course` */

insert  into `teacher_course`(`t_id`,`c_id`,`status`) values (2,1,1),(3,2,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
