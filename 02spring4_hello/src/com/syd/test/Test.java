package com.syd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syd.bean.Hello;

public class Test {
	public static void main(String[] args) {
		//解析beans.xml文件     生成对应的对象
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		Hello hello =(Hello) applicationContext.getBean("hello");
	    hello.show();
	}
}
