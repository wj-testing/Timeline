CREATE DATABASE `timeline` DEFAULT CHARACTER SET utf8;


USE `timeline`;

DROP TABLE IF EXISTS `message`;
CREATE table message(
message_id int UNSIGNED NOT NULL AUTO_INCREMENT,
user_id CHAR(20) NOT NULL DEFAULT "U",
time DATETIME ,
context CHAR(255) NOT NULL DEFAULT "U",
PRIMARY KEY(message_id)
);

INSERT INTO message VALUES (1,'姜老师','2019-10-12 13:20:45','蚂蚁总体来说还不错，接下来我们在线发牌。');
INSERT INTO message VALUES(2,'孙老师','2019-10-14 10:45:11','开发其实很快乐，就是要熬夜罢了。');
INSERT INTO message VALUES(3,'蔡老师','2017-1-12 9:20:34','74LS138、CMOS门电路，这些都要掌握。');
INSERT INTO message VALUES(4,'全老师','2018-12-24 11:59:59','同学们这个是最基础的，没有什么讨价还价的哈。');
INSERT INTO message VALUES(5,'さかな先生','2018-10-7 8:45:11','さかな先生はセクターな先生です');
INSERT INTO message VALUES(6,'宫老师','2019-4-9 11:22:11','我们稍微布置一点简单的练习，量不是很多。');
INSERT INTO message VALUES(7,'何老师','2019-9-8 13:10:11','我想问问同学们为什么不选卜老师的算法课呢？');
INSERT INTO message VALUES(8,'赵老师','2019-9-15 11:10:20','阅读英文文献是我们应该具备的能力，大家先回去读两篇论文。');
INSERT INTO message VALUES(9,'高老师','2019-6-2 13:22:53','这个项目也没什么要求，基本上能动就行，随便几个人一组随便做什么。');
INSERT INTO message VALUES(10,'我',NOW(),'我太难了');



