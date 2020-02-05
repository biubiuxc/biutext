package com.bean;

public class TypeCar {
public String tname;
public String address;
public void  type(Car c){
	System.out.println("将"+c.name+"拖进汽车修理厂，正在修理");
	System.out.println("将"+c.name+"更换车轮，完成修理");
	System.out.println("将"+c.name+"开走");
}
}
