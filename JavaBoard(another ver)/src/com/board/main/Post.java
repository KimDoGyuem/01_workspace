package com.board.main;

public class Post {
	String title;
	String content;
	String writer;
	int no;
	
	public Post(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	void info() {
		String s = String.format("글번호:%s 제목:%s 글쓴이:%s",no,title,writer);
		System.out.println(s);
		String s1 = String.format("내용:%s",content);
		System.out.println(s1);
	}
	void infoForRead() {
		String s = String.format("글번호:%s 제목:%s 글쓴이:%s",no,title,writer);
		System.out.println(s);
		String s1 = String.format("내용:%s",content);
		System.out.println(s1);
	}
}