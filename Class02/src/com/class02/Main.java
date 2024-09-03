package com.class02;

public class Main {
	public static void main(String[] args) {
		int random = Dice.roll(6);
		System.out.println(random);
		
		Dice a = new Dice();
		int b = a.roll(3);
		System.out.println(b);
		a.x();
	}
}
