package com.HashSet.lotto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		int r = 0;
		while(true) {
			r = (int)(Math.random()*45+1);
			hs.add(r);
			if(hs.size() == 6) {
				break;
			}
		}
		
//		TreeSet<Integer> ts = new TreeSet<>(); //이진 탐색 트리 구조
//		ts.addAll(hs);
		
		Iterator<Integer> it = hs.iterator();
		System.out.println("-while, next() 으로 꺼내기-");
		while(it.hasNext()) {
			int s = it.next();
			System.out.print(s + " ");
		}		
	}
}

