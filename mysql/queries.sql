create database sourChat;

use sourChat;

 CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `organization` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;



insert into user (firstname, lastname, phone, username, organization) values ("Ranjeet","Borate","+917276400180","ranjeetborate","NA");
insert into user (firstname, lastname, phone, username, organization) values ("Karan","Borate","+917776833558","karanborate","NA");
