package com.syd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syd.bean.Hello;

public class Test {
	public static void main(String[] args) {
		//����beans.xml�ļ�     ���ɶ�Ӧ�Ķ���
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		Hello hello =(Hello) applicationContext.getBean("hello");
	    hello.show();
	}
}
