package com.test.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.beans.Car;
import com.test.beans.Helloword;
import com.test.beans.Person;

public class MySpringTest {
public static void main(String[] args) {
	//创建spring ioc 容器
//ClassPathXmlApplicationContext是ApplicationContext接口的一个实现类，该类从
	ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
	//获取bean实例
	Helloword he =(Helloword)cxt.getBean("helloWorld");
	//调用hello实例中的say()方法
	he.say();
	Car car =(Car)cxt.getBean("car");
	car.say();
	Person person =(Person) cxt.getBean("person5");
	
	//person.getCar().setCrop("dazhong");
	System.out.println(person);
	System.out.println(person.getCar());
}
}
