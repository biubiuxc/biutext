package com.test;

import java.util.Scanner;

import com.bean.Car;
import com.bean.TypeCar;

public class test2 {
   public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	Car  car=new Car();
	 car.name="法拉利";
	 car.color="黄色";
	 System.out.println("请输入驾驶员判断有没有车轮");
	 car.type=input.next();
	 car.type();
	TypeCar tcar=new TypeCar();
	if(car.type.equals("没有")){
		tcar.type(car);
	}
	 
}
}
