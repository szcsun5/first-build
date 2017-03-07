package com.test.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.beans.Helloword;

public class MySpringTest {
public static void main(String[] args) {
	//����spring ioc ����
	ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
	//��ȡbeanʵ��
	Helloword he =(Helloword)cxt.getBean("helloWorld");
	//����helloʵ���е�say()����
	he.say();
}
}
