INSERT INTO `role` (`id`, `name`, `remark`, `create_time`, `update_time`)
VALUES
	(1,'ADMIN','test','2015-09-12 21:54:37','2015-09-12 21:54:37'),
	(2,'CUSTOMER','test','2015-09-12 21:54:37','2015-09-12 21:54:37'),
	(3,'OWNER','test','2015-09-12 21:54:37','2015-09-12 21:54:37');


INSERT INTO `system_params` (`id`, `param_name`, `param_value`, `create_time`, `update_time`, `is_active`, `param_type`)
VALUES
	(6,'ACCESS_KEY','uULnZMm1uQxxxxxxtDmM0Jwadx','2015-10-06 21:19:26','2015-10-06 21:19:26',1,'QINIU_PUBLIC_PARAM'),
	(7,'SECRET_KEY','DzMei8hxxxxxxcZSCDeyTgIudZ','2015-10-06 21:19:26','2015-10-06 21:19:26',1,'QINIU_PUBLIC_PARAM'),
	(8,'QINIU_DOMAIN_URL','http://7xnjli.com1.z0.glb.clouddn.com/','2015-10-06 21:19:26','2015-10-06 21:19:26',1,'QINIU_PUBLIC_PARAM'),
	(9,'BUCKET','avatar','2015-10-06 21:19:26','2015-10-06 21:19:26',1,'QINIU_PUBLIC_PARAM'),
	(10,'CALLBACK_URL','http://wtest.daiguanwang.com/api/qiniuattach','2015-10-06 21:19:26','2015-10-06 21:19:26',1,'QINIU_PUBLIC_PARAM'),
	(11,'ACCESS_KEY','CXh2YKSbxxxxxRHc-kmOA','2015-10-06 21:19:26','2015-10-06 21:19:26',1,'QINIU_SECRET_PARAM'),
	(12,'SECRET_KEY','mi2HEVqxxxxx7p4bSp','2015-10-06 21:19:26','2015-10-06 21:19:26',1,'QINIU_SECRET_PARAM'),
	(13,'QINIU_DOMAIN_URL','http://7xijbo.com1.z0.glb.clouddn.com/','2015-10-06 21:19:26','2015-10-06 21:19:26',1,'QINIU_SECRET_PARAM'),
	(14,'BUCKET','cityanimal','2015-10-06 21:19:26','2015-10-06 21:19:26',1,'QINIU_SECRET_PARAM'),
	(15,'CALLBACK_URL','http://wtest.daiguanwang.com/api/qiniuattach','2015-10-06 21:19:26','2015-10-06 21:19:26',1,'QINIU_SECRET_PARAM'),
	(16,'INVITATION_CONSTANT','false','2015-10-06 21:19:26','2015-10-06 21:19:26',1,'SYSTEM_CONFIG'),
	(17,'REGISTER_INVITATION_NUMBER','5','2015-11-01 00:02:40','2015-11-03 19:41:16',1,'SYSTEM_CONFIG'),
	(18,'BAD_LOAN_DAY','90','2015-11-01 00:02:40','2015-11-01 00:02:40',1,'LOAN_CONFIG'),
	(19,'OVER_DUE_DAY','30','2015-11-01 00:02:40','2015-11-01 00:02:40',1,'LOAN_CONFIG'),
	(20,'GLOBAL_NOTIFICATION_TEXT','尊敬的用户，贷管网目前处于测试阶段，部分功能尚不稳定，请谅解。也可联系邮箱 <a href=\"mailto:support@xiaoguotech.com\">support@xiaoguotech.com</a>提出您的宝贵意见。','2015-11-01 00:02:40','2015-11-01 00:02:40',1,'SYSTEM_CONFIG'),
	(21,'GLOBAL_NOTIFICATION_OPTION','false','2015-11-01 00:02:40','2015-11-01 00:02:40',1,'SYSTEM_CONFIG'),
	(23,'LOAN_SMS_OPTION','true','2015-11-17 12:50:58','2015-11-17 12:50:58',1,'LOAN_SMS_OPTION'),
	(24,'LOAN_SMS_TEMPLATE','你好，您有一笔贷款还有 [day] 天就要还款了，请尽快处理，以免带来不必要的麻烦!','2015-11-17 12:50:58','2015-11-17 12:50:58',1,'LOAN_SMS_OPTION'),
	(27,'WECHAT','beaxxxxxe6xx5b','2015-11-01 00:02:40','2015-11-01 00:02:40',1,'SOCIAL_ACCOUNT_SECRET'),
	(28,'WECHAT','wx3904xxxxx24f7','2015-11-01 00:02:40','2015-11-01 00:02:40',1,'SOCIAL_ACCOUNT_APP_ID'),
	(30,'LOAN_SMS_OPTION','false','2015-11-17 12:50:58','2015-11-17 12:50:58',1,'LOAN_SMS_OPTION'),
	(31,'WECHAT','http://www.daiguanwang.com/api/social_auth','2015-11-17 12:50:58','2015-11-17 12:50:58',1,'SOCIAL_ACCOUNT_AUTH_URL'),
	(32,'QQ','xxxxxxx','2015-11-01 00:02:40','2015-11-01 00:02:40',1,'SOCIAL_ACCOUNT_SECRET'),
	(33,'QQ','101295466','2015-11-01 00:02:40','2015-11-01 00:02:40',1,'SOCIAL_ACCOUNT_APP_ID'),
	(34,'QQ','http://www.daiguanwang.com/api/social_auth','2015-11-17 12:50:58','2015-11-17 12:50:58',1,'SOCIAL_ACCOUNT_AUTH_URL'),
	(35,'SOCIAL_AUTH_URL','http://www.daiguanwang.com/#/social_auth','2015-11-17 12:50:58','2015-11-17 12:50:58',1,'SOCIAL_CONFIG'),
	(36,'SMS_REGISTER_LIMIT','5','2016-03-09 00:02:40','2016-03-09 00:02:40',1,'ACCOUNT_SMS_OPTION'),
	(37,'SMS_REGISTER_OPTION','true','2016-03-09 00:02:40','2016-03-09 00:02:40',1,'ACCOUNT_SMS_OPTION'),
	(38,'SMS_RESET_PASSWORD_LIMIT','5','2016-03-09 00:02:40','2016-03-09 00:02:40',1,'ACCOUNT_SMS_OPTION'),
	(39,'SMS_RESET_PASSWORD_OPTION','true','2016-03-09 00:02:40','2016-03-09 00:02:40',1,'ACCOUNT_SMS_OPTION'),
	(40,'SMS_RESET_MOBILE_LIMIT','5','2016-03-09 00:02:40','2016-03-09 00:02:40',1,'ACCOUNT_SMS_OPTION'),
	(41,'SMS_RESET_MOBILE_OPTION','true','2016-03-09 00:02:40','2016-03-09 00:02:40',1,'ACCOUNT_SMS_OPTION'),
	(42,'WECHATMOBILE','xxxxx','2015-11-01 00:02:40','2015-11-01 00:02:40',1,'SOCIAL_ACCOUNT_SECRET'),
	(43,'WECHATMOBILE','xxxxxx','2015-11-01 00:02:40','2015-11-01 00:02:40',1,'SOCIAL_ACCOUNT_APP_ID'),
	(44,'WECHATMOBILE','http://www.daiguanwang.com/api/social_auth','2015-11-17 12:50:58','2015-11-17 12:50:58',1,'SOCIAL_ACCOUNT_AUTH_URL'),
	(45,'DEFAULT','5','2015-11-17 12:50:58','2015-11-17 12:50:58',1,'WORKSPACE_OWNER_MAXIMUM'),
	(46,'invitationUrl','http://wtest.daiguanwang.com/#/invitation','2015-11-17 12:50:58','2015-11-17 12:50:58',1,'DEFAULT'),
	(47,'QQMOBILE','iIXxxx7AWv50d','2015-11-01 00:02:40','2015-11-01 00:02:40',1,'SOCIAL_ACCOUNT_SECRET'),
	(48,'QQMOBILE','xxxxxx','2015-11-01 00:02:40','2015-11-01 00:02:40',1,'SOCIAL_ACCOUNT_APP_ID'),
	(49,'QQMOBILE','http://www.daiguanwang.com/api/social_auth','2015-11-17 12:50:58','2015-11-17 12:50:58',1,'SOCIAL_ACCOUNT_AUTH_URL');


