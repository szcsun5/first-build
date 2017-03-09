package com.test.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.beans.Car;
import com.test.beans.Helloword;
import com.test.beans.Person;

public class MySpringTest {
public static void main(String[] args) {
	//����spring ioc ����
//ClassPathXmlApplicationContext��ApplicationContext�ӿڵ�һ��ʵ���࣬�����
	ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
	//��ȡbeanʵ��
	Helloword he =(Helloword)cxt.getBean("helloWorld");
	//����helloʵ���е�say()����
	he.say();
	Car car =(Car)cxt.getBean("car");
	car.say();
	Person person =(Person) cxt.getBean("person5");
	
	//person.getCar().setCrop("dazhong");
	System.out.println(person);
	System.out.println(person.getCar());
}
}
