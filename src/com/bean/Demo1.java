package com.bean;

public class Demo1 {
	int b=10;//全局变量，成员变量
	public static String name;
	public String sex;
	
	public static void show(){
		
		int a=10;//局部变量
		System.out.println("这是一个方法show（）");
	}
	public  void add(){
		 b=12;
		System.out.println("这是一个普通方法add（）");
	}

}
