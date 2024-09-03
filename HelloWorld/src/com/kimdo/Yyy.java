package com.kimdo;

public class Yyy {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		dog2.name = "탭댄스";
		dog2.age = 1;
		cat1.name = "단또";
		cat1.age = 2;
		
		dog1.info();
		dog2.info();
		cat1.info();
		cat2.info();
		
		int a = 3;
		float b = 1.5f;
		int c = a + (int)b;
		float d = a + b;
		System.out.println(d);
	}
}
