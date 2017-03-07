package com.test.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.beans.Helloword;

public class MySpringTest {
public static void main(String[] args) {
	//创建spring ioc 容器
	ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
	//获取bean实例
	Helloword he =(Helloword)cxt.getBean("helloWorld");
	//调用hello实例中的say()方法
	he.say();
}
}
