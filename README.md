#设计目标#
 
测试RestTemplate的超时等高级机制
	
#实现原理#

	STEP1.VM1是调用方所在电脑，VM2是被调方所在电脑
	STEP2.VM1先构造N个大数据的Bu级别的Post请求
	STEP3.VM1再构造1个小数据的Sys级别的Post请求
	STEP4.观测是否STEP3的Post请求会超时

#reference#
	
	http://stackoverflow.com/questions/9663927/java-lang-noclassdeffounderror-org-apache-http-client-httpclient
	http://www.open-open.com/lib/view/open1436018677419.html
		
