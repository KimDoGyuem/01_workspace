package com.peisia.c.util;

/* 컬러 코드 by 임상현, sm.ahn */

/*
 *	사용법 : ex. RED + 문자열 + EXIT
 */

//콘솔 출력되는 글자 색 변경

public class Color {
	
	public static final String BLACK = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";

	public static final String EXIT = "\u001B[0m";
	
	static public void black(String s) {	System.out.println(BLACK+s+EXIT);		}
	static public void red(String s) {	System.out.println(RED+s+EXIT);		}
	static public void green(String s) {	System.out.println(GREEN+s+EXIT);		}
	static public void yellow(String s) {	System.out.println(YELLOW+s+EXIT);		}
	static public void blue(String s) {	System.out.println(BLUE+s+EXIT);		}
	static public void purple(String s) {	System.out.println(PURPLE+s+EXIT);		}
	static public void cyan(String s) {	System.out.println(CYAN+s+EXIT);		}
	static public void white(String s) {	System.out.println(WHITE+s+EXIT);		}

//	public static void main(String[] args) {
//		String colors[] = new String[8];
//
//		for (int i = 0; i < 8; i++) {
//			colors[i] = "\u001B[3" + i + "m";
//		}
//
//		try {
//			while (true) {
//				int ran = (int) (Math.random() * 8);
//				String s = "AAAAAAAAAAAAAAAAAA";
//
//				System.out.println(colors[ran] + s + exit);
//
//				Thread.sleep(100);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
