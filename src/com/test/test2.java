package com.test;

import java.util.Scanner;

import com.bean.Car;
import com.bean.TypeCar;

public class test2 {
   public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	Car  car=new Car();
	 car.name="������";
	 car.color="��ɫ";
	 System.out.println("�������ʻԱ�ж���û�г���");
	 car.type=input.next();
	 car.type();
	TypeCar tcar=new TypeCar();
	if(car.type.equals("û��")){
		tcar.type(car);
	}
	 
}
}
