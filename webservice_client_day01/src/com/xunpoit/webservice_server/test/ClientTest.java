package com.xunpoit.webservice_server.test;

import com.xunpoit.webservice_server.HelloWebServiceImpl;
import com.xunpoit.webservice_server.HelloWebServiceImplService;

public class ClientTest {

	public static void main(String[] args) {
		HelloWebServiceImplService factory=new HelloWebServiceImplService();
		HelloWebServiceImpl port = factory.getHelloWebServiceImplPort();
		String sayHello = port.sayHello("xunpoit.com");
		System.out.println("客户端调用服务成功返回:"+sayHello);
	}

}
